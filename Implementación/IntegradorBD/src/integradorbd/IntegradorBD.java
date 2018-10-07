/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorbd;

import controllers.PaisJpaController;
import entities.Pais;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Michael
 */
public class IntegradorBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("IntegradorBDPU");
        
        PaisJpaController pjc = new PaisJpaController (emf);
        
        Pais pais = new Pais();
        
        pais.setIdpais(1);
        pais.setNombre("nombre xd");
        
        pjc.create(pais);
    }
    
}
