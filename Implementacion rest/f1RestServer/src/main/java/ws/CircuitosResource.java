/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import co.edu.javeriana.f1restserver.negocio.CircuitoFacade;
import entities.Circuito;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
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
@Path("circuitos")
public class CircuitosResource {

    @Context
    private UriInfo context;
    
    @EJB
    private CircuitoFacade circuitoFacade;

    /**
     * Creates a new instance of CircuitosResource
     */
    public CircuitosResource() {
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public int crearCircuito(Circuito Circuito){
        circuitoFacade.create(Circuito);
        int idNuevo = circuitoFacade.count();
        return idNuevo;
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void editarCircuito(Circuito Circuito){
        circuitoFacade.edit(Circuito);
    }
    
    @DELETE
    @Path("/{id}")
    public void eliminarCircuito(@PathParam("id") int id){
        Circuito entidad = new Circuito();
        entidad.setIdCircuito(id);
        circuitoFacade.remove(entidad);
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Circuito obtenerCircuitoPorId(@PathParam("id") int id){
        Circuito entidad = circuitoFacade.find(id);
        if(entidad == null){
            entidad = new Circuito();
        }
        return entidad;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Circuito> obtenerCircuitos(){
        List<Circuito> entidades = circuitoFacade.findAll();
        if(entidades == null){
            entidades =  new ArrayList<>();
        }
        return entidades;
    }
    
    @GET
    @Path("/cantidad")
    @Produces(MediaType.TEXT_PLAIN)
    public int obtenerCantidadCircuitos(){
        return circuitoFacade.count();
    }
}
