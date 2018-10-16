/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entities.Apuesta;
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
public class ApuestaFacade extends AbstractFacade<Apuesta> {

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

    public ApuestaFacade() {
        super(Apuesta.class);
    }
    
    
    public List<Apuesta> obtenerApuestasByUsuario(int idUsuario) {
        //return getEntityManager().createQuery("select a "+"from Apuesta a "+"where a.usuario.idUsuario = "+idUsuario, Apuesta.class)
          //      .setParameter("idUsuario", idUsuario).getResultList();
          return findAll();
    }
    
}
