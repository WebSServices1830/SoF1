/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.xml.ws.WebServiceRef;
import proxy.Calificacion;
import proxy.Campeonato;
import proxy.Gestor_Service;
import proxy.Premio;
import proxy.Circuito;
import proxy.Opiniones_Service;

/**
 *
 * @author nikme
 */
@Named(value = "wsCampeonato")
@Dependent
public class wsCampeonato {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/AppFormula1Servidor/Opiniones.wsdl")
    private Opiniones_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/AppFormula1Servidor/Gestor.wsdl")
    private Gestor_Service service;

    /**
     * Creates a new instance of wsCampeonato
     */
    Campeonato campeonato = new Campeonato();
    List<Premio> premios = new ArrayList<>();
    List<Calificacion> calificaciones = new ArrayList<>();

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public Calificacion getNewCalificacion() {
        return newCalificacion;
    }

    public void setNewCalificacion(Calificacion newCalificacion) {
        this.newCalificacion = newCalificacion;
    }
  private Calificacion newCalificacion = new Calificacion();
    private Date fecha;
    Premio premio = new Premio();

    public Circuito getCircuito() {
        return circuito;
    }

    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }
    Circuito circuito = new Circuito();

    public Gestor_Service getService() {

        return service;
    }

    public void setService(Gestor_Service service) {
        this.service = service;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    public List<Premio> getPremios() {
        premios = findAllPremio();
        return premios;
    }

    public void setPremios(List<Premio> premios) {
        this.premios = premios;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Premio getPremio() {
        return premio;
    }

    public void setPremio(Premio premio) {
        this.premio = premio;
    }

    public wsCampeonato() {

    }

    public String detalle(int id) throws IOException {
      //  premio = (Premio) findPremio(id);
        //calificaciones = obtenerCalificacionesPremio(id);
        System.out.println("find piloto tal " + premio.getNombre());
        return "detalle";
    }

    public String detallePista() throws IOException {
        circuito = premio.getCircuito();
        return "/calendario/detallePista";
    }

    public String comentarios() throws IOException {
        
        return "comentaios/comentarios";
    }

    public Integer puntaje() {
        Integer act = 0;
        for (Calificacion c : calificaciones) {
            act += c.getPuntaje().shortValue();
        }
        
        return ( calificaciones.size() == 0) ? 3: (act / calificaciones.size()) ;
    }
public String submitComment(){
  
           calificarPremio(0, premio.getIdPremio(), newCalificacion);
           return  "comentaios/comentarios";
    }

    private java.util.List<proxy.Premio> findAllPremio() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        proxy.Gestor port = service.getGestorPort();
        return port.findAllPremio();
    }

    private Premio findPremio(int idPremio) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        proxy.Gestor port = service.getGestorPort();
        return port.findPremio(idPremio);
    }

    private java.util.List<proxy.Calificacion> obtenerCalificacionesPremio(int idPremio) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        proxy.Opiniones port = service_1.getOpinionesPort();
        return port.obtenerCalificacionesPremio(idPremio);
    }

    private void calificarPremio(int idUsuario, int idPremio, proxy.Calificacion calificacion) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        proxy.Opiniones port = service_1.getOpinionesPort();
        port.calificarPremio(idUsuario, idPremio, calificacion);
    }

}
