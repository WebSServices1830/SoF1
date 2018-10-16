/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entities.CalificacionPremio;
import entities.Premio;
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
    
        @PreDestroy
public void destruct()
{
    em.close();
}

    public CalificacionPremioFacade() {
        super(CalificacionPremio.class);
    }
    
    public List<Premio> obtenerTopPremios() {
        return getEntityManager().createQuery("select cp "+" from CalificacionPremio cp "+"order by cp.puntaje").getResultList().subList(0, 4);
    }
    
    public List<CalificacionPremio> obtenerCalificacionesPremio(int idPremio) {
        return getEntityManager().createQuery("select cp "+"from CalificacionPremio cp "+"where cp.premio.idPremio = :idPremio",CalificacionPremio.class)
                .setParameter("idPremio", idPremio).getResultList();
    }
    
    public double obtenerCalificacionPromedioPremio(int idPremio){
        return getEntityManager().createQuery("select AVG(cp.puntaje) "+"from CalificacionPremio cp "+"where cp.premio.idPremio = :idPremio",double.class)
                .setParameter("idPremio", idPremio).getSingleResult();
    }
}
