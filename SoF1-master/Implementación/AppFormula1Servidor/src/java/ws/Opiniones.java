/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import entities.CalificacionPremio;
import entities.CalificacionPiloto;
import entities.Piloto;
import entities.Premio;
import entities.Usuario;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import negocio.CalificacionPilotoFacade;
import negocio.CalificacionPremioFacade;
import negocio.PilotoFacade;
import negocio.PremioFacade;
import negocio.UsuarioFacade;

/**
 *
 * @author andre
 */
@WebService(serviceName = "Opiniones")
public class Opiniones {
    
    @EJB
    private CalificacionPremioFacade calificacionPremioFacade;
    
    @EJB
    private CalificacionPilotoFacade calificacionPilotoFacade;
    
    @EJB
    private UsuarioFacade usuarioFacade;
    
    @EJB
    private PilotoFacade pilotoFacade;
    
    @EJB
    private PremioFacade premioFacade;

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calificarPremio")
    @Oneway
    public void calificarPremio(@WebParam(name = "idUsuario") int idUsuario, @WebParam(name = "idPremio") int idPremio, @WebParam(name = "calificacionPremio")CalificacionPremio calificacionPremio) {
        Usuario u = usuarioFacade.find(idUsuario);
        Premio p = premioFacade.find(idPremio);
        calificacionPremio.setPremio(p);
        calificacionPremio.setUsuario(u);
        calificacionPremioFacade.create(calificacionPremio);
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "calificarPiloto")
    @Oneway
    public void calificarPiloto(@WebParam(name = "idUsuario") int idUsuario, @WebParam(name = "idPiloto") int idPiloto, @WebParam(name = "calificacionPiloto")CalificacionPiloto calificacionPiloto) {
        Usuario u = usuarioFacade.find(idUsuario);
        Piloto p = pilotoFacade.find(idPiloto);
        calificacionPiloto.setPiloto(p);
        calificacionPiloto.setUsuario(u);
        calificacionPilotoFacade.create(calificacionPiloto);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerTopPilotos")
    public List<Piloto> obtenerTopPilotos() {
        //TODO write your implementation code here:
        return calificacionPilotoFacade.obtenerTopPilotos();
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerTopPremios")
    public List<Premio> obtenerTopPremios() {
        //TODO write your implementation code here:
        return calificacionPremioFacade.obtenerTopPremios();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerCalificacionesPiloto")
    public List<CalificacionPiloto> obtenerCalificacionesPiloto(@WebParam(name = "idPiloto") int idPiloto) {
        return calificacionPilotoFacade.obtenerCalificacionesPiloto(idPiloto);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerCalificacionesPremio")
    public List<CalificacionPremio> obtenerCalificacionesPremio(@WebParam(name = "idPremio") int idPremio) {
        return calificacionPremioFacade.obtenerCalificacionesPremio(idPremio);
    }
    
}

