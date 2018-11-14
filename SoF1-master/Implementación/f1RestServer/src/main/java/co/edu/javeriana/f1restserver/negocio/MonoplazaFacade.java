/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.f1restserver.negocio;

import entities.Monoplaza;
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
    
    public List<Monoplaza> obtenerMonoplazasByCampeonato(int idCampeonato) {
        List<Monoplaza> res = getEntityManager().createQuery("select m "+"from Monoplaza m "+"where m.campeonato.idCampeonato = :idCampeonato", Monoplaza.class)
                .setParameter("idCampeonato", idCampeonato).getResultList();
        if(res == null){
            return new ArrayList<>();
        }
        return res;
    }
    
}
