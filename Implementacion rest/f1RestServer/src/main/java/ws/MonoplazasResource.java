/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import co.edu.javeriana.f1restserver.negocio.MonoplazaFacade;
import entities.Monoplaza;
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
@Path("monoplazas")
public class MonoplazasResource {

    @Context
    private UriInfo context;
    
    @EJB
    private MonoplazaFacade monoplazaFacade;

    /**
     * Creates a new instance of MonoplazasResource
     */
    public MonoplazasResource() {
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public int crearMonoplaza(Monoplaza Monoplaza){
        monoplazaFacade.create(Monoplaza);
        int idNuevo = monoplazaFacade.count();
        return idNuevo;
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void editarMonoplaza(Monoplaza Monoplaza){
        monoplazaFacade.edit(Monoplaza);
    }
    
    @DELETE
    @Path("/{id}")
    public void eliminarMonoplaza(@PathParam("id") int id){
        Monoplaza entidad = new Monoplaza();
        entidad.setIdMonoplaza(id);
        monoplazaFacade.remove(entidad);
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Monoplaza obtenerMonoplazaPorId(@PathParam("id") int id){
        Monoplaza entidad = monoplazaFacade.find(id);
        if(entidad == null){
            entidad = new Monoplaza();
        }
        return entidad;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Monoplaza> obtenerMonoplazas(){
        List<Monoplaza> entidades = monoplazaFacade.findAll();
        if(entidades == null){
            entidades =  new ArrayList<>();
        }
        return entidades;
    }
    
    @GET
    @Path("/cantidad")
    @Produces(MediaType.TEXT_PLAIN)
    public int obtenerCantidadMonoplazas(){
        return monoplazaFacade.count();
    }
    
    @GET
    @Path("/campeonato/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Monoplaza> obtenerPilotosByCampeonato(@PathParam("id") int id){
        return monoplazaFacade.obtenerMonoplazasByCampeonato(id);
    }
}
