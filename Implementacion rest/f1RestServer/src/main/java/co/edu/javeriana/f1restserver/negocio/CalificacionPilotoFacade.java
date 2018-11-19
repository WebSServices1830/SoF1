/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.f1restserver.negocio;

import entities.CalificacionPiloto;
import entities.Piloto;
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
public class CalificacionPilotoFacade extends AbstractFacade<CalificacionPiloto> {

    @PersistenceContext(unitName = "AppFormula1ServidorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CalificacionPilotoFacade() {
        super(CalificacionPiloto.class);
    }
    
    public List<CalificacionPiloto> obtenerCalificacionesPiloto(int idPiloto) {
        List<CalificacionPiloto> cali = getEntityManager().createQuery("select cp "+"from CalificacionPiloto cp "+"where cp.piloto.idPiloto = :idPiloto",CalificacionPiloto.class)
                .setParameter("idPiloto", idPiloto).getResultList();
        if(cali == null){
            return new ArrayList<>();
        }
        return cali;
    }
    
    public double obtenerCalificacionPromedioPiloto(int idPiloto){
        Double res =  getEntityManager().createQuery("select AVG(cp.puntaje) "+"from CalificacionPiloto cp "+"where cp.piloto.idPiloto = :idPiloto",Double.class)
                .setParameter("idPiloto", idPiloto).getSingleResult();
        if(res == null){
            return 0.0;
        }
        return res;
    }
    
    public List<Piloto> obtenerTopPilotos() {
        List<Piloto> res= getEntityManager().createQuery("select cp.piloto "+" from CalificacionPiloto cp "+"group by cp.piloto "+"order by sum(cp.puntaje) desc", Piloto.class).getResultList();
        if(res == null){
            return new ArrayList<>();
        }
        return res;
    }
}
