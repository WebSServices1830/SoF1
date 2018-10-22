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
import javax.faces.bean.ManagedProperty;
import javax.xml.ws.WebServiceRef;
import ws.Apuesta;
import ws.Apuestas_Service;
import ws.Campeonato;
import ws.Gestor_Service;
import ws.Premio;
import ws.Usuario;

/**
 *
 * @author USUARIO
 */
@Named(value = "wsApuestaBean")
@ManagedBean
public class wsApuestaBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Gestor/Gestor.wsdl")
    private Gestor_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/AppFormula1Servidor/Apuestas.wsdl")
    private Apuestas_Service service;
    
    @ManagedProperty(value = "#{wsSessionBean.usuarioSession}")
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    @ManagedProperty(value = "#{wsSessionBean.campeonato}")
    private Campeonato c;
    
    
    public Campeonato getC() {
        return c;
    }

    public void setC(Campeonato c) {
        this.c = c;
    }
    
    
    List<Premio> premios = new ArrayList<Premio>();

    List<Apuesta> apuestas = new ArrayList<Apuesta>();
    int idPremio;
    int idPiloto;
    Apuesta apuesta = new Apuesta();

    /**
     * Creates a new instance of wsApuestaBean
     */
    public wsApuestaBean() {
    }
    
    public String apostar(){
        
        this.hacerApuesta(usuario.getIdUsuario(), apuesta.getCantidad(), idPremio, idPiloto);
        return "listado";
    }



    public String getFechaConFormato(String day){
        
        return day.substring(0,10);
    }
    
    public String getEfectuada(boolean b){
        if(b){
            return "Si";
        }
        return "No";
    }
    
    public String crearApuesta(){
    
        return "crear";
    }
    
    //----------------------------------------------------------------------------------------------

    private boolean hacerApuesta(int idUsuario, double cantidad, int idPremio, int idPiloto) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Apuestas port = service.getApuestasPort();
        return port.hacerApuesta(idUsuario, cantidad, idPremio, idPiloto);
    }

    private java.util.List<ws.Apuesta> obtenerApuestasByUsuario(int idUsuario) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Apuestas port = service.getApuestasPort();
        return port.obtenerApuestasByUsuario(idUsuario);
    }

    private java.util.List<ws.Premio> findAllPremio(int id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service_1.getGestorPort();
        return port.obtenerPremiosByCampeonato(id);
    }
    
  //----------------------------------------------------

    public List<Premio> getPremios() {
        premios = this.findAllPremio(c.getIdCampeonato());
        return premios;
    }

    public void setPremios(List<Premio> premios) {
        this.premios = premios;
    }

    
    public List<Apuesta> getApuestas() {
    /*
        if(this.usuario != null){
            apuestas = this.obtenerApuestasByUsuario(this.usuario.getIdUsuario());
        }else{
            apuestas = new ArrayList<Apuesta>();
        }
    */    
        return this.obtenerApuestasByUsuario(usuario.getIdUsuario());
    }

    public void setApuestas(List<Apuesta> apuestas) {
        this.apuestas = apuestas;
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

    public Apuesta getApuesta() {
        
        return apuesta;
    }

    public void setApuesta(Apuesta apuesta) {
        this.apuesta = apuesta;
    }
    
    
    
}

