/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.exceptions.NonexistentEntityException;
import controllers.exceptions.PreexistingEntityException;
import entities.Circuito;
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
public class CircuitoJpaController implements Serializable {

    public CircuitoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Circuito circuito) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(circuito);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCircuito(circuito.getIdcircuito()) != null) {
                throw new PreexistingEntityException("Circuito " + circuito + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Circuito circuito) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            circuito = em.merge(circuito);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = circuito.getIdcircuito();
                if (findCircuito(id) == null) {
                    throw new NonexistentEntityException("The circuito with id " + id + " no longer exists.");
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
            Circuito circuito;
            try {
                circuito = em.getReference(Circuito.class, id);
                circuito.getIdcircuito();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The circuito with id " + id + " no longer exists.", enfe);
            }
            em.remove(circuito);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Circuito> findCircuitoEntities() {
        return findCircuitoEntities(true, -1, -1);
    }

    public List<Circuito> findCircuitoEntities(int maxResults, int firstResult) {
        return findCircuitoEntities(false, maxResults, firstResult);
    }

    private List<Circuito> findCircuitoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Circuito.class));
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

    public Circuito findCircuito(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Circuito.class, id);
        } finally {
            em.close();
        }
    }

    public int getCircuitoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Circuito> rt = cq.from(Circuito.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
