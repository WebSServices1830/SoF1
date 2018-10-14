/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entities.ResultadoPractica;
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
        return getEntityManager().createQuery("select rp "+"from ResultadoPractica rp "+"where rp.sesionpractica_id = :idSesionPractica",ResultadoPractica.class)
                .setParameter("idSesionPractica", idSesionPractica).getResultList();
    }
}
