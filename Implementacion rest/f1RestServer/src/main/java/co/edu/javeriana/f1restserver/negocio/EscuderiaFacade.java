/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.f1restserver.negocio;

import entities.Escuderia;
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
public class EscuderiaFacade extends AbstractFacade<Escuderia> {

    @PersistenceContext(unitName = "AppFormula1ServidorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EscuderiaFacade() {
        super(Escuderia.class);
    }
    
    public List<Escuderia> obtenerEscuderiasByCampeonato(int idCampeonato) {
        List<Escuderia> res = getEntityManager().createQuery("select e "+"from Escuderia e "+"where e.campeonato.idCampeonato = :idCampeonato order by e.nombre asc", Escuderia.class)
                .setParameter("idCampeonato", idCampeonato).getResultList();
        if(res == null){
            return new ArrayList<>();
        }
        return res;
    }
}
