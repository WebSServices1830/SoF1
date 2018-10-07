/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.exceptions.NonexistentEntityException;
import controllers.exceptions.PreexistingEntityException;
import entities.Resultadocarrera;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Michael
 */
public class ResultadocarreraJpaController implements Serializable {

    public ResultadocarreraJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Resultadocarrera resultadocarrera) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(resultadocarrera);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findResultadocarrera(resultadocarrera.getIdresultado()) != null) {
                throw new PreexistingEntityException("Resultadocarrera " + resultadocarrera + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Resultadocarrera resultadocarrera) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            resultadocarrera = em.merge(resultadocarrera);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = resultadocarrera.getIdresultado();
                if (findResultadocarrera(id) == null) {
                    throw new NonexistentEntityException("The resultadocarrera with id " + id + " no longer exists.");
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
            Resultadocarrera resultadocarrera;
            try {
                resultadocarrera = em.getReference(Resultadocarrera.class, id);
                resultadocarrera.getIdresultado();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The resultadocarrera with id " + id + " no longer exists.", enfe);
            }
            em.remove(resultadocarrera);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Resultadocarrera> findResultadocarreraEntities() {
        return findResultadocarreraEntities(true, -1, -1);
    }

    public List<Resultadocarrera> findResultadocarreraEntities(int maxResults, int firstResult) {
        return findResultadocarreraEntities(false, maxResults, firstResult);
    }

    private List<Resultadocarrera> findResultadocarreraEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Resultadocarrera.class));
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

    public Resultadocarrera findResultadocarrera(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Resultadocarrera.class, id);
        } finally {
            em.close();
        }
    }

    public int getResultadocarreraCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Resultadocarrera> rt = cq.from(Resultadocarrera.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
