/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.f1restserver.negocio;

import entities.ResultadoClasificacion;
import java.util.ArrayList;
import java.util.List;
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
        List<ResultadoClasificacion> res = getEntityManager().createQuery("select rc "+"from ResultadoClasificacion rc "+"where rc.sesionClasificacion.idSesionClasificacion = :idSesionClasificacion"+" order by rc.q1 asc",ResultadoClasificacion.class)
                .setParameter("idSesionClasificacion", idSesionClasificacion).getResultList();
        if(res == null){
            return new ArrayList<>();
        }
        return res;
    }
}
