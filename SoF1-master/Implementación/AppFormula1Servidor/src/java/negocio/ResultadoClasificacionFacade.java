/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entities.ResultadoClasificacion;
import java.util.List;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author andre
 */
@Stateless
public class ResultadoClasificacionFacade extends AbstractFacade<ResultadoClasificacion> {

    @PersistenceContext(unitName = "AppFormula1ServidorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    


    public ResultadoClasificacionFacade() {
        super(ResultadoClasificacion.class);
    }
    
    public List<ResultadoClasificacion> obtenerResultadoClasificacionBySesionClasificacion(int idSesionClasificacion) {
        return getEntityManager().createQuery("select rc "+"from ResultadoClasificacion rc "+"where rc.sesionClasificacion.idSesion = :idSesionClasificacion",ResultadoClasificacion.class)
                .setParameter("idSesionClasificacion", idSesionClasificacion).getResultList();
    }
}
