/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.xml.ws.WebServiceRef;
import ws.Campeonato;
import ws.Gestor_Service;
import ws.Premio;
import ws.ResultadoCarrera;
import ws.ResultadoClasificacion;
import ws.ResultadoPractica;
import ws.Resultados_Service;
import ws.SesionCarrera;
import ws.SesionClasificacion;
import ws.SesionPractica;

/**
 *
 * @author nikme
 */
@Named(value = "wsResultados")
@ManagedBean
public class wsResultados {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Gestor/Gestor.wsdl")
    private Gestor_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Resultados/Resultados.wsdl")
    private Resultados_Service service;
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
        resultadosClasificacions=resultadosClasificacion(idpremio);
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
        simularTorneo(campeonato.getIdCampeonato());
    }
 public String detCarrera() throws IOException{
     premio= findPremio(idpremio);
     return "/resultados/resCarrera";
    }
 public String detClasificacion() throws IOException{
       
       premio= findPremio(idpremio); 
         return "/resultados/resClasificacion";
    }
 public String detPractica() throws IOException{
       premio= findPremio(idpremio);
         return "/resultados/resPractica";
    }

    private java.util.List<ws.TablaGeneral> verResultadoGeneral(int arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Resultados port = service.getResultadosPort();
        return port.verResultadoGeneral(arg0);
    }

    private void simularTorneo(int arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Resultados port = service.getResultadosPort();
        port.simularTorneo(arg0);
    }
 
public List<ResultadoClasificacion> resultadosClasificacion(int idPremio){
    sesionClasificacion=obtenerSesionClasificacionByPremio(idPremio);
    return obtenerResultadoClasificacionBySesionClasificacion(sesionClasificacion.getIdSesionClasificacion());
    
}

public List<ResultadoCarrera> resultadosCarrera(int idPremio){
    
    sesionCarrea=obtenerSesionCarreraByPremio(idPremio);
    return obtenerResultadoCarreraBySesionCarrera(sesionCarrea.getIdSesionCarrera());
    
}


public List<ResultadoPractica> resultadosPracticas(int idPremio){
    sesionPractica=obtenerSesionPracticaByPremio(idPremio);
    return obtenerResultadoPracticaBySesionPractica(sesionPractica.getIdSesionPractica());
    
}

    private SesionClasificacion obtenerSesionClasificacionByPremio(int idPremio) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Resultados port = service.getResultadosPort();
        return port.obtenerSesionClasificacionByPremio(idPremio);
    }

    private java.util.List<ws.ResultadoClasificacion> obtenerResultadoClasificacionBySesionClasificacion(int idSesionClasificacion) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Resultados port = service.getResultadosPort();
        return port.obtenerResultadoClasificacionBySesionClasificacion(idSesionClasificacion);
    }

    private SesionCarrera obtenerSesionCarreraByPremio(int idPremio) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Resultados port = service.getResultadosPort();
        return port.obtenerSesionCarreraByPremio(idPremio);
    }

    private java.util.List<ws.ResultadoCarrera> obtenerResultadoCarreraBySesionCarrera(int idSesionCarrera) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Resultados port = service.getResultadosPort();
        return port.obtenerResultadoCarreraBySesionCarrera(idSesionCarrera);
    }

    private java.util.List<ws.ResultadoPractica> obtenerResultadoPracticaBySesionPractica(int idSesionPractica) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Resultados port = service.getResultadosPort();
        return port.obtenerResultadoPracticaBySesionPractica(idSesionPractica);
    }

    private SesionPractica obtenerSesionPracticaByPremio(int idPremio) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Resultados port = service.getResultadosPort();
        return port.obtenerSesionPracticaByPremio(idPremio);
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

    private Premio findPremio(int idPremio) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.Gestor port = service_1.getGestorPort();
        return port.findPremio(idPremio);
    }
}
