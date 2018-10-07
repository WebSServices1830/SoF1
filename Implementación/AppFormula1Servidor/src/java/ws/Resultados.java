/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import entities.Circuito;
import entities.ResultadoCarrera;
import entities.ResultadoClasificacion;
import entities.ResultadoPractica;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


/**
 *
 * @author andre
 */
@WebService(serviceName = "Resultados")
public class Resultados {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "verResultadoGeneral")
    public List<ResultadoCarrera> verResultadoGeneral() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "simularTorneo")
    @Oneway
    public void simularTorneo() {
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerResultadoCarreraByPremio")
    public List<ResultadoCarrera> obtenerResultadoCarreraByPremio(@WebParam(name = "idPremio") int idPremio) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerResultadoClasificacionByPremio")
    public List<ResultadoClasificacion> obtenerResultadoClasificacionByPremio(@WebParam(name = "idPremio") int idPremio) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerResultadoPracticaByPremio")
    public List<ResultadoPractica> obtenerResultadoPracticaByPremio(@WebParam(name = "idPremio") int idPremio) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerCircuitoByPremio")
    public Circuito obtenerCircuitoByPremio(@WebParam(name = "idPremio") String idPremio) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerPilotosByEscuderia")
    public String obtenerPilotosByEscuderia(@WebParam(name = "idEscuderia") int idEscuderia) {
        //TODO write your implementation code here:
        return null;
    }

    
    
    
}
