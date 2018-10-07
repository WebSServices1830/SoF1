/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.exceptions.NonexistentEntityException;
import controllers.exceptions.PreexistingEntityException;
import entities.Campeonato;
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
public class CampeonatoJpaController implements Serializable {

    public CampeonatoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Campeonato campeonato) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(campeonato);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCampeonato(campeonato.getNombre()) != null) {
                throw new PreexistingEntityException("Campeonato " + campeonato + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Campeonato campeonato) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            campeonato = em.merge(campeonato);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = campeonato.getNombre();
                if (findCampeonato(id) == null) {
                    throw new NonexistentEntityException("The campeonato with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Campeonato campeonato;
            try {
                campeonato = em.getReference(Campeonato.class, id);
                campeonato.getNombre();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The campeonato with id " + id + " no longer exists.", enfe);
            }
            em.remove(campeonato);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Campeonato> findCampeonatoEntities() {
        return findCampeonatoEntities(true, -1, -1);
    }

    public List<Campeonato> findCampeonatoEntities(int maxResults, int firstResult) {
        return findCampeonatoEntities(false, maxResults, firstResult);
    }

    private List<Campeonato> findCampeonatoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Campeonato.class));
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

    public Campeonato findCampeonato(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Campeonato.class, id);
        } finally {
            em.close();
        }
    }

    public int getCampeonatoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Campeonato> rt = cq.from(Campeonato.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
