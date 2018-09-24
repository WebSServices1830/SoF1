/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piloto;

import entities.Piloto;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import negocio.ManejoPilotos;

/**
 *
 * @author TAURET
 */
@WebService(serviceName = "CRUDPiloto")
public class CRUDPiloto {
  
    ManejoPilotos mp = new ManejoPilotos();
    
    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "entity") Piloto piloto) {
        mp.create(piloto);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") Piloto piloto) {
        mp.edit(piloto);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") int id) {
        mp.remove(id);
    }
    
    @WebMethod(operationName = "find")
    public Object find(@WebParam(name = "id") int id) {
        return mp.findById(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Piloto> findAll() {
        return mp.findAll();
    }
    
}
