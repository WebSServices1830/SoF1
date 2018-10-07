/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.exceptions.NonexistentEntityException;
import controllers.exceptions.PreexistingEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entities.Resultadopractica;
import java.util.ArrayList;
import java.util.List;
import entities.Apuesta;
import entities.Piloto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Michael
 */
public class PilotoJpaController implements Serializable {

    public PilotoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Piloto piloto) throws PreexistingEntityException, Exception {
        if (piloto.getResultadopracticaList() == null) {
            piloto.setResultadopracticaList(new ArrayList<Resultadopractica>());
        }
        if (piloto.getApuestaList() == null) {
            piloto.setApuestaList(new ArrayList<Apuesta>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Resultadopractica> attachedResultadopracticaList = new ArrayList<Resultadopractica>();
            for (Resultadopractica resultadopracticaListResultadopracticaToAttach : piloto.getResultadopracticaList()) {
                resultadopracticaListResultadopracticaToAttach = em.getReference(resultadopracticaListResultadopracticaToAttach.getClass(), resultadopracticaListResultadopracticaToAttach.getIdresultado());
                attachedResultadopracticaList.add(resultadopracticaListResultadopracticaToAttach);
            }
            piloto.setResultadopracticaList(attachedResultadopracticaList);
            List<Apuesta> attachedApuestaList = new ArrayList<Apuesta>();
            for (Apuesta apuestaListApuestaToAttach : piloto.getApuestaList()) {
                apuestaListApuestaToAttach = em.getReference(apuestaListApuestaToAttach.getClass(), apuestaListApuestaToAttach.getIdapuesta());
                attachedApuestaList.add(apuestaListApuestaToAttach);
            }
            piloto.setApuestaList(attachedApuestaList);
            em.persist(piloto);
            for (Resultadopractica resultadopracticaListResultadopractica : piloto.getResultadopracticaList()) {
                Piloto oldPilotoIdpilotoOfResultadopracticaListResultadopractica = resultadopracticaListResultadopractica.getPilotoIdpiloto();
                resultadopracticaListResultadopractica.setPilotoIdpiloto(piloto);
                resultadopracticaListResultadopractica = em.merge(resultadopracticaListResultadopractica);
                if (oldPilotoIdpilotoOfResultadopracticaListResultadopractica != null) {
                    oldPilotoIdpilotoOfResultadopracticaListResultadopractica.getResultadopracticaList().remove(resultadopracticaListResultadopractica);
                    oldPilotoIdpilotoOfResultadopracticaListResultadopractica = em.merge(oldPilotoIdpilotoOfResultadopracticaListResultadopractica);
                }
            }
            for (Apuesta apuestaListApuesta : piloto.getApuestaList()) {
                Piloto oldPilotoIdpilotoOfApuestaListApuesta = apuestaListApuesta.getPilotoIdpiloto();
                apuestaListApuesta.setPilotoIdpiloto(piloto);
                apuestaListApuesta = em.merge(apuestaListApuesta);
                if (oldPilotoIdpilotoOfApuestaListApuesta != null) {
                    oldPilotoIdpilotoOfApuestaListApuesta.getApuestaList().remove(apuestaListApuesta);
                    oldPilotoIdpilotoOfApuestaListApuesta = em.merge(oldPilotoIdpilotoOfApuestaListApuesta);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPiloto(piloto.getIdpiloto()) != null) {
                throw new PreexistingEntityException("Piloto " + piloto + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Piloto piloto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Piloto persistentPiloto = em.find(Piloto.class, piloto.getIdpiloto());
            List<Resultadopractica> resultadopracticaListOld = persistentPiloto.getResultadopracticaList();
            List<Resultadopractica> resultadopracticaListNew = piloto.getResultadopracticaList();
            List<Apuesta> apuestaListOld = persistentPiloto.getApuestaList();
            List<Apuesta> apuestaListNew = piloto.getApuestaList();
            List<Resultadopractica> attachedResultadopracticaListNew = new ArrayList<Resultadopractica>();
            for (Resultadopractica resultadopracticaListNewResultadopracticaToAttach : resultadopracticaListNew) {
                resultadopracticaListNewResultadopracticaToAttach = em.getReference(resultadopracticaListNewResultadopracticaToAttach.getClass(), resultadopracticaListNewResultadopracticaToAttach.getIdresultado());
                attachedResultadopracticaListNew.add(resultadopracticaListNewResultadopracticaToAttach);
            }
            resultadopracticaListNew = attachedResultadopracticaListNew;
            piloto.setResultadopracticaList(resultadopracticaListNew);
            List<Apuesta> attachedApuestaListNew = new ArrayList<Apuesta>();
            for (Apuesta apuestaListNewApuestaToAttach : apuestaListNew) {
                apuestaListNewApuestaToAttach = em.getReference(apuestaListNewApuestaToAttach.getClass(), apuestaListNewApuestaToAttach.getIdapuesta());
                attachedApuestaListNew.add(apuestaListNewApuestaToAttach);
            }
            apuestaListNew = attachedApuestaListNew;
            piloto.setApuestaList(apuestaListNew);
            piloto = em.merge(piloto);
            for (Resultadopractica resultadopracticaListOldResultadopractica : resultadopracticaListOld) {
                if (!resultadopracticaListNew.contains(resultadopracticaListOldResultadopractica)) {
                    resultadopracticaListOldResultadopractica.setPilotoIdpiloto(null);
                    resultadopracticaListOldResultadopractica = em.merge(resultadopracticaListOldResultadopractica);
                }
            }
            for (Resultadopractica resultadopracticaListNewResultadopractica : resultadopracticaListNew) {
                if (!resultadopracticaListOld.contains(resultadopracticaListNewResultadopractica)) {
                    Piloto oldPilotoIdpilotoOfResultadopracticaListNewResultadopractica = resultadopracticaListNewResultadopractica.getPilotoIdpiloto();
                    resultadopracticaListNewResultadopractica.setPilotoIdpiloto(piloto);
                    resultadopracticaListNewResultadopractica = em.merge(resultadopracticaListNewResultadopractica);
                    if (oldPilotoIdpilotoOfResultadopracticaListNewResultadopractica != null && !oldPilotoIdpilotoOfResultadopracticaListNewResultadopractica.equals(piloto)) {
                        oldPilotoIdpilotoOfResultadopracticaListNewResultadopractica.getResultadopracticaList().remove(resultadopracticaListNewResultadopractica);
                        oldPilotoIdpilotoOfResultadopracticaListNewResultadopractica = em.merge(oldPilotoIdpilotoOfResultadopracticaListNewResultadopractica);
                    }
                }
            }
            for (Apuesta apuestaListOldApuesta : apuestaListOld) {
                if (!apuestaListNew.contains(apuestaListOldApuesta)) {
                    apuestaListOldApuesta.setPilotoIdpiloto(null);
                    apuestaListOldApuesta = em.merge(apuestaListOldApuesta);
                }
            }
            for (Apuesta apuestaListNewApuesta : apuestaListNew) {
                if (!apuestaListOld.contains(apuestaListNewApuesta)) {
                    Piloto oldPilotoIdpilotoOfApuestaListNewApuesta = apuestaListNewApuesta.getPilotoIdpiloto();
                    apuestaListNewApuesta.setPilotoIdpiloto(piloto);
                    apuestaListNewApuesta = em.merge(apuestaListNewApuesta);
                    if (oldPilotoIdpilotoOfApuestaListNewApuesta != null && !oldPilotoIdpilotoOfApuestaListNewApuesta.equals(piloto)) {
                        oldPilotoIdpilotoOfApuestaListNewApuesta.getApuestaList().remove(apuestaListNewApuesta);
                        oldPilotoIdpilotoOfApuestaListNewApuesta = em.merge(oldPilotoIdpilotoOfApuestaListNewApuesta);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = piloto.getIdpiloto();
                if (findPiloto(id) == null) {
                    throw new NonexistentEntityException("The piloto with id " + id + " no longer exists.");
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
            Piloto piloto;
            try {
                piloto = em.getReference(Piloto.class, id);
                piloto.getIdpiloto();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The piloto with id " + id + " no longer exists.", enfe);
            }
            List<Resultadopractica> resultadopracticaList = piloto.getResultadopracticaList();
            for (Resultadopractica resultadopracticaListResultadopractica : resultadopracticaList) {
                resultadopracticaListResultadopractica.setPilotoIdpiloto(null);
                resultadopracticaListResultadopractica = em.merge(resultadopracticaListResultadopractica);
            }
            List<Apuesta> apuestaList = piloto.getApuestaList();
            for (Apuesta apuestaListApuesta : apuestaList) {
                apuestaListApuesta.setPilotoIdpiloto(null);
                apuestaListApuesta = em.merge(apuestaListApuesta);
            }
            em.remove(piloto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Piloto> findPilotoEntities() {
        return findPilotoEntities(true, -1, -1);
    }

    public List<Piloto> findPilotoEntities(int maxResults, int firstResult) {
        return findPilotoEntities(false, maxResults, firstResult);
    }

    private List<Piloto> findPilotoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Piloto.class));
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

    public Piloto findPiloto(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Piloto.class, id);
        } finally {
            em.close();
        }
    }

    public int getPilotoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Piloto> rt = cq.from(Piloto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
