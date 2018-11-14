/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.f1restserver.negocio;

import entities.ResultadoCarrera;
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
public class ResultadoCarreraFacade extends AbstractFacade<ResultadoCarrera> {

    @PersistenceContext(unitName = "AppFormula1ServidorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ResultadoCarreraFacade() {
        super(ResultadoCarrera.class);
    }
    
    public List<ResultadoCarrera> obtenerResultadoCarreraBySesionCarrera(int idSesionCarrera) {
        List<ResultadoCarrera> res = getEntityManager().createQuery("select rc "+"from ResultadoCarrera rc "+"where rc.sesionCarrera.idSesionCarrera = :idSesionCarrera"+" order by rc.puntos desc",ResultadoCarrera.class)
                .setParameter("idSesionCarrera", idSesionCarrera).getResultList();
        if(res == null){
            return new ArrayList<>();
        }
        return res;
    }
    
}
