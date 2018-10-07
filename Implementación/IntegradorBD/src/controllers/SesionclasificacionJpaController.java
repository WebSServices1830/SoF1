/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.exceptions.NonexistentEntityException;
import controllers.exceptions.PreexistingEntityException;
import entities.Sesionclasificacion;
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
public class SesionclasificacionJpaController implements Serializable {

    public SesionclasificacionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Sesionclasificacion sesionclasificacion) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(sesionclasificacion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findSesionclasificacion(sesionclasificacion.getIdsesion()) != null) {
                throw new PreexistingEntityException("Sesionclasificacion " + sesionclasificacion + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Sesionclasificacion sesionclasificacion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            sesionclasificacion = em.merge(sesionclasificacion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = sesionclasificacion.getIdsesion();
                if (findSesionclasificacion(id) == null) {
                    throw new NonexistentEntityException("The sesionclasificacion with id " + id + " no longer exists.");
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
            Sesionclasificacion sesionclasificacion;
            try {
                sesionclasificacion = em.getReference(Sesionclasificacion.class, id);
                sesionclasificacion.getIdsesion();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The sesionclasificacion with id " + id + " no longer exists.", enfe);
            }
            em.remove(sesionclasificacion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Sesionclasificacion> findSesionclasificacionEntities() {
        return findSesionclasificacionEntities(true, -1, -1);
    }

    public List<Sesionclasificacion> findSesionclasificacionEntities(int maxResults, int firstResult) {
        return findSesionclasificacionEntities(false, maxResults, firstResult);
    }

    private List<Sesionclasificacion> findSesionclasificacionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Sesionclasificacion.class));
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

    public Sesionclasificacion findSesionclasificacion(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Sesionclasificacion.class, id);
        } finally {
            em.close();
        }
    }

    public int getSesionclasificacionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Sesionclasificacion> rt = cq.from(Sesionclasificacion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
