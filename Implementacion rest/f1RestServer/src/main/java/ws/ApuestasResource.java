/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import co.edu.javeriana.f1restserver.negocio.ApuestaFacade;
import entities.Apuesta;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author andre
 */
@Path("apuestas")
public class ApuestasResource {

    @Context
    private UriInfo context;
    
    @EJB
    private ApuestaFacade apuestaFacade;

    /**
     * Creates a new instance of ApuestasResource
     */
    public ApuestasResource() {
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void hacerApuesta(Apuesta apuesta){
        apuestaFacade.create(apuesta);
    }
    
    @GET
    @Path("usuario/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Apuesta> obtenerApuestarPorUsuario(@PathParam("id") int id){
        return apuestaFacade.obtenerApuestasByUsuario(id);
    }
    
}
