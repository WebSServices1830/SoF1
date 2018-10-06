/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.xml.ws.WebServiceRef;
import ws.CRUDPiloto_Service;
import ws.Piloto;

/**
 *
 * @author USUARIO
 */
@Named(value = "wsEscuderiaBean")
@ManagedBean
public class wsEscuderiaBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/AppFormula1Servidor/CRUDPiloto.wsdl")
    private CRUDPiloto_Service service;

    /**
     * Creates a new instance of wsEscuderiaBean
     */
    public wsEscuderiaBean() {
    }
    List<Piloto> pilotos=new ArrayList<>();
    Piloto piloto;

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
    
    public List<Piloto> getPilotos() {
        pilotos=findAll();
        return pilotos;
    }

    public void setPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }
    
    public String save(){
    return "listado";
    }

    private java.util.List<ws.Piloto> findAll() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.CRUDPiloto port = service.getCRUDPilotoPort();
        return port.findAll();
    }
}
