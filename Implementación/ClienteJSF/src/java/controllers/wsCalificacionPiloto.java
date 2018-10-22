/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceRef;
import ws.CalificacionPiloto;
import ws.Campeonato;
import ws.Gestor_Service;
import ws.Opiniones_Service;
import ws.Piloto;
import ws.Usuario;

/**
 *
 * @author Michael
 */
@Named(value = "wsCalificacionPiloto")
@ManagedBean
public class wsCalificacionPiloto {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Gestor/Gestor.wsdl")
    private Gestor_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/AppFormula1Servidor/Opiniones.wsdl")
    private Opiniones_Service service;

    //@ManagedProperty(value = "#{wsSessionBean.usuarioSession}")
    //Usuario usuarioSession;
    /**
     * Creates a new instance of wsCalificacionPiloto
     */
    @ManagedProperty(value = "#{wsSessionBean.usuarioSession}")
    private Usuario usuario;

    int idp;

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    CalificacionPiloto calificacion = new CalificacionPiloto();

    List<CalificacionPiloto> calificaciones = new ArrayList<CalificacionPiloto>();
    List<Piloto> pilotos = new ArrayList<Piloto>();
    Piloto piloto = new Piloto();
    int idPiloto = 0;
    double promedioPiloto = 0;
    Integer rating = new Integer(0);

    public wsCalificacionPiloto() {
    }

    public String calificarView(Piloto p){
        this.piloto=p;
        return "comentar";
    }
    public String calificar() throws DatatypeConfigurationException {
        System.out.println("comentario" +calificacion.getComentario());
        System.out.println("rating " +rating);
        GregorianCalendar c = new GregorianCalendar();

        XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        this.calificacion.setPuntaje(rating.doubleValue());

        this.calificacion.setFecha(date2);

        this.calificarPiloto(usuario.getIdUsuario(), piloto.getIdPiloto(), calificacion);

        return "listado";
    }

    public String comentarios(int idP) {
        this.idPiloto = idP;
        this.piloto = findPiloto(idP);
        this.rating = (int) this.getPromedioPiloto();
        return "comentarios";
    }

    public int calificacionINT(double d) {
        return (int) d;
    }

    public String getFechaConFormato(String day) {

        return day.substring(0, 10);
    }

    //---------------------------------------------------------------------------------------
    private java.util.List<ws.CalificacionPiloto> obtenerCalificacionesPiloto(int idPiloto) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Opiniones port = service.getOpinionesPort();
        return port.obtenerCalificacionesPiloto(idPiloto);
    }

    private double obtenerCalificacionPromedioPiloto(int idPiloto) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Opiniones port = service.getOpinionesPort();
        return port.obtenerCalificacionPromedioPiloto(idPiloto);
    }

    private java.util.List<ws.Piloto> obtenerTopPilotos() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Opiniones port = service.getOpinionesPort();
        return port.obtenerTopPilotos();
    }

    private java.util.List<ws.CalificacionPiloto> obtenerCalificacionesPiloto_1(int idPiloto) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Opiniones port = service.getOpinionesPort();
        return port.obtenerCalificacionesPiloto(idPiloto);
    }

    private Piloto findPiloto(int idPiloto) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service_1.getGestorPort();
        return port.findPiloto(idPiloto);
    }

    //---------------------------------------------------------------------------------------
    public CalificacionPiloto getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(CalificacionPiloto calificacion) {
        this.calificacion = calificacion;
    }

    public List<CalificacionPiloto> getCalificaciones() {
        this.calificaciones.clear();
        this.calificaciones = this.obtenerCalificacionesPiloto(idPiloto);
        return calificaciones;
    }

    public void setCalificaciones(List<CalificacionPiloto> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public List<Piloto> getPilotos() {
        this.pilotos = this.obtenerTopPilotos();
        return pilotos;
    }

    public void setPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public int getIdPiloto() {
        return idPiloto;
    }

    public void setIdPiloto(int idPiloto) {
        this.idPiloto = idPiloto;
    }

    public double getPromedioPiloto() {
        this.promedioPiloto = obtenerCalificacionPromedioPiloto(this.idPiloto);
        return promedioPiloto;
    }

    public void setPromedioPiloto(double promedioPiloto) {
        this.promedioPiloto = promedioPiloto;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    private void calificarPiloto(int idUsuario, int idPiloto, ws.CalificacionPiloto calificacionPiloto) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Opiniones port = service.getOpinionesPort();
        port.calificarPiloto(idUsuario, idPiloto, calificacionPiloto);
    }

}
