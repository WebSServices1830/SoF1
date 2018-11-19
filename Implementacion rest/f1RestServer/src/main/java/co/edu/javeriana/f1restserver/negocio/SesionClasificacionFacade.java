/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.f1restserver.negocio;

import entities.SesionClasificacion;
import java.util.List;
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
        List<SesionClasificacion> lista = null;
        lista = getEntityManager().createQuery("select sc "+"from SesionClasificacion sc "+"where sc.premio.idPremio = :idPremio",SesionClasificacion.class)
                .setParameter("idPremio", idPremio).getResultList();
        if(lista == null || lista.isEmpty()){
            return new SesionClasificacion();
        }
        return lista.get(0);
    }
    
}
