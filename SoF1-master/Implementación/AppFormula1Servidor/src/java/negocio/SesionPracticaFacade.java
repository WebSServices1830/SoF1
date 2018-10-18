/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entities.SesionPractica;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author andre
 */
@Stateless
public class SesionPracticaFacade extends AbstractFacade<SesionPractica> {

    @PersistenceContext(unitName = "AppFormula1ServidorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    

    public SesionPracticaFacade() {
        super(SesionPractica.class);
    }
    
    public SesionPractica obtenerSesionPracticaByPremio(int idPremio) {
        return getEntityManager().createQuery("select sp "+"from SesionPractica sp "+"where sp.premio.idPremio = :idPremio",SesionPractica.class)
                .setParameter("idPremio", idPremio).getSingleResult();
    }
}
