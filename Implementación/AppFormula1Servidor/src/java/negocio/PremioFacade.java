/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;


import entities.Premio;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author andre
 */
@Stateless
public class PremioFacade extends AbstractFacade<Premio> {

    @PersistenceContext(unitName = "AppFormula1ServidorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public PremioFacade() {
        super(Premio.class);
    }
    
    public List<Premio> obtenerPremiosByCampeonato(int idCampeonato) {
        return getEntityManager().createQuery("select p "+"from Premio p "+"where p.campeonato.idCampeonato = :idCampeonato", Premio.class)
                .setParameter("idCampeonato", idCampeonato).getResultList();
    }
}
