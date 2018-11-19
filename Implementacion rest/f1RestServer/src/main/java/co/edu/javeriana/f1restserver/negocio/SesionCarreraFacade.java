/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.f1restserver.negocio;

import entities.SesionCarrera;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author andre
 */
@Stateless
public class SesionCarreraFacade extends AbstractFacade<SesionCarrera> {

    @PersistenceContext(unitName = "AppFormula1ServidorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SesionCarreraFacade() {
        super(SesionCarrera.class);
    }
    
    public SesionCarrera obtenerSesionCarreraByPremio(int idPremio) {
        List<SesionCarrera> lista = null;
        lista = getEntityManager().createQuery("select sc "+"from SesionCarrera sc "+"where sc.premio.idPremio = :idPremio",SesionCarrera.class)
                .setParameter("idPremio", idPremio).getResultList();
        if(lista == null || lista.isEmpty()){
            return new SesionCarrera();
        }
        return lista.get(0);
    }
}
