/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import co.edu.javeriana.f1restserver.negocio.CalificacionPilotoFacade;
import co.edu.javeriana.f1restserver.negocio.CalificacionPremioFacade;
import entities.CalificacionPiloto;
import entities.CalificacionPremio;
import entities.Piloto;
import entities.Premio;
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
@Path("opiniones")
public class OpinionesResource {

    @Context
    private UriInfo context;
    
    @EJB
    private CalificacionPilotoFacade calificacionPilotoFacade;
    
    @EJB
    private CalificacionPremioFacade calificacionPremioFacade;

    /**
     * Creates a new instance of OpinionesResource
     */
    public OpinionesResource() {
    }

    @POST
    @Path("/piloto")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public int crearOpinionPiloto(CalificacionPiloto calificacionPiloto){
        calificacionPilotoFacade.create(calificacionPiloto);
        int idNuevo =  calificacionPilotoFacade.count();
        return idNuevo;
    }
    
    @POST
    @Path("/premio")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public int crearOpinionPremio(CalificacionPremio calificacionPremio){
        calificacionPremioFacade.create(calificacionPremio);
        int idNuevo = calificacionPremioFacade.count();
        return idNuevo;
    }
    
    @GET
    @Path("/piloto/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<CalificacionPiloto> obtenerOpinionesPorPiloto(@PathParam("id") int id){
        return calificacionPilotoFacade.obtenerCalificacionesPiloto(id);
    }
    
    @GET
    @Path("/premio/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<CalificacionPremio> obtenerOpinionesPorPremio(@PathParam("id") int id){
        return calificacionPremioFacade.obtenerCalificacionesPremio(id);
    }
    
    @GET
    @Path("/pilotos/top")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Piloto> obtenerPilotosTop(){
        return calificacionPilotoFacade.obtenerTopPilotos();
    }
    
    @GET
    @Path("/premios/top")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Premio> obtenerPremiosTop(){
        return calificacionPremioFacade.obtenerTopPremios();
    }
    
    @GET
    @Path("/pilotos/promedio/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public double obtenerCalificacionPromedioPiloto(@PathParam("id") int id){
        return calificacionPilotoFacade.obtenerCalificacionPromedioPiloto(id);
    }
    
    @GET
    @Path("/premios/promedio/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public double obtenerCalificacionPromedioPremio(@PathParam("id") int id){
        return calificacionPremioFacade.obtenerCalificacionPromedioPremio(id);
    }
    
}
