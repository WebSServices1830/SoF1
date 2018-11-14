/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.f1restserver.negocio;

import entities.SesionPractica;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author andre
 */
@Stateless
public class SesionPracticaFacade extends AbstractFacade<SesionPractica> {

    @PersistenceContext(unitName = "AppFormula1ServidorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SesionPracticaFacade() {
        super(SesionPractica.class);
    }
    
    public SesionPractica obtenerSesionPracticaByPremio(int idPremio) {
        List<SesionPractica> lista = null;
        lista = getEntityManager().createQuery("select sp "+"from SesionPractica sp "+"where sp.premio.idPremio = :idPremio",SesionPractica.class)
                .setParameter("idPremio", idPremio).getResultList();
        if(lista == null || lista.isEmpty()){
            return new SesionPractica();
        }
        return lista.get(0);
    }
    
}
