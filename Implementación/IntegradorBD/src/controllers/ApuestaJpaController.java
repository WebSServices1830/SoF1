/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.exceptions.NonexistentEntityException;
import controllers.exceptions.PreexistingEntityException;
import entities.Apuesta;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entities.Piloto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Michael
 */
public class ApuestaJpaController implements Serializable {

    public ApuestaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Apuesta apuesta) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Piloto pilotoIdpiloto = apuesta.getPilotoIdpiloto();
            if (pilotoIdpiloto != null) {
                pilotoIdpiloto = em.getReference(pilotoIdpiloto.getClass(), pilotoIdpiloto.getIdpiloto());
                apuesta.setPilotoIdpiloto(pilotoIdpiloto);
            }
            em.persist(apuesta);
            if (pilotoIdpiloto != null) {
                pilotoIdpiloto.getApuestaList().add(apuesta);
                pilotoIdpiloto = em.merge(pilotoIdpiloto);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findApuesta(apuesta.getIdapuesta()) != null) {
                throw new PreexistingEntityException("Apuesta " + apuesta + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Apuesta apuesta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Apuesta persistentApuesta = em.find(Apuesta.class, apuesta.getIdapuesta());
            Piloto pilotoIdpilotoOld = persistentApuesta.getPilotoIdpiloto();
            Piloto pilotoIdpilotoNew = apuesta.getPilotoIdpiloto();
            if (pilotoIdpilotoNew != null) {
                pilotoIdpilotoNew = em.getReference(pilotoIdpilotoNew.getClass(), pilotoIdpilotoNew.getIdpiloto());
                apuesta.setPilotoIdpiloto(pilotoIdpilotoNew);
            }
            apuesta = em.merge(apuesta);
            if (pilotoIdpilotoOld != null && !pilotoIdpilotoOld.equals(pilotoIdpilotoNew)) {
                pilotoIdpilotoOld.getApuestaList().remove(apuesta);
                pilotoIdpilotoOld = em.merge(pilotoIdpilotoOld);
            }
            if (pilotoIdpilotoNew != null && !pilotoIdpilotoNew.equals(pilotoIdpilotoOld)) {
                pilotoIdpilotoNew.getApuestaList().add(apuesta);
                pilotoIdpilotoNew = em.merge(pilotoIdpilotoNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = apuesta.getIdapuesta();
                if (findApuesta(id) == null) {
                    throw new NonexistentEntityException("The apuesta with id " + id + " no longer exists.");
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
            Apuesta apuesta;
            try {
                apuesta = em.getReference(Apuesta.class, id);
                apuesta.getIdapuesta();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The apuesta with id " + id + " no longer exists.", enfe);
            }
            Piloto pilotoIdpiloto = apuesta.getPilotoIdpiloto();
            if (pilotoIdpiloto != null) {
                pilotoIdpiloto.getApuestaList().remove(apuesta);
                pilotoIdpiloto = em.merge(pilotoIdpiloto);
            }
            em.remove(apuesta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Apuesta> findApuestaEntities() {
        return findApuestaEntities(true, -1, -1);
    }

    public List<Apuesta> findApuestaEntities(int maxResults, int firstResult) {
        return findApuestaEntities(false, maxResults, firstResult);
    }

    private List<Apuesta> findApuestaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Apuesta.class));
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

    public Apuesta findApuesta(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Apuesta.class, id);
        } finally {
            em.close();
        }
    }

    public int getApuestaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Apuesta> rt = cq.from(Apuesta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
