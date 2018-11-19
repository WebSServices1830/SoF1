/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import co.edu.javeriana.f1restserver.negocio.PaisFacade;
import entities.Pais;
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
@Path("paises")
public class PaisesResource {

    @Context
    private UriInfo context;
    
    @EJB
    private PaisFacade paisFacade;

    /**
     * Creates a new instance of PaisesResource
     */
    public PaisesResource() {
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public int crearPais(Pais Pais){
        paisFacade.create(Pais);
        int idNuevo = paisFacade.count();
        return idNuevo;
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void editarPais(Pais Pais){
        paisFacade.edit(Pais);
    }
    
    @DELETE
    @Path("/{id}")
    public void eliminarPais(@PathParam("id") int id){
        Pais entidad = new Pais();
        entidad.setIdPais(id);
        paisFacade.remove(entidad);
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Pais obtenerPaisPorId(@PathParam("id") int id){
        Pais entidad = paisFacade.find(id);
        if(entidad == null){
            entidad = new Pais();
        }
        return entidad;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pais> obtenerPaises(){
        List<Pais> entidades = paisFacade.findAll();
        if(entidades == null){
            entidades =  new ArrayList<>();
        }
        return entidades;
    }
    
    @GET
    @Path("/cantidad")
    @Produces(MediaType.TEXT_PLAIN)
    public int obtenerCantidadPaises(){
        return paisFacade.count();
    }
}
