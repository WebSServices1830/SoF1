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
import javax.enterprise.context.RequestScoped;
import javax.xml.ws.WebServiceRef;
import ws.Gestor_Service;
import wsApuesta.Premio;
import wsApuesta.Apuesta;
import wsApuesta.Apuestas_Service;

/**
 *
 * @author Michael
 */
@Named(value = "wsApuestaBean")
@RequestScoped
public class wsApuestaBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Gestor/Gestor.wsdl")
    private Gestor_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/AppFormula1Servidor/Apuestas.wsdl")
    private Apuestas_Service service;
    
    List<ws.Premio> premios = new ArrayList<ws.Premio>();
    
    List<Apuesta> apuestas = new ArrayList<Apuesta>();
    
    Apuesta apuesta = new Apuesta();
    
    int idPremio;
    int idPiloto;
    
    /**
     * Creates a new instance of wsApuestaBean
     */
    public wsApuestaBean() {
    }
    
    public void apostar(){
        
        hacerApuesta(1, apuesta.getCantidad(), idPremio, idPiloto);
    }
    
    public String getFechaConFormato(String day){
        
        return day.substring(0,10);
    }
    
    public String verNombre(Object o){
        Premio p = (Premio) o;
        return p.getNombre();
    }
//------------------------------------------------------------------
    
    
    private java.util.List<ws.Premio> findAllPremio() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service_1.getGestorPort();
        return port.findAllPremio();
    }

    private boolean hacerApuesta(int idUsuario, double cantidad, int idPremio, int idPiloto) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        wsApuesta.Apuestas port = service.getApuestasPort();
        return port.hacerApuesta(idUsuario, cantidad, idPremio, idPiloto);
    }

    private java.util.List<wsApuesta.Apuesta> obtenerApuestasByUsuario(int idUsuario) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        wsApuesta.Apuestas port = service.getApuestasPort();
        return port.obtenerApuestasByUsuario(idUsuario);
    }
    
//------------------------------------------------------------------

    public Apuesta getApuesta() {
        return apuesta;
    }

    public void setApuesta(Apuesta apuesta) {
        this.apuesta = apuesta;
    }

    public int getIdPremio() {
        return idPremio;
    }

    public void setIdPremio(int idPremio) {
        this.idPremio = idPremio;
    }

    public int getIdPiloto() {
        return idPiloto;
    }

    public void setIdPiloto(int idPiloto) {
        this.idPiloto = idPiloto;
    }

    public List<ws.Premio> getPremios() {
        premios = findAllPremio();
        return premios;
    }

    public void setPremios(List<ws.Premio> premios) {
        this.premios = premios;
    }

    public List<Apuesta> getApuestas() {
        apuestas = obtenerApuestasByUsuario(1);
        return apuestas;
    }

    public void setApuestas(List<Apuesta> apuestas) {
        this.apuestas = apuestas;
    }

    

        
    
}
