/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import co.edu.javeriana.f1restserver.negocio.EscuderiaFacade;
import entities.Escuderia;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
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
@Path("escuderias")
public class EscuderiasResource {

    @Context
    private UriInfo context;
    
    @EJB
    private EscuderiaFacade escuderiaFacade;

    /**
     * Creates a new instance of EscuderiasResource
     */
    public EscuderiasResource() {
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public int crearEscuderia(Escuderia escuderia){
        escuderiaFacade.create(escuderia);
        int idNuevo = escuderiaFacade.count();
        return idNuevo;
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void editarEscuderia(Escuderia escuderia){
        try{
        escuderiaFacade.edit(escuderia);
        } catch (ConstraintViolationException e) {
        // Aqui tira los errores de constraint
        for (ConstraintViolation actual : e.getConstraintViolations()) {
            System.out.println(actual.toString());
        }
        
        }
    }
    
    @DELETE
    @Path("/{id}")
    public void eliminarEscuderia(@PathParam("id") int id){
        Escuderia entidad = new Escuderia();
        entidad.setIdEscuderia(id);
        escuderiaFacade.remove(entidad);
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Escuderia obtenerEscuderiaPorId(@PathParam("id") int id){
        Escuderia entidad = escuderiaFacade.find(id);
        if(entidad == null){
            entidad = new Escuderia();
        }
        return entidad;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Escuderia> obtenerEscuderias(){
        List<Escuderia> entidades = escuderiaFacade.findAll();
        if(entidades == null){
            entidades =  new ArrayList<>();
        }
        return entidades;
    }
    
    @GET
    @Path("/cantidad")
    @Produces(MediaType.TEXT_PLAIN)
    public int obtenerCantidadEscuderias(){
        return escuderiaFacade.count();
    }
    
    @GET
    @Path("/campeonato/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Escuderia> obtenerPilotosByCampeonato(@PathParam("id") int id){
        return escuderiaFacade.obtenerEscuderiasByCampeonato(id);
    }
}
