/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.exceptions.NonexistentEntityException;
import controllers.exceptions.PreexistingEntityException;
import entities.Sesioncarrera;
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
public class SesioncarreraJpaController implements Serializable {

    public SesioncarreraJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Sesioncarrera sesioncarrera) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(sesioncarrera);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findSesioncarrera(sesioncarrera.getIdsesion()) != null) {
                throw new PreexistingEntityException("Sesioncarrera " + sesioncarrera + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Sesioncarrera sesioncarrera) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            sesioncarrera = em.merge(sesioncarrera);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = sesioncarrera.getIdsesion();
                if (findSesioncarrera(id) == null) {
                    throw new NonexistentEntityException("The sesioncarrera with id " + id + " no longer exists.");
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
            Sesioncarrera sesioncarrera;
            try {
                sesioncarrera = em.getReference(Sesioncarrera.class, id);
                sesioncarrera.getIdsesion();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The sesioncarrera with id " + id + " no longer exists.", enfe);
            }
            em.remove(sesioncarrera);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Sesioncarrera> findSesioncarreraEntities() {
        return findSesioncarreraEntities(true, -1, -1);
    }

    public List<Sesioncarrera> findSesioncarreraEntities(int maxResults, int firstResult) {
        return findSesioncarreraEntities(false, maxResults, firstResult);
    }

    private List<Sesioncarrera> findSesioncarreraEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Sesioncarrera.class));
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

    public Sesioncarrera findSesioncarrera(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Sesioncarrera.class, id);
        } finally {
            em.close();
        }
    }

    public int getSesioncarreraCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Sesioncarrera> rt = cq.from(Sesioncarrera.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
