/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appclientews;

import entities.Piloto;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

/**
 *
 * @author TAURET
 */
public class AppClienteWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Piloto piloto = new Piloto();
        piloto.setIdPiloto(6);
        piloto.setNombre("Dios ");
        Date fecha = new Date();
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(fecha);
        try {
            piloto.setFechaNacimiento(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(AppClienteWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        piloto.setLugarNacimiento("Colombia, Bogota");
        piloto.setPodios(2);
        piloto.setCampeonatos(1);
        piloto.setNumero(43);
        piloto.setBiografia("esta es la biografia mas mela x2");
        piloto.setFoto("jeje xd");
        piloto.setMultiplicador(1.4);
        
        create(piloto);  //-->>C
        //System.out.println(findAll().size());  //-->>R
        //edit(piloto);  //-->>U
        //remove(0);  //-->>D
        
        
    }

    private static void create(entities.Piloto entity) {
        entities.CRUDPiloto_Service service = new entities.CRUDPiloto_Service();
        entities.CRUDPiloto port = service.getCRUDPilotoPort();
        port.create(entity);
    }

    private static java.util.List<entities.Piloto> findAll() {
        entities.CRUDPiloto_Service service = new entities.CRUDPiloto_Service();
        entities.CRUDPiloto port = service.getCRUDPilotoPort();
        return port.findAll();
    }
    
    private static void edit(entities.Piloto entity){
        entities.CRUDPiloto_Service service = new entities.CRUDPiloto_Service();
        entities.CRUDPiloto port = service.getCRUDPilotoPort();
        port.edit(entity);
    }
    
    private static void remove(int id){
        entities.CRUDPiloto_Service service = new entities.CRUDPiloto_Service();
        entities.CRUDPiloto port = service.getCRUDPilotoPort();
        port.remove(id);
    }
    
    
}
