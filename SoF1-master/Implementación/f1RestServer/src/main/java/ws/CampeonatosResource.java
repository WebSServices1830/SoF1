/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import co.edu.javeriana.f1restserver.negocio.CampeonatoFacade;
import entities.Campeonato;
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
@Path("campeonatos")
public class CampeonatosResource {

    @Context
    private UriInfo context;
    
    @EJB
    private CampeonatoFacade campeonatoFacade;

    /**
     * Creates a new instance of CampeonatosResource
     */
    public CampeonatosResource() {
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public int crearCampeonato(Campeonato Campeonato){
        campeonatoFacade.create(Campeonato);
        int idNuevo = campeonatoFacade.count();
        return idNuevo;
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void editarCampeonato(Campeonato Campeonato){
        campeonatoFacade.edit(Campeonato);
    }
    
    @DELETE
    @Path("/{id}")
    public void eliminarCampeonato(@PathParam("id") int id){
        Campeonato entidad = new Campeonato();
        entidad.setIdCampeonato(id);
        campeonatoFacade.remove(entidad);
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Campeonato obtenerCampeonatoPorId(@PathParam("id") int id){
        Campeonato entidad = campeonatoFacade.find(id);
        if(entidad == null){
            entidad = new Campeonato();
        }
        return entidad;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Campeonato> obtenerCampeonatos(){
        List<Campeonato> entidades = campeonatoFacade.findAll();
        if(entidades == null){
            entidades =  new ArrayList<>();
        }
        return entidades;
    }
    
    @GET
    @Path("/cantidad")
    @Produces(MediaType.TEXT_PLAIN)
    public int obtenerCantidadCampeonatos(){
        return campeonatoFacade.count();
    }
}
