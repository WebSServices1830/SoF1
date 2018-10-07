/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.exceptions.NonexistentEntityException;
import controllers.exceptions.PreexistingEntityException;
import entities.Escuderia;
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
public class EscuderiaJpaController implements Serializable {

    public EscuderiaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Escuderia escuderia) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(escuderia);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findEscuderia(escuderia.getIdescuderia()) != null) {
                throw new PreexistingEntityException("Escuderia " + escuderia + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Escuderia escuderia) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            escuderia = em.merge(escuderia);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = escuderia.getIdescuderia();
                if (findEscuderia(id) == null) {
                    throw new NonexistentEntityException("The escuderia with id " + id + " no longer exists.");
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
            Escuderia escuderia;
            try {
                escuderia = em.getReference(Escuderia.class, id);
                escuderia.getIdescuderia();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The escuderia with id " + id + " no longer exists.", enfe);
            }
            em.remove(escuderia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Escuderia> findEscuderiaEntities() {
        return findEscuderiaEntities(true, -1, -1);
    }

    public List<Escuderia> findEscuderiaEntities(int maxResults, int firstResult) {
        return findEscuderiaEntities(false, maxResults, firstResult);
    }

    private List<Escuderia> findEscuderiaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Escuderia.class));
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

    public Escuderia findEscuderia(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Escuderia.class, id);
        } finally {
            em.close();
        }
    }

    public int getEscuderiaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Escuderia> rt = cq.from(Escuderia.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
