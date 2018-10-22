/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entities.SesionCarrera;
import javax.annotation.PreDestroy;
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
        SesionCarrera res = getEntityManager().createQuery("select sc "+"from SesionCarrera sc "+"where sc.premio.idPremio = :idPremio",SesionCarrera.class)
                .setParameter("idPremio", idPremio).getSingleResult();
        if(res == null){
            return new SesionCarrera();
        }
        return res;
    }
    
}
