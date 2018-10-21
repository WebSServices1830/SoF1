/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entities.Monoplaza;
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
public class MonoplazaFacade extends AbstractFacade<Monoplaza> {

    @PersistenceContext(unitName = "AppFormula1ServidorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    


    public MonoplazaFacade() {
        super(Monoplaza.class);
    }
    
    public List<Monoplaza> obtenerMonoplazasByEscuderia(int idEscuderia) {
        return getEntityManager().createQuery("select m "+"from Monoplaza m "+"where m.escuderia.idEscuderia = :idEscuderia", Monoplaza.class)
                .setParameter("idEscuderia", idEscuderia).getResultList();
    }
    
    public Monoplaza obtenerMonoplazaByPiloto(int idPiloto) {
        return getEntityManager().createQuery("select m "+"from Monoplaza m "+"where m.piloto.idPiloto = :idPiloto", Monoplaza.class)
                .setParameter("idPiloto", idPiloto).getSingleResult();
    }
    
    public List<Monoplaza> obtenerMonoplazasByCampeonato(int idCampeonato) {
        return getEntityManager().createQuery("select m "+"from Monoplaza m "+"where m.campeonato.idCampeonato = :idCampeonato", Monoplaza.class)
                .setParameter("idCampeonato", idCampeonato).getResultList();
    }
}
