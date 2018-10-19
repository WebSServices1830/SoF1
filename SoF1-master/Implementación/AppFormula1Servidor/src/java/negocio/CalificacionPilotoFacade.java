/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entities.CalificacionPiloto;
import entities.Piloto;
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
    
    public List<Piloto> obtenerTopPilotos() {
        return getEntityManager().createQuery("select cp "+" from CalificacionPiloto cp "+"order by cp.puntaje").getResultList().subList(0, 4);
    }
    
    public List<CalificacionPiloto> obtenerCalificacionesPiloto(int idPiloto) {
        return getEntityManager().createQuery("select cp "+"from CalificacionPiloto cp "+"where cp.piloto.idPiloto = :idPiloto",CalificacionPiloto.class)
                .setParameter("idPiloto", idPiloto).getResultList();
    }
    
    public double obtenerCalificacionPromedioPiloto(int idPiloto){
        return getEntityManager().createQuery("select AVG(cp.puntaje) "+"from CalificacionPiloto cp "+"where cp.piloto.idPiloto = :idPiloto",double.class)
                .setParameter("idPiloto", idPiloto).getSingleResult();
    }
}
