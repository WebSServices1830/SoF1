/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entities.CalificacionPremio;
import entities.Premio;
import java.util.ArrayList;
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
public class CalificacionPremioFacade extends AbstractFacade<CalificacionPremio> {

    @PersistenceContext(unitName = "AppFormula1ServidorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    


    public CalificacionPremioFacade() {
        super(CalificacionPremio.class);
    }
    
    public List<Premio> obtenerTopPremios() {
        List<Premio> res = getEntityManager().createQuery("select cp.premio "+" from CalificacionPremio cp "+"group by cp.premio "+"order by sum(cp.puntaje) desc", Premio.class).getResultList();
        if(res == null){
            return new ArrayList<>();
        }
        return res;
    }
    
    public List<CalificacionPremio> obtenerCalificacionesPremio(int idPremio) {
        List<CalificacionPremio> cali = getEntityManager().createQuery("select cp "+"from CalificacionPremio cp "+"where cp.premio.idPremio = :idPremio",CalificacionPremio.class)
                .setParameter("idPremio", idPremio).getResultList();
        if(cali ==null){
            return new ArrayList<>();
        }
        return cali;
    }
    
    public double obtenerCalificacionPromedioPremio(int idPremio){
        Double rest=  getEntityManager().createQuery("select AVG(cp.puntaje) "+"from CalificacionPremio cp "+"where cp.premio.idPremio = :idPremio",Double.class)
                .setParameter("idPremio", idPremio).getSingleResult();
        if(rest == null){
            return 0;
        }
        return rest;
    }
}
