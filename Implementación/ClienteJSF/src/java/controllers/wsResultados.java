/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Campeonato;
import entities.Piloto;
import entities.Premio;
import entities.ResultadoCarrera;
import entities.ResultadoClasificacion;
import entities.ResultadoPractica;
import entities.SesionCarrera;
import entities.SesionClasificacion;
import entities.SesionPractica;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.ws.rs.core.GenericType;
import javax.xml.ws.WebServiceRef;
import ws.PremiosRestClient;
import ws.ResultadoRestClient;

/**
 *
 * @author nikme
 */
@Named(value = "wsResultados")
@ManagedBean
public class wsResultados {

    @ManagedProperty(value = "#{wsSessionBean.campeonato}")
    private Campeonato campeonato;
     @ManagedProperty(value = "#{wsCampeonato.idpremio}")
    private int idpremio;

    public int getIdpremio() {
        return idpremio;
    }

    public void setIdpremio(int idpremio) {
        this.idpremio = idpremio;
    }
    
    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    public SesionCarrera getSesionCarrea() {
        return sesionCarrea;
    }

    public void setSesionCarrea(SesionCarrera sesionCarrea) {
        this.sesionCarrea = sesionCarrea;
    }
   
    int idPremio = 0;
    
    Premio premio;
    
    SesionClasificacion sesionClasificacion = new SesionClasificacion();
    SesionPractica sesionPractica = new SesionPractica();
    SesionCarrera sesionCarrea = new SesionCarrera();
    
    List<ResultadoCarrera> resultados= new ArrayList<>();
    List<ResultadoClasificacion> resultadosClasificacions= new ArrayList<>();
    List<ResultadoPractica> resultadosPracticas= new ArrayList<>();

    public List<ResultadoPractica> getResultadosPracticas() {
        resultadosPracticas=resultadosPracticas(idpremio);
        return resultadosPracticas;
    }

    public void setResultadosPracticas(List<ResultadoPractica> resultadosPracticas) {
        this.resultadosPracticas = resultadosPracticas;
    }

    public List<ResultadoClasificacion> getResultadosClasificacions() {
        resultadosClasificacions=resultadosClasificacion(premio.getIdPremio());
        return resultadosClasificacions;
    }

    public void setResultadosClasificacions(List<ResultadoClasificacion> resultadosClasificacions) {
        this.resultadosClasificacions = resultadosClasificacions;
    }

    public List<ResultadoCarrera> getResultados() {
       resultados=resultadosCarrera(idpremio);
        
        return resultados;
    }

    public void setResultados(List<ResultadoCarrera> resultados) {
        this.resultados = resultados;
    }
    
    
    ResultadoCarrera resCarrera= new ResultadoCarrera();
    ResultadoPractica resPractica = new ResultadoPractica();
    ResultadoClasificacion resClasificacion = new ResultadoClasificacion();
  ResultadoRestClient resREST = new ResultadoRestClient();


    public Premio getPremio() {
        return premio;
    }

    public void setPremio(Premio premio) {
        this.premio = premio;
    }

    public SesionClasificacion getSesionClasificacion() {
        return sesionClasificacion;
    }

    public void setSesionClasificacion(SesionClasificacion sesionClasificacion) {
        this.sesionClasificacion = sesionClasificacion;
    }

    public SesionPractica getSesionPractica() {
        return sesionPractica;
    }

    public void setSesionPractica(SesionPractica sesionPractica) {
        this.sesionPractica = sesionPractica;
    }

    public int getIdPremio() {
        return idPremio;
    }

    public void setIdPremio(int idPremio) {
        this.idPremio = idPremio;
    }

    

    public ResultadoCarrera getResCarrera() {
        return resCarrera;
    }

    public void setResCarrera(ResultadoCarrera resCarrera) {
        this.resCarrera = resCarrera;
    }

    public ResultadoPractica getResPractica() {
        return resPractica;
    }

    public void setResPractica(ResultadoPractica resPractica) {
        this.resPractica = resPractica;
    }

    public ResultadoClasificacion getResClasificacion() {
        return resClasificacion;
    }

    public void setResClasificacion(ResultadoClasificacion resClasificacion) {
        this.resClasificacion = resClasificacion;
    }
    
    /**
     * Creates a new instance of wsResultados
     */
    public wsResultados() {
        
    }
   public void simular(){

       System.out.println("simulando..."+campeonato.getIdCampeonato());
       resREST.simularCampeonato(campeonato.getIdCampeonato()+"", boolean.class);
 
    }
 public String detCarrera() throws IOException{
     PremiosRestClient preREST= new PremiosRestClient();
        premio = preREST.obtenerPremioPorId(Premio.class,idpremio+"");
     return "/resultados/resCarrera";
    }
 public String detClasificacion() throws IOException{
        PremiosRestClient preREST= new PremiosRestClient();
        
        premio = preREST.obtenerPremioPorId(Premio.class,idpremio+""); 
         return "/resultados/resClasificacion";
    }
 public String detPractica() throws IOException{
        PremiosRestClient preREST= new PremiosRestClient();
        premio = preREST.obtenerPremioPorId(Premio.class,idpremio+"");
         return "/resultados/resPractica";
    }

public List<ResultadoClasificacion> resultadosClasificacion(int idPremio){
 sesionClasificacion = resREST.obtenerSesionClasificacionByPremio(SesionClasificacion.class,idPremio+"");

 return resREST.obtenerResultadoCarreraBySesionClasificacion(new GenericType<List<ResultadoClasificacion>>(){},sesionClasificacion.getIdSesionClasificacion()+"");

}

public List<ResultadoCarrera> resultadosCarrera(int idPremio){
   
   
 sesionCarrea = resREST.obtenerSesionCarreraByPremio(SesionCarrera.class,idPremio+"");
return resREST.obtenerResultadoCarreraBySesionCarrera(new GenericType<List<ResultadoCarrera>>(){},sesionCarrea.getIdSesionCarrera()+"");

}


public List<ResultadoPractica> resultadosPracticas(int idPremio){
  
    sesionPractica=resREST.obtenerSesionPracticaByPremio(SesionPractica.class, idPremio+"");
return resREST.obtenerResultadoPracticaBySesionPractica(new GenericType<List<ResultadoPractica>>(){}, sesionPractica.getIdSesionPractica()+"");   
}
    public static String splitToComponentTimes(double biggy){
    int hours = (int) biggy / 3600;
    int remainder = (int) biggy - hours * 3600;
    int mins = remainder / 60;
    remainder = remainder - mins * 60;
    int secs = remainder;
    int[] ints = {hours , mins , secs};
    return hours+":"+mins+":"+secs+"."+(hours*secs)%1000;
}

    
}
