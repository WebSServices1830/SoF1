/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Apuesta;
import entities.Campeonato;
import entities.Piloto;
import entities.Premio;
import entities.ResultadoCarrera;
import entities.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.ws.rs.core.GenericType;
import javax.xml.ws.WebServiceRef;
import ws.ApuestasRestClient;
import ws.PilotoRestClient;
import ws.PremiosRestClient;

/**
 *
 * @author USUARIO
 */
@Named(value = "wsApuestaBean")
@ManagedBean
public class wsApuestaBean {

    
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
    ApuestasRestClient apuREST= new ApuestasRestClient();

    /**
     * Creates a new instance of wsApuestaBean
     */
    public wsApuestaBean() {
    }
    
    public String apostar(){
        PremiosRestClient preREST= new PremiosRestClient();
        PilotoRestClient piloREST= new PilotoRestClient();
        apuesta.setUsuario(usuario);
        Premio miPre = preREST.obtenerPremioPorId(Premio.class, idPremio+"");
        apuesta.setPremio(miPre);
        Piloto miPil = piloREST.obtenerPilotosPorId(Piloto.class, idPiloto+"");
        apuesta.setPiloto(miPil);
        apuREST.hacerApuesta(apuesta);
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

  //----------------------------------------------------

    public List<Premio> getPremios() {
        PremiosRestClient preREST= new PremiosRestClient();
        premios = preREST.obtenerPilotosByCampeonato(new GenericType<List<Premio>>(){},c.getIdCampeonato()+"");
               
        return premios;
    }

    public void setPremios(List<Premio> premios) {
        this.premios = premios;
    }

    
    public List<Apuesta> getApuestas() {
        return  apuREST.obtenerApuestarPorUsuario(new GenericType<List<Apuesta>>(){}, usuario.getIdUsuario()+"");
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

