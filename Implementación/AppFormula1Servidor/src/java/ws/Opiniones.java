/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import entities.Calificacion;
import entities.Piloto;
import entities.Premio;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author andre
 */
@WebService(serviceName = "Opiniones")
public class Opiniones {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calificarPremio")
    @Oneway
    public void calificarPremio(@WebParam(name = "idUsuario") int idUsuario, @WebParam(name = "idPremio") int idPremio, @WebParam(name = "calificacion")Calificacion calificacion) {
        
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "calificarPiloto")
    @Oneway
    public void calificarPiloto(@WebParam(name = "idUsuario") int idUsuario, @WebParam(name = "idPiloto") int idPiloto, @WebParam(name = "calificacion")Calificacion calificacion) {
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerTopPilotos")
    public List<Piloto> obtenerTopPilotos() {
        //TODO write your implementation code here:
        return null;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerTopPremios")
    public List<Premio> obtenerTopPremios() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerCalificacionesPiloto")
    public List<Calificacion> obtenerCalificacionesPiloto(@WebParam(name = "idPiloto") int idPiloto) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerCalificacionesPremio")
    public List<Calificacion> obtenerCalificacionesPremio(@WebParam(name = "idPremio") int idPremio) {
        //TODO write your implementation code here:
        return null;
    }
    
}
