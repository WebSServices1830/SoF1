/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.exceptions.NonexistentEntityException;
import controllers.exceptions.PreexistingEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entities.Piloto;
import entities.Resultadopractica;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Michael
 */
public class ResultadopracticaJpaController implements Serializable {

    public ResultadopracticaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Resultadopractica resultadopractica) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Piloto pilotoIdpiloto = resultadopractica.getPilotoIdpiloto();
            if (pilotoIdpiloto != null) {
                pilotoIdpiloto = em.getReference(pilotoIdpiloto.getClass(), pilotoIdpiloto.getIdpiloto());
                resultadopractica.setPilotoIdpiloto(pilotoIdpiloto);
            }
            em.persist(resultadopractica);
            if (pilotoIdpiloto != null) {
                pilotoIdpiloto.getResultadopracticaList().add(resultadopractica);
                pilotoIdpiloto = em.merge(pilotoIdpiloto);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findResultadopractica(resultadopractica.getIdresultado()) != null) {
                throw new PreexistingEntityException("Resultadopractica " + resultadopractica + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Resultadopractica resultadopractica) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Resultadopractica persistentResultadopractica = em.find(Resultadopractica.class, resultadopractica.getIdresultado());
            Piloto pilotoIdpilotoOld = persistentResultadopractica.getPilotoIdpiloto();
            Piloto pilotoIdpilotoNew = resultadopractica.getPilotoIdpiloto();
            if (pilotoIdpilotoNew != null) {
                pilotoIdpilotoNew = em.getReference(pilotoIdpilotoNew.getClass(), pilotoIdpilotoNew.getIdpiloto());
                resultadopractica.setPilotoIdpiloto(pilotoIdpilotoNew);
            }
            resultadopractica = em.merge(resultadopractica);
            if (pilotoIdpilotoOld != null && !pilotoIdpilotoOld.equals(pilotoIdpilotoNew)) {
                pilotoIdpilotoOld.getResultadopracticaList().remove(resultadopractica);
                pilotoIdpilotoOld = em.merge(pilotoIdpilotoOld);
            }
            if (pilotoIdpilotoNew != null && !pilotoIdpilotoNew.equals(pilotoIdpilotoOld)) {
                pilotoIdpilotoNew.getResultadopracticaList().add(resultadopractica);
                pilotoIdpilotoNew = em.merge(pilotoIdpilotoNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = resultadopractica.getIdresultado();
                if (findResultadopractica(id) == null) {
                    throw new NonexistentEntityException("The resultadopractica with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Resultadopractica resultadopractica;
            try {
                resultadopractica = em.getReference(Resultadopractica.class, id);
                resultadopractica.getIdresultado();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The resultadopractica with id " + id + " no longer exists.", enfe);
            }
            Piloto pilotoIdpiloto = resultadopractica.getPilotoIdpiloto();
            if (pilotoIdpiloto != null) {
                pilotoIdpiloto.getResultadopracticaList().remove(resultadopractica);
                pilotoIdpiloto = em.merge(pilotoIdpiloto);
            }
            em.remove(resultadopractica);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Resultadopractica> findResultadopracticaEntities() {
        return findResultadopracticaEntities(true, -1, -1);
    }

    public List<Resultadopractica> findResultadopracticaEntities(int maxResults, int firstResult) {
        return findResultadopracticaEntities(false, maxResults, firstResult);
    }

    private List<Resultadopractica> findResultadopracticaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Resultadopractica.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Resultadopractica findResultadopractica(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Resultadopractica.class, id);
        } finally {
            em.close();
        }
    }

    public int getResultadopracticaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Resultadopractica> rt = cq.from(Resultadopractica.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
