/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entities.Piloto;
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
    
    public List<Piloto> obtenerPilotosByEscuderia(int idEscuderia){
        return getEntityManager().createQuery("select p "+"from Piloto p "+"where p.escuderia_id = :idEscuderia", Piloto.class)
                .setParameter("idEscuderia", idEscuderia).getResultList();
    }
    
    public List<Piloto> obtenerPilotosByCampeonato(int idCampeonato){
        return getEntityManager().createQuery("select p "+"from Piloto p "+"where p.campeonato_id = :idCampeonato "+"order by p.multiplicador", Piloto.class)
                .setParameter("idCampeonato", idCampeonato).getResultList();
    }
}
