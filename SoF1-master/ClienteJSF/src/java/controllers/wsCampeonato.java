/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.xml.ws.WebServiceRef;
import ws.CalificacionPremio;
import ws.Campeonato;
import ws.Circuito;
import ws.Gestor_Service;
import ws.Opiniones_Service;
import ws.Premio;

/**
 *
 * @author nikme
 */
@Named(value = "wsCampeonato")
@ManagedBean
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
    List<CalificacionPremio> calificaciones = new ArrayList<>();
    private CalificacionPremio newCalificacion = new CalificacionPremio();
    private Date fecha;

    Premio premio = new Premio();

    public List<CalificacionPremio> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<CalificacionPremio> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public CalificacionPremio getNewCalificacion() {
        return newCalificacion;
    }

    public void setNewCalificacion(CalificacionPremio newCalificacion) {
        this.newCalificacion = newCalificacion;
    }

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
        circuito = (Circuito) premio.getCircuito();
        return "/calendario/detallePista";
    }

    public String comentarios() throws IOException {

        return "comentaios/comentarios";
    }

    public Integer puntaje() {
        Integer act = 0;
        for (CalificacionPremio c : calificaciones) {
            act += c.getPuntaje().shortValue();
        }

        return (calificaciones.size() == 0) ? 3 : (act / calificaciones.size());
    }

    public String submitComment() {

        calificarPremio(0, premio.getIdPremio(), newCalificacion);
        return "comentaios/comentarios";
    }

    private java.util.List<ws.Premio> findAllPremio() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        return port.findAllPremio();
    }

    private void calificarPremio(int idUsuario, int idPremio, ws.CalificacionPremio calificacionPremio) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Opiniones port = service_1.getOpinionesPort();
        port.calificarPremio(idUsuario, idPremio, calificacionPremio);
    }

    private java.util.List<ws.CalificacionPremio> obtenerCalificacionesPremio(int idPremio) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Opiniones port = service_1.getOpinionesPort();
        return port.obtenerCalificacionesPremio(idPremio);
    }

    private Premio findPremio(int idPremio) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        return port.findPremio(idPremio);
    }

}
