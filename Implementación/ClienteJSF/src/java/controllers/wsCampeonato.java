/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.CalificacionPremio;
import entities.Campeonato;
import entities.Circuito;
import entities.Premio;
import entities.Usuario;
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

/**
 *
 * @author nikme
 */
@Named(value = "wsCampeonato")
@ManagedBean
public class wsCampeonato {


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

       // calificaciones = obtenerCalificacionesPremio(idpremio);
        return calificaciones;
    }

    public List<CalificacionPremio> obtenerCalificaciones() {
        //calificaciones = obtenerCalificacionesPremio(idpremio);
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

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    public List<Premio> getPremios() {
    //    premios = obtenerPremiosByCampeonato(campeonato.getIdCampeonato());
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
   //     premio = findPremio(id);
        idcircuito=premio.getCircuito().getIdCircuito();
        idpremio=id;
        return "/calendario/detalle";
    }

    public String detallePista() throws IOException {
        System.out.println(idcircuito);
    
 //       circuito = findCircuito(idcircuito);
        
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
//        calificaciones = obtenerCalificacionesPremio(premio.getIdPremio());
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
        newCalificacion.setPuntaje(rating.doubleValue());
       newCalificacion.setFecha(new Date());
   //    calificarPremio(usuario.getIdUsuario(), idpremio, newCalificacion);
     rating=0;
     newCalificacion.setComentario("");
       return null;
    }

    
    public String ganador(Premio p) {
  /*      try {
        SesionCarrera sesCarr = obtenerSesionCarreraByPremio(p.getIdPremio());
        ResultadoCarrera resCarr = obtenerResultadoCarreraBySesionCarrera(sesCarr.getIdSesionCarrera()).get(0);
            
        return resCarr.getPiloto().getNombre();
        } catch (Exception e) {
        }
        return p.getCircuito().getUltimoGanador();*/
        return "ganador";
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

    public List<String> getFotos() {
        List<String> fotos= new ArrayList<String>(Arrays.asList(premio.getCircuito().getFoto().split(";")));
                return fotos;
        
    }
    
    public List<String> obtenerFotos1(String fotos1) {
        List<String> fotos= new ArrayList<>(Arrays.asList(fotos1.split(";")));
                return fotos;
        
    }
    

}
