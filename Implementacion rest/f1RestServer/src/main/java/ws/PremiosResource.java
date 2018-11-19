/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import co.edu.javeriana.f1restserver.negocio.PremioFacade;
import entities.Premio;
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
@Path("premios")
public class PremiosResource {

    @Context
    private UriInfo context;
    
    @EJB
    private PremioFacade premioFacade;

    /**
     * Creates a new instance of PremiosResource
     */
    public PremiosResource() {
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public int crearPremio(Premio Premio){
        premioFacade.create(Premio);
        int idNuevo = premioFacade.count();
        return idNuevo;
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void editarPremio(Premio Premio){
        premioFacade.edit(Premio);
    }
    
    @DELETE
    @Path("/{id}")
    public void eliminarPremio(@PathParam("id") int id){
        Premio entidad = new Premio();
        entidad.setIdPremio(id);
        premioFacade.remove(entidad);
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Premio obtenerPremioPorId(@PathParam("id") int id){
        Premio entidad = premioFacade.find(id);
        if(entidad == null){
            entidad = new Premio();
        }
        return entidad;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Premio> obtenerPremios(){
        List<Premio> entidades = premioFacade.findAll();
        if(entidades == null){
            entidades =  new ArrayList<>();
        }
        return entidades;
    }
    
    @GET
    @Path("/cantidad")
    @Produces(MediaType.TEXT_PLAIN)
    public int obtenerCantidadPremios(){
        return premioFacade.count();
    }
    
    @GET
    @Path("/campeonato/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Premio> obtenerPilotosByCampeonato(@PathParam("id") int id){
        return premioFacade.obtenerPremiosByCampeonato(id);
    }
}
