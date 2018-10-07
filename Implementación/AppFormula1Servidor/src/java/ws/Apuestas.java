/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import entities.Apuesta;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author andre
 */
@WebService(serviceName = "Apuestas")
public class Apuestas {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "hacerApuesta")
    public boolean hacerApuesta(@WebParam(name = "idUsuario") int idUsuario, @WebParam(name = "cantidad") double cantidad, @WebParam(name = "idPremio") int idPremio, @WebParam(name = "idPiloto") int idPiloto) {
        //TODO write your implementation code here:
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "establecerProbabilidad")
    public boolean establecerProbabilidad(@WebParam(name = "idEscuderia") int idEscuderia, @WebParam(name = "probabilidad") double probabilidad) {
        //TODO write your implementation code here:
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerApuestasByUsuario")
    public Apuesta obtenerApuestasByUsuario(@WebParam(name = "idUsuario") int idUsuario) {
        //TODO write your implementation code here:
        return null;
    }
    
    
    
}
