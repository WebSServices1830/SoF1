/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import entities.Apuesta;
import entities.Piloto;
import entities.Premio;
import entities.Usuario;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import negocio.ApuestaFacade;
import negocio.PilotoFacade;
import negocio.PremioFacade;
import negocio.UsuarioFacade;

/**
 *
 * @author andre
 */
@WebService(serviceName = "Apuestas")
public class Apuestas {
    
    @EJB
    private UsuarioFacade usuarioFacade;
    
    @EJB
    private PilotoFacade pilotoFacade;
    
    @EJB
    private PremioFacade premioFacade;
    
    @EJB
    private ApuestaFacade apuestaFacade;
    /**
     * Web service operation
     */
    @WebMethod(operationName = "hacerApuesta")
    public boolean hacerApuesta(@WebParam(name = "idUsuario") int idUsuario, @WebParam(name = "cantidad") double cantidad, @WebParam(name = "idPremio") int idPremio, @WebParam(name = "idPiloto") int idPiloto) {
        Usuario u = usuarioFacade.find(idUsuario);
        Piloto p = pilotoFacade.find(idPiloto);
        Premio pr = premioFacade.find(idPremio);
        Apuesta apuesta = new Apuesta();
        apuesta.setEfectuada(false);
        apuesta.setCantidad(cantidad);
        apuesta.setCantidadGanada(-1.0);
        apuesta.setFecha(new Date());
        apuesta.setPiloto(p);
        apuesta.setPremio(pr);
        apuesta.setUsuario(u);
        apuestaFacade.create(apuesta);
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerApuestasByUsuario")
    public List<Apuesta> obtenerApuestasByUsuario(@WebParam(name = "idUsuario") int idUsuario) {
        //TODO write your implementation code here:
        return apuestaFacade.obtenerApuestasByUsuario(idUsuario);
    }
        
}
