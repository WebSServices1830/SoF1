/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.exceptions.NonexistentEntityException;
import controllers.exceptions.PreexistingEntityException;
import entities.Monoplaza;
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
public class MonoplazaJpaController implements Serializable {

    public MonoplazaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Monoplaza monoplaza) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(monoplaza);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findMonoplaza(monoplaza.getIdmonoplaza()) != null) {
                throw new PreexistingEntityException("Monoplaza " + monoplaza + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Monoplaza monoplaza) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            monoplaza = em.merge(monoplaza);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = monoplaza.getIdmonoplaza();
                if (findMonoplaza(id) == null) {
                    throw new NonexistentEntityException("The monoplaza with id " + id + " no longer exists.");
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
            Monoplaza monoplaza;
            try {
                monoplaza = em.getReference(Monoplaza.class, id);
                monoplaza.getIdmonoplaza();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The monoplaza with id " + id + " no longer exists.", enfe);
            }
            em.remove(monoplaza);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Monoplaza> findMonoplazaEntities() {
        return findMonoplazaEntities(true, -1, -1);
    }

    public List<Monoplaza> findMonoplazaEntities(int maxResults, int firstResult) {
        return findMonoplazaEntities(false, maxResults, firstResult);
    }

    private List<Monoplaza> findMonoplazaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Monoplaza.class));
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

    public Monoplaza findMonoplaza(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Monoplaza.class, id);
        } finally {
            em.close();
        }
    }

    public int getMonoplazaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Monoplaza> rt = cq.from(Monoplaza.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
