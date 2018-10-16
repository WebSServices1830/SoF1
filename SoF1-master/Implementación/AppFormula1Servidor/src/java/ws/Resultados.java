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
import entities.SesionCarrera;
import entities.SesionClasificacion;
import entities.SesionPractica;
import entities.TablaGeneral;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import negocio.ResultadoCarreraFacade;
import negocio.ResultadoClasificacionFacade;
import negocio.ResultadoPracticaFacade;
import negocio.SesionCarreraFacade;
import negocio.SesionClasificacionFacade;
import negocio.SesionPracticaFacade;
import negocio.TablaGeneralFacade;


/**
 *
 * @author andre
 */
@Stateless
@WebService(serviceName = "Resultados")
public class Resultados {
    
    @EJB
    private SesionCarreraFacade sesionCarreraFacade;
    
    @EJB
    private SesionClasificacionFacade sesionClasificacionFacade;
    
    @EJB
    private SesionPracticaFacade sesionPracticaFacade;
    
    @EJB
    private ResultadoCarreraFacade resultadoCarreraFacade;
    
    @EJB
    private ResultadoClasificacionFacade resultadoClasificacionFacade;
    
    @EJB
    private ResultadoPracticaFacade resultadoPracticaFacade;
    
    @EJB
    private TablaGeneralFacade tablaGeneralFacade;

    /**
     * Web service operation
     */
    @WebMethod(operationName = "verResultadoGeneral")
    public List<TablaGeneral> verResultadosGeneralesByCampeonato(int idCampeonato) {
        return tablaGeneralFacade.verResultadosGeneralesByCampeonato(idCampeonato);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "simularTorneo")
    @Oneway
    public void simularTorneo(int idCampeonato) {
        
    }
    
    @WebMethod(operationName = "obtenerSesionCarreraByPremio")
    public SesionCarrera obtenerSesionCarreraByPremio(@WebParam(name = "idPremio") int idPremio) {
        //TODO write your implementation code here:
        return sesionCarreraFacade.obtenerSesionCarreraByPremio(idPremio);
    }
    
    @WebMethod(operationName = "obtenerSesionClasificacionByPremio")
    public SesionClasificacion obtenerSesionClasificacionByPremio(@WebParam(name = "idPremio") int idPremio) {
        //TODO write your implementation code here:
        return sesionClasificacionFacade.obtenerSesionClasificacionByPremio(idPremio);
    }
    
    @WebMethod(operationName = "obtenerSesionPracticaByPremio")
    public SesionPractica obtenerSesionPracticaByPremio(@WebParam(name = "idPremio") int idPremio) {
        //TODO write your implementation code here:
        return sesionPracticaFacade.obtenerSesionPracticaByPremio(idPremio);
    }


    @WebMethod(operationName = "obtenerResultadoCarreraBySesionCarrera")
    public List<ResultadoCarrera> obtenerResultadoCarreraBySesionCarrera(@WebParam(name = "idSesionCarrera") int idSesionCarrera) {
        return resultadoCarreraFacade.obtenerResultadoCarreraBySesionCarrera(idSesionCarrera);
    }


    @WebMethod(operationName = "obtenerResultadoClasificacionBySesionClasificacion")
    public List<ResultadoClasificacion> obtenerResultadoClasificacionBySesionClasificacion(@WebParam(name = "idSesionClasificacion") int idSesionClasificacion) {
        return resultadoClasificacionFacade.obtenerResultadoClasificacionBySesionClasificacion(idSesionClasificacion);
    }
    
    @WebMethod(operationName = "obtenerResultadoPracticaBySesionPractica")
    public List<ResultadoPractica> obtenerResultadoPracticaBySesionPractica(@WebParam(name = "idSesionPractica") int idSesionPractica) {
        return resultadoPracticaFacade.obtenerResultadoPracticaBySesionPractica(idSesionPractica);
    }  
    
}
