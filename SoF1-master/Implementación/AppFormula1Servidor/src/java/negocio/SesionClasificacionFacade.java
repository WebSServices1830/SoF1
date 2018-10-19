/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entities.SesionClasificacion;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author andre
 */
@Stateless
public class SesionClasificacionFacade extends AbstractFacade<SesionClasificacion> {

    @PersistenceContext(unitName = "AppFormula1ServidorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    


    public SesionClasificacionFacade() {
        super(SesionClasificacion.class);
    }
    
    public SesionClasificacion obtenerSesionClasificacionByPremio(int idPremio) {
        return getEntityManager().createQuery("select sc "+"from SesionClasificacion sc "+"where sc.premio.idPremio = :idPremio",SesionClasificacion.class)
                .setParameter("idPremio", idPremio).getSingleResult();
    }
    
}
