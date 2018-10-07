/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import entities.Circuito;
import entities.Escuderia;
import entities.Monoplaza;
import entities.Piloto;
import entities.Premio;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import negocio.EscuderiaFacade;

/**
 *
 * @author andre
 */
@WebService(serviceName = "Gestor")
public class Gestor {

    @EJB
    private EscuderiaFacade escuderiaFacade;
    
    @WebMethod(operationName = "createEscuderia")
    @Oneway
    public void createEscuderia(@WebParam(name = "escuderia") Escuderia escuderia) {
        
        
    }
    
    @WebMethod(operationName = "createMonoplaza")
    @Oneway
    public void createMonoplaza(@WebParam(name = "monoplaza") Monoplaza monoplaza) {
        
    }
    
    @WebMethod(operationName = "createPiloto")
    @Oneway
    public void createPiloto(@WebParam(name = "piloto") Piloto piloto) {
        
    }
    
    @WebMethod(operationName = "createCircuito")
    @Oneway
    public void createCircuito(@WebParam(name = "circuito") Circuito circuito) {
        
    }
    
    @WebMethod(operationName = "createPremio")
    @Oneway
    public void createPremio(@WebParam(name = "premio") Premio premio) {
        
    }

    @WebMethod(operationName = "editEscuderia")
    @Oneway
    public void editEscuderia(@WebParam(name = "escuderia") Escuderia escuderia) {
        
    }
    
    @WebMethod(operationName = "editMonoplaza")
    @Oneway
    public void editMonoplaza(@WebParam(name = "monoplaza") Monoplaza monoplaza){
        
    }
    @WebMethod(operationName = "editPiloto")
    @Oneway
    public void editPiloto(@WebParam(name = "piloto") Piloto piloto) {
        
    }
    @WebMethod(operationName = "editCircuito")
    @Oneway
    public void editCircuito(@WebParam(name = "circuito") Circuito circuito) {
        
    }
    @WebMethod(operationName = "editPremio")
    @Oneway
    public void editPremio(@WebParam(name = "premio") Premio premio) {
        
    }

    @WebMethod(operationName = "removeEscuderia")
    @Oneway
    public void removeEscuderia(@WebParam(name = "escuderia") int idEscuderia) {
        
    }
    
    @WebMethod(operationName = "removeMonoplaza")
    @Oneway
    public void removeMonoplaza(@WebParam(name = "monoplaza") int idMonoplaza) {
        
    }
    
    @WebMethod(operationName = "removePiloto")
    @Oneway
    public void removePiloto(@WebParam(name = "piloto") int idPiloto) {
        
    }
    
    @WebMethod(operationName = "removeCircuito")
    @Oneway
    public void removeCircuito(@WebParam(name = "escuderia") int idCircuito) {
        
    }
    
    @WebMethod(operationName = "removePremio")
    @Oneway
    public void removePremio(@WebParam(name = "premio") int idPremio) {
        
    }
    
    @WebMethod(operationName = "findEscuderia")
    public Escuderia findEscuderia(@WebParam(name = "idEscuderia") int idEscuderia) {
        return null;
    }
    
    @WebMethod(operationName = "findMonoplaza")
    public Monoplaza findMonoplaza(@WebParam(name = "idMonoplaza") int idMonoplaza) {
        return null;
    }
    
    @WebMethod(operationName = "findPiloto")
    public Piloto findPiloto(@WebParam(name = "idPiloto") int idPiloto) {
        return null;
    }
    
    @WebMethod(operationName = "findCircuito")
    public Piloto findCircuito(@WebParam(name = "idCircuito") int idCircuito) {
        return null;
    }
    
    @WebMethod(operationName = "findPremio")
    public Premio findPremio(@WebParam(name = "idPremio") int idPremio) {
        return null;
    }

    @WebMethod(operationName = "findAllEscuderia")
    public List<Escuderia> findAllEscuderia() {
        return null;
    }
    
    @WebMethod(operationName = "findAllMonoplaza")
    public List<Monoplaza> findAllMonoplaza() {
        return null;
    }
    
    @WebMethod(operationName = "findAllPiloto")
    public List<Piloto> findAllPiloto() {
        return null;
    }
    
    @WebMethod(operationName = "findAllCircuito")
    public List<Circuito> findAllCircuito() {
        return null;
    }
    
    @WebMethod(operationName = "findAllPremio")
    public List<Escuderia> findAllPremio() {
        return null;
    }
}
