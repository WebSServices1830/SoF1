/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.exceptions.NonexistentEntityException;
import controllers.exceptions.PreexistingEntityException;
import entities.Resultadoclasificacion;
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
public class ResultadoclasificacionJpaController implements Serializable {

    public ResultadoclasificacionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Resultadoclasificacion resultadoclasificacion) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(resultadoclasificacion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findResultadoclasificacion(resultadoclasificacion.getIdresultado()) != null) {
                throw new PreexistingEntityException("Resultadoclasificacion " + resultadoclasificacion + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Resultadoclasificacion resultadoclasificacion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            resultadoclasificacion = em.merge(resultadoclasificacion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = resultadoclasificacion.getIdresultado();
                if (findResultadoclasificacion(id) == null) {
                    throw new NonexistentEntityException("The resultadoclasificacion with id " + id + " no longer exists.");
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
            Resultadoclasificacion resultadoclasificacion;
            try {
                resultadoclasificacion = em.getReference(Resultadoclasificacion.class, id);
                resultadoclasificacion.getIdresultado();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The resultadoclasificacion with id " + id + " no longer exists.", enfe);
            }
            em.remove(resultadoclasificacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Resultadoclasificacion> findResultadoclasificacionEntities() {
        return findResultadoclasificacionEntities(true, -1, -1);
    }

    public List<Resultadoclasificacion> findResultadoclasificacionEntities(int maxResults, int firstResult) {
        return findResultadoclasificacionEntities(false, maxResults, firstResult);
    }

    private List<Resultadoclasificacion> findResultadoclasificacionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Resultadoclasificacion.class));
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

    public Resultadoclasificacion findResultadoclasificacion(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Resultadoclasificacion.class, id);
        } finally {
            em.close();
        }
    }

    public int getResultadoclasificacionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Resultadoclasificacion> rt = cq.from(Resultadoclasificacion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
