/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.exceptions.NonexistentEntityException;
import controllers.exceptions.PreexistingEntityException;
import entities.Sesionpractica;
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
public class SesionpracticaJpaController implements Serializable {

    public SesionpracticaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Sesionpractica sesionpractica) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(sesionpractica);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findSesionpractica(sesionpractica.getIdsesion()) != null) {
                throw new PreexistingEntityException("Sesionpractica " + sesionpractica + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Sesionpractica sesionpractica) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            sesionpractica = em.merge(sesionpractica);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = sesionpractica.getIdsesion();
                if (findSesionpractica(id) == null) {
                    throw new NonexistentEntityException("The sesionpractica with id " + id + " no longer exists.");
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
            Sesionpractica sesionpractica;
            try {
                sesionpractica = em.getReference(Sesionpractica.class, id);
                sesionpractica.getIdsesion();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The sesionpractica with id " + id + " no longer exists.", enfe);
            }
            em.remove(sesionpractica);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Sesionpractica> findSesionpracticaEntities() {
        return findSesionpracticaEntities(true, -1, -1);
    }

    public List<Sesionpractica> findSesionpracticaEntities(int maxResults, int firstResult) {
        return findSesionpracticaEntities(false, maxResults, firstResult);
    }

    private List<Sesionpractica> findSesionpracticaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Sesionpractica.class));
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

    public Sesionpractica findSesionpractica(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Sesionpractica.class, id);
        } finally {
            em.close();
        }
    }

    public int getSesionpracticaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Sesionpractica> rt = cq.from(Sesionpractica.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
