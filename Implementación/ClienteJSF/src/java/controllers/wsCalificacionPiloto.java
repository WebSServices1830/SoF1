/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import entities.CalificacionPiloto;
import entities.Campeonato;
import entities.Piloto;
import entities.Premio;
import entities.TablaGeneral;
import entities.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.ManagedProperty;

import javax.ws.rs.core.GenericType;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceRef;
import ws.OpinionesRestClient;
import ws.PilotoRestClient;
import ws.ResultadoRestClient;


/**
 *
 * @author Michael
 */
@Named(value = "wsCalificacionPiloto")
@ManagedBean
public class wsCalificacionPiloto {

    
    private OpinionesRestClient opinionesRest =new OpinionesRestClient();
      private PilotoRestClient piltotosRest = new PilotoRestClient();
      private ResultadoRestClient resRest = new ResultadoRestClient();
  
    @ManagedProperty(value = "#{wsSessionBean.campeonato}")
    private Campeonato c;

    public Campeonato getC() {
        return c;
    }

    public void setC(Campeonato c) {
        this.c = c;
    }
    
    
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

    List<TablaGeneral> tabla = new ArrayList<TablaGeneral>();

    public List<TablaGeneral> getTabla() {
        tabla=resRest.obtenerTablaGeneralPorCampeonato(new GenericType<List<TablaGeneral>>(){},c.getIdCampeonato()+"");
        return tabla;
    }

    public void setTabla(List<TablaGeneral> tabla) {
        this.tabla = tabla;
    }
    

    public wsCalificacionPiloto() {
    }

    public String calificarView(Piloto p){
        this.piloto=p;
        return "comentar";
    }
    public String calificar() throws DatatypeConfigurationException {
        GregorianCalendar c = new GregorianCalendar();

        this.calificacion.setPuntaje(rating.doubleValue());

        this.calificacion.setFecha(c.getTime());
        piloto=piltotosRest.obtenerPilotosPorId(Piloto.class,piloto.getIdPiloto()+"");
        idPiloto=piloto.getIdPiloto();
        calificacion.setPiloto(piloto);
        calificacion.setUsuario(usuario);
        
       opinionesRest.crearOpinionPiloto(calificacion, String.class);
        return "";
    }

    public String comentarios(int idP) {
        this.idPiloto = idP;
        this.piloto =  piltotosRest.obtenerPilotosPorId(Piloto.class, idP+"");
  
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

    //---------------------------------------------------------------------------------------
    public CalificacionPiloto getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(CalificacionPiloto calificacion) {
        this.calificacion = calificacion;
    }

    public List<CalificacionPiloto> getCalificaciones() {
        this.calificaciones = opinionesRest.obtenerOpinionesPorPiloto(new GenericType<List<CalificacionPiloto>>(){}
                , idPiloto+"");
        return calificaciones;
    }

    public void setCalificaciones(List<CalificacionPiloto> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public List<Piloto> getPilotos() {
//        this.pilotos = this.obtenerTopPilotos();
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
promedioPiloto=   Double.valueOf(opinionesRest.obtenerCalificacionPromedioPiloto(String.class, idPiloto+""));
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


    List<Piloto> toppilotos =new ArrayList<>();
    List<Premio> toppremios =new ArrayList<>();

    public List<Piloto> getToppilotos() {
        toppilotos= opinionesRest.obtenerPilotosTop(new GenericType<List<Piloto>>(){});
        return toppilotos;
    }

    public void setToppilotos(List<Piloto> toppilotos) {
        this.toppilotos = toppilotos;
    }

    public List<Premio> getToppremios() {
        toppremios= opinionesRest.obtenerPremiosTop(new GenericType<List<Premio>>(){});
        return toppremios;
    }

    public void setToppremios(List<Premio> toppremios) {
        this.toppremios = toppremios;
    }
    

}
