/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import entities.Campeonato;
import entities.Circuito;
import entities.Escuderia;
import entities.Monoplaza;
import entities.Piloto;
import entities.Premio;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import negocio.CampeonatoFacade;
import negocio.CircuitoFacade;
import negocio.EscuderiaFacade;
import negocio.MonoplazaFacade;
import negocio.PilotoFacade;
import negocio.PremioFacade;

/**
 *
 * @author andre
 */
@Stateless
@WebService(serviceName = "Gestor")
public class Gestor {

    @EJB
    private EscuderiaFacade escuderiaFacade;
    @EJB
    private MonoplazaFacade monoplazaFacade;
    @EJB
    private PilotoFacade pilotoFacade;
    @EJB
    private CircuitoFacade circuitoFacade;
    @EJB
    private PremioFacade premioFacade;
    
    @EJB
    private CampeonatoFacade campeonatoFacade;
    
    @WebMethod(operationName = "createEscuderia")
    @Oneway
    public void createEscuderia(@WebParam(name = "escuderia") Escuderia escuderia) {
        escuderiaFacade.create(escuderia);
        System.out.println("llego create escuderia");
    }
    
    @WebMethod(operationName = "createMonoplaza")
    @Oneway
    public void createMonoplaza(@WebParam(name = "monoplaza") Monoplaza monoplaza) {
        monoplazaFacade.create(monoplaza);
    }
    
    @WebMethod(operationName = "createPiloto")
    @Oneway
    public void createPiloto(@WebParam(name = "piloto") Piloto piloto) {
        System.out.println("piloto "+piloto.getNombre());
        System.out.println("Cameonato "+piloto.getCampeonato().getIdCampeonato());
        
        pilotoFacade.create(piloto);
    }
    
    @WebMethod(operationName = "createCircuito")
    @Oneway
    public void createCircuito(@WebParam(name = "circuito") Circuito circuito) {
        circuitoFacade.create(circuito);
    }
    
    @WebMethod(operationName = "createPremio")
    @Oneway
    public void createPremio(@WebParam(name = "premio") Premio premio) {
        premioFacade.create(premio);
    }

    @WebMethod(operationName = "editEscuderia")
    @Oneway
    public void editEscuderia(@WebParam(name = "escuderia") Escuderia escuderia) {
        escuderiaFacade.edit(escuderia);
    }
    
    @WebMethod(operationName = "editMonoplaza")
    @Oneway
    public void editMonoplaza(@WebParam(name = "monoplaza") Monoplaza monoplaza){
        monoplazaFacade.edit(monoplaza);
    }
    @WebMethod(operationName = "editPiloto")
    @Oneway
    public void editPiloto(@WebParam(name = "piloto") Piloto piloto) {
        pilotoFacade.edit(piloto);
    }
    @WebMethod(operationName = "editCircuito")
    @Oneway
    public void editCircuito(@WebParam(name = "circuito") Circuito circuito) {
        circuitoFacade.edit(circuito);
    }
    @WebMethod(operationName = "editPremio")
    @Oneway
    public void editPremio(@WebParam(name = "premio") Premio premio) {
        premioFacade.edit(premio);
    }

    @WebMethod(operationName = "removeEscuderia")
    @Oneway
    public void removeEscuderia(@WebParam(name = "escuderia") int idEscuderia) {
        Escuderia e = escuderiaFacade.find(idEscuderia);
        escuderiaFacade.remove(e);
    }
    
    @WebMethod(operationName = "removeMonoplaza")
    @Oneway
    public void removeMonoplaza(@WebParam(name = "monoplaza") int idMonoplaza) {
        Monoplaza m = monoplazaFacade.find(idMonoplaza);
        monoplazaFacade.remove(m);
    }
    
    @WebMethod(operationName = "removePiloto")
    @Oneway
    public void removePiloto(@WebParam(name = "piloto") int idPiloto) {
        Piloto p = pilotoFacade.find(idPiloto);
        pilotoFacade.remove(p);
    }
    
    @WebMethod(operationName = "removeCircuito")
    @Oneway
    public void removeCircuito(@WebParam(name = "escuderia") int idCircuito) {
        Circuito c = circuitoFacade.find(idCircuito);
        circuitoFacade.remove(c);
    }
    
    @WebMethod(operationName = "removePremio")
    @Oneway
    public void removePremio(@WebParam(name = "premio") int idPremio) {
        Premio p = premioFacade.find(idPremio);
        premioFacade.remove(p);
    }
    
    @WebMethod(operationName = "findEscuderia")
    public Escuderia findEscuderia(@WebParam(name = "idEscuderia") int idEscuderia) {
        return escuderiaFacade.find(idEscuderia);
    }
    
    @WebMethod(operationName = "findMonoplaza")
    public Monoplaza findMonoplaza(@WebParam(name = "idMonoplaza") int idMonoplaza) {
        return monoplazaFacade.find(idMonoplaza);
    }
    
    @WebMethod(operationName = "findPiloto")
    public Piloto findPiloto(@WebParam(name = "idPiloto") int idPiloto) {
        return pilotoFacade.find(idPiloto);
    }
    
    @WebMethod(operationName = "findCircuito")
    public Circuito findCircuito(@WebParam(name = "idCircuito") int idCircuito) {
        return circuitoFacade.find(idCircuito);
    }
    
    @WebMethod(operationName = "findPremio")
    public Premio findPremio(@WebParam(name = "idPremio") int idPremio) {
        return premioFacade.find(idPremio);
    }

    @WebMethod(operationName = "findAllEscuderia")
    public List<Escuderia> findAllEscuderia() {
        return escuderiaFacade.findAll();
    }
    
    @WebMethod(operationName = "findAllMonoplaza")
    public List<Monoplaza> findAllMonoplaza() {
        return monoplazaFacade.findAll();
    }
    
    @WebMethod(operationName = "findAllPiloto")
    public List<Piloto> findAllPiloto() {
        return pilotoFacade.findAll();
    }
    @WebMethod(operationName = "findAllPilotoByEscuderia")  
    public List<Piloto> findPilotosByEscuderia(int idcampeonato){
           return pilotoFacade.findPilotosByEscuderia(idcampeonato);     
    }
    
    
    @WebMethod(operationName = "findAllCircuito")
    public List<Circuito> findAllCircuito() {
        return circuitoFacade.findAll();
    }
    
    @WebMethod(operationName = "findAllPremio")
    public List<Premio> findAllPremio() {
        return premioFacade.findAll();
    }
    
    @WebMethod(operationName = "findAllCampeonato")
    public List<Campeonato> findAllCampeonatos() {
        
        return campeonatoFacade.findCampeonatos();
    }
}
