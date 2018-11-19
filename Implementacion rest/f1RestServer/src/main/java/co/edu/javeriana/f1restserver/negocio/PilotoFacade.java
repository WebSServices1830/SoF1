/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.f1restserver.negocio;

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
public class PilotoFacade extends AbstractFacade<Piloto> {

    @PersistenceContext(unitName = "AppFormula1ServidorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PilotoFacade() {
        super(Piloto.class);
    }
    
    public List<Piloto> obtenerPilotosByCampeonato(int idCampeonato){
        List<Piloto> res = getEntityManager().createQuery("select p "+"from Piloto p "+"where p.campeonato.idCampeonato = :idCampeonato "+"order by p.nombre asc", Piloto.class)
                .setParameter("idCampeonato", idCampeonato).getResultList();
        if(res == null){
            return new ArrayList<>();
        }
        return res;
    }
    
}
