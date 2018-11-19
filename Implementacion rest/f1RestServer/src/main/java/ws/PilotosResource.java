/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import co.edu.javeriana.f1restserver.negocio.PilotoFacade;
import entities.Piloto;
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
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author andre
 */
@Path("pilotos")
public class PilotosResource {

    @Context
    private UriInfo context;
    
    @EJB
    private PilotoFacade pilotosFacade;

    /**
     * Creates a new instance of PilotosResource
     */
    public PilotosResource() {
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public int crearPilotos(Piloto Pilotos){
        pilotosFacade.create(Pilotos);
        int idNuevo = pilotosFacade.count();
        return idNuevo;
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void editarPilotos(Piloto Pilotos){
        pilotosFacade.edit(Pilotos);
    }
    
    @DELETE
    @Path("/{id}")
    public void eliminarPilotos(@PathParam("id") int id){
        Piloto entidad = new Piloto();
        entidad.setIdPiloto(id);
        pilotosFacade.remove(entidad);
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Piloto obtenerPilotosPorId(@PathParam("id") int id){
        Piloto entidad = pilotosFacade.find(id);
        if(entidad == null){
            entidad = new Piloto();
        }
        return entidad;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Piloto> obtenerPilotos(){
        List<Piloto> entidades = pilotosFacade.findAll();
        if(entidades == null){
            entidades =  new ArrayList<>();
        }
        return entidades;
    }
    
    @GET
    @Path("/cantidad")
    @Produces(MediaType.TEXT_PLAIN)
    public int obtenerCantidadPilotos(){
        return pilotosFacade.count();
    }
    
    @GET
    @Path("/campeonato/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Piloto> obtenerPilotosByCampeonato(@PathParam("id") int id){
        return pilotosFacade.obtenerPilotosByCampeonato(id);
    }
}
