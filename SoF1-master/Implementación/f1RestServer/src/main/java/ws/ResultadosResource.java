/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import co.edu.javeriana.f1restserver.negocio.PremioFacade;
import co.edu.javeriana.f1restserver.negocio.ResultadoCarreraFacade;
import co.edu.javeriana.f1restserver.negocio.ResultadoClasificacionFacade;
import co.edu.javeriana.f1restserver.negocio.ResultadoPracticaFacade;
import co.edu.javeriana.f1restserver.negocio.SesionCarreraFacade;
import co.edu.javeriana.f1restserver.negocio.SesionClasificacionFacade;
import co.edu.javeriana.f1restserver.negocio.SesionPracticaFacade;
import co.edu.javeriana.f1restserver.negocio.SimuladorFacade;
import co.edu.javeriana.f1restserver.negocio.TablaGeneralFacade;
import entities.Premio;
import entities.ResultadoCarrera;
import entities.ResultadoClasificacion;
import entities.ResultadoPractica;
import entities.SesionCarrera;
import entities.SesionClasificacion;
import entities.SesionPractica;
import entities.TablaGeneral;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author andre
 */
@Path("resultados")
public class ResultadosResource {

    @Context
    private UriInfo context;
    
    @EJB
    private TablaGeneralFacade tablaGeneralFacade;
    
    @EJB
    private SimuladorFacade simuladorFacade;
    
    @EJB
    private SesionCarreraFacade sesionCarreraFacade;
    
    @EJB
    private SesionClasificacionFacade sesionClasificacionFacade;
    
    @EJB
    private SesionPracticaFacade sesionPracticaFacade;
    
    @EJB
    private ResultadoCarreraFacade resultadoCarreraFacade;
    
    @EJB
    private ResultadoClasificacionFacade resultadoClasificacionFacade;
    
    @EJB
    private ResultadoPracticaFacade resultadoPracticaFacade;
    
    @EJB
    private PremioFacade premioFacade;

    /**
     * Creates a new instance of ResultadosResource
     */
    public ResultadosResource() {
    }

    @GET
    @Path("/tablaGeneral/campeonato/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TablaGeneral> obtenerTablaGeneralPorCampeonato(@PathParam("id") int id){
        return tablaGeneralFacade.verResultadosGeneralesByCampeonato(id);
    }
    
    @GET
    @Path("/tablaGeneral/piloto/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TablaGeneral obtenerTablaGeneralPiloto(@PathParam("id") int id){
        return tablaGeneralFacade.obtenerTablaGeneralByPiloto(id);
    }
    
    @PUT
    @Path("/simulador/campeonato")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public boolean simularCampeonato(int id){
        List<Premio> premios = premioFacade.obtenerPremiosByCampeonato(id);
        if(!premios.isEmpty()){
            for(Premio pre : premios){
                if(pre.getSesionCarrera() != null){
                    return false;
                }
            }
        }
        simuladorFacade.simularTorneo(id);
        return true;
    }
    
    @GET
    @Path("/sesionCarrera/premio/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public SesionCarrera obtenerSesionCarreraByPremio(@PathParam("id") int id){
        return sesionCarreraFacade.obtenerSesionCarreraByPremio(id);
    }
    
    @GET
    @Path("/sesionClasificacion/premio/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public SesionClasificacion obtenerSesionClasificacionByPremio(@PathParam("id") int id){
        return sesionClasificacionFacade.obtenerSesionClasificacionByPremio(id);
    }
    
    @GET
    @Path("/sesionPractica/premio/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public SesionPractica obtenerSesionPracticaByPremio(@PathParam("id") int id){
        return sesionPracticaFacade.obtenerSesionPracticaByPremio(id);
    }
    
    @GET
    @Path("/resultadosCarrera/sesionCarrera/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ResultadoCarrera> obtenerResultadoCarreraBySesionCarrera(@PathParam("id") int id){
        return resultadoCarreraFacade.obtenerResultadoCarreraBySesionCarrera(id);
    }
    
    @GET
    @Path("/resultadosClasificacion/sesionClasificacion/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ResultadoClasificacion> obtenerResultadoCarreraBySesionClasificacion(@PathParam("id") int id){
        return resultadoClasificacionFacade.obtenerResultadoClasificacionBySesionClasificacion(id);
    }
    
    @GET
    @Path("/resultadosPractica/sesionPractica/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ResultadoPractica> obtenerResultadoPracticaBySesionPractica(@PathParam("id") int id){
        return resultadoPracticaFacade.obtenerResultadoPracticaBySesionPractica(id);
    }
}
