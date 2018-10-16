/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entities.Escuderia;
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
public class EscuderiaFacade extends AbstractFacade<Escuderia> {

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

    public EscuderiaFacade() {
        super(Escuderia.class);
    }
    
    public List<Escuderia> obtenerEscuderiasByCampeonato(int idCampeonato) {
        return getEntityManager().createQuery("select e "+"from Escuderia e "+"where e.campeonato.idCampenato = :idCampeonato", Escuderia.class)
                .setParameter("idCampeonato", idCampeonato).getResultList();
    }
}
