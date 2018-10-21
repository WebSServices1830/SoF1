/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceRef;
import ws.CalificacionPiloto;
import ws.Campeonato;
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

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/AppFormula1Servidor/Opiniones.wsdl")
    private Opiniones_Service service;

    //@ManagedProperty(value = "#{wsSessionBean.usuarioSession}")
    //Usuario usuarioSession;
    
    /**
     * Creates a new instance of wsCalificacionPiloto
     */
    CalificacionPiloto calificacion = new CalificacionPiloto();
    
    List<CalificacionPiloto> calificaciones = new ArrayList<CalificacionPiloto>();
    List<Piloto> pilotos = new ArrayList<Piloto>();


    
    public wsCalificacionPiloto() {
        this.calificacion.setComentario("");
    }
    
    
    public String calificar(Piloto p){
        
       //this.calificacion.setFecha(new XMLGregorianCalendarImpl () );
       //this.calificacion.setUsuario(usuarioSession);
       this.calificacion.setPiloto(p);
       this.calificarPiloto(1, p.getIdPiloto(), this.calificacion);
        return "listado";
    }
    
    public String comentarios(int idPiloto){
        return "editar";
    }
    
    //---------------------------------------------------------------------------------------
    private void calificarPiloto(int idUsuario, int idPiloto, ws.CalificacionPiloto calificacionPiloto) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Opiniones port = service.getOpinionesPort();
        port.calificarPiloto(idUsuario, idPiloto, calificacionPiloto);
    }

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
    
    //---------------------------------------------------------------------------------------

    public CalificacionPiloto getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(CalificacionPiloto calificacion) {
        this.calificacion = calificacion;
    }

    public List<CalificacionPiloto> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<CalificacionPiloto> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public List<Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    
}
