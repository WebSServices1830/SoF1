/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.xml.ws.WebServiceRef;
import proxy.Calificacion;
import proxy.Circuito;
import proxy.Gestor_Service;
import proxy.Premio;
import proxy.ResultadoCarrera;
import proxy.ResultadoClasificacion;
import proxy.ResultadoPractica;
import proxy.Resultados_Service;
import proxy.SesionCarrera;
import proxy.SesionClasificacion;
import proxy.SesionPractica;

/**
 *
 * @author nikme
 */
@Named(value = "wsResultados")
@Dependent
public class wsResultados {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/AppFormula1Servidor/Resultados.wsdl")
    private Resultados_Service service;

   
    Premio premio;
    SesionClasificacion sesionClasificacion = new SesionClasificacion();
    SesionPractica sesionPractica = new SesionPractica();
    SesionCarrera sesionCarrea = new SesionCarrera();
    
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
 public String detCarrera(int id) throws IOException{
      // resCarrera =(ResultadoCarrera) obtenerResultadoCarreraByPremio(id);
        System.err.println("****************************************************** "+resCarrera.getIdResultado());
         return "/resultados/resCarrera";
    }
 public String detClasificacion(int id) throws IOException{
       //resClasificacion =(ResultadoClasificacion) obtenerResultadoClasificacionByPremio(id);
        System.err.println("find piloto tal "+resClasificacion.getIdResultado());
         return "/resultados/resClasificacion";
    }
 public String detPractica(int id) throws IOException{
       
        System.err.println("find piloto tal "+resPractica.getIdResultado());
         return "/resultados/resPractica";
    }
  public String simular() {
        simularTorneo();
         return "/resultados/resCarrera";
    }

    private void simularTorneo() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        proxy.Resultados port = service.getResultadosPort();
        port.simularTorneo();
    }
 


 
    
}
