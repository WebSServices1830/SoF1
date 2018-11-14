/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.f1restserver.negocio;

import entities.ResultadoPractica;
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
public class ResultadoPracticaFacade extends AbstractFacade<ResultadoPractica> {

    @PersistenceContext(unitName = "AppFormula1ServidorPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ResultadoPracticaFacade() {
        super(ResultadoPractica.class);
    }
    
    public List<ResultadoPractica> obtenerResultadoPracticaBySesionPractica(int idSesionPractica) {
        List<ResultadoPractica> res = getEntityManager().createQuery("select rp "+"from ResultadoPractica rp "+"where rp.sesionPractica.idSesionPractica = :idSesionPractica"+" order by rp.tiempo asc",ResultadoPractica.class)
                .setParameter("idSesionPractica", idSesionPractica).getResultList();
        if(res == null){
            return new ArrayList<>();
        }
        return res;
    }
}
