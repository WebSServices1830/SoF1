/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.f1restserver.negocio;

import entities.TablaGeneral;
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
public class TablaGeneralFacade extends AbstractFacade<TablaGeneral> {

    @PersistenceContext(unitName = "AppFormula1ServidorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TablaGeneralFacade() {
        super(TablaGeneral.class);
    }
    
    public List<TablaGeneral> verResultadosGeneralesByCampeonato(int idCampeonato) {
        List<TablaGeneral> res = getEntityManager().createQuery("select tg "+"from TablaGeneral tg "+"where tg.campeonato.idCampeonato = :idCampeonato"+" order by tg.puntos desc", TablaGeneral.class)
                .setParameter("idCampeonato", idCampeonato).getResultList();
        if(res == null){
            return new ArrayList<>();
        }
        return res;
    }
    
    public TablaGeneral obtenerTablaGeneralByPiloto(int idPiloto){
        List<TablaGeneral> res = null;
        res = getEntityManager().createQuery("select tg "+"from TablaGeneral tg "+"where tg.piloto.idPiloto = :idPiloto", TablaGeneral.class)
                .setParameter("idPiloto", idPiloto).getResultList();
        if(res == null || res.isEmpty()){
            return new TablaGeneral();
        }
        return res.get(0);
    }
    
}
