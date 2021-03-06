/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.ws.WebServiceRef;
import ws.CalificacionPremio;
import ws.Campeonato;
import ws.Circuito;
import ws.Gestor_Service;
import ws.Opiniones_Service;
import ws.Premio;
import ws.ResultadoCarrera;
import ws.Resultados_Service;
import ws.SesionCarrera;
import ws.Usuario;

/**
 *
 * @author nikme
 */
@Named(value = "wsCampeonato")
@ManagedBean
public class wsCampeonato {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Resultados/Resultados.wsdl")
    private Resultados_Service service_2;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Gestor/Gestor.wsdl")
    private Gestor_Service service;

    
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/AppFormula1Servidor/Opiniones.wsdl")
    private Opiniones_Service service_1;

    int idcircuito;

    public int getIdcircuito() {
       
        return idcircuito;
    }

    public void setIdcircuito(int idcircuito) {
        this.idcircuito = idcircuito;
    }
    
    
    /**
     * Creates a new instance of wsCampeonato
     */
    @ManagedProperty(value = "#{wsSessionBean.campeonato}")
    private Campeonato campeonato;
    
    @ManagedProperty(value = "#{wsSessionBean.usuarioSession}")
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    private int idpremio;

    public int getIdpremio() {
        return idpremio;
    }

    public void setIdpremio(int idpremio) {
        this.idpremio = idpremio;
    }
    
    @ManagedProperty(value = "#{wsSessionBean.premio}")
    private Premio premio;

    
    List<Premio> premios = new ArrayList<>();
    List<CalificacionPremio> calificaciones = new ArrayList<>();
    private CalificacionPremio newCalificacion = new CalificacionPremio();

    
    public List<CalificacionPremio> getCalificaciones() {

        calificaciones = obtenerCalificacionesPremio(idpremio);
        return calificaciones;
    }

    public List<CalificacionPremio> obtenerCalificaciones() {
        calificaciones = obtenerCalificacionesPremio(idpremio);
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
        premios = obtenerPremiosByCampeonato(campeonato.getIdCampeonato());
        return premios;
    }

    public void setPremios(List<Premio> premios) {
        this.premios = premios;
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
        premio = findPremio(id);
        idcircuito=premio.getCircuito().getIdCircuito();
        idpremio=id;
        return "/calendario/detalle";
    }

    public String detallePista() throws IOException {
        System.out.println(idcircuito);
    
        circuito = findCircuito(idcircuito);
        
        return "detallePista";
    }

    public String detalleCampeonato(Campeonato c) throws IOException {
        this.setCampeonato(c);
        return "/calendario/detalle";
    }

    public String comentarios() throws IOException {
        
        return "/comentarios/comentarios";
    }

    public String fechas(Premio p) {
        String fecha = p.getFechaInicio().getDay() + " - " + p.getFechaFin().getDay() + " " + month(p.getFechaFin().getMonth());
        return fecha;
    }

    public Integer puntaje() {
        Integer act = 0;
        calificaciones = obtenerCalificacionesPremio(premio.getIdPremio());
        for (CalificacionPremio c : calificaciones) {
            act += c.getPuntaje().shortValue();
        }

        return (calificaciones.size() == 0) ? 0 : (act / calificaciones.size());

    }
Integer rating = new Integer(0);

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String submitComment() throws DatatypeConfigurationException {
       // newCalificacion.setUsuario();
        newCalificacion.setPuntaje(rating.doubleValue());
       newCalificacion.setFecha(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
       calificarPremio(usuario.getIdUsuario(), idpremio, newCalificacion);
     rating=0;
     newCalificacion.setComentario("");
       return null;
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

    private java.util.List<ws.Premio> obtenerPremiosByCampeonato(int idCampeonato) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        return port.obtenerPremiosByCampeonato(idCampeonato);
    }

    public String ganador(Premio p) {
        try {
        SesionCarrera sesCarr = obtenerSesionCarreraByPremio(p.getIdPremio());
        ResultadoCarrera resCarr = obtenerResultadoCarreraBySesionCarrera(sesCarr.getIdSesionCarrera()).get(0);
            
        return resCarr.getPiloto().getNombre();
        } catch (Exception e) {
        }
        return p.getCircuito().getUltimoGanador();
    }

    private String month(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "Jan";
                break;
            case 2:
                monthName = "Feb";
                break;
            case 3:
                monthName = "Mar";
                break;
            case 4:
                monthName = "Apr";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "Jun";
                break;
            case 7:
                monthName = "Jul";
                break;
            case 8:
                monthName = "Aug";
                break;
            case 9:
                monthName = "Sep";
                break;
            case 10:
                monthName = "Oct";
                break;
            case 11:
                monthName = "Nov";
                break;
            case 12:
                monthName = "Dec";
                break;
            default:
                monthName = "Invalid month";
                break;
        }
        return monthName;
    }

    private double obtenerCalificacionPromedioPremio(int idPremio) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Opiniones port = service_1.getOpinionesPort();
        return port.obtenerCalificacionPromedioPremio(idPremio);
    }

    private SesionCarrera obtenerSesionCarreraByPremio(int idPremio) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Resultados port = service_2.getResultadosPort();
        return port.obtenerSesionCarreraByPremio(idPremio);
    }

    private java.util.List<ws.ResultadoCarrera> obtenerResultadoCarreraBySesionCarrera(int idSesionCarrera) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Resultados port = service_2.getResultadosPort();
        return port.obtenerResultadoCarreraBySesionCarrera(idSesionCarrera);
    }

    public List<String> getFotos() {
        List<String> fotos= new ArrayList<String>(Arrays.asList(premio.getCircuito().getFoto().split(";")));
                return fotos;
        
    }
    
    public List<String> obtenerFotos1(String fotos1) {
        List<String> fotos= new ArrayList<>(Arrays.asList(fotos1.split(";")));
                return fotos;
        
    }
    

    private Circuito findCircuito(int idCircuito) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service.getGestorPort();
        return port.findCircuito(idCircuito);
    }
}
