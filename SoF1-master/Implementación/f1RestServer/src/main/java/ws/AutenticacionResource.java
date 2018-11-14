/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import co.edu.javeriana.f1restserver.negocio.UsuarioFacade;
import entities.Usuario;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
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
@Path("autenticacion")
public class AutenticacionResource {

    @Context
    private UriInfo context;

    @EJB
    private UsuarioFacade usuarioFacade;
    
    /**
     * Creates a new instance of AutenticacionResource
     */
    public AutenticacionResource() {
    }
    
    @GET
    @Path("sesiones/{usuario}/{contrasena}")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario iniciarSesion(@PathParam("usuario") String usuario, @PathParam("contrasena") String contrasena){
        List<Usuario> usuarios = usuarioFacade.findAll();
        for(Usuario u: usuarios){
            if(u.getUsuario().equals(usuario) && u.getContrasena().equals(contrasena)){
                return u;
            }
        }
        Usuario us = new Usuario();
        us.setIdUsuario(-1);
        return us;
    }
    
    @POST
    @Path("usuarios")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public int registrarUsuario(Usuario usuario){
        usuarioFacade.create(usuario);
        int idNuevo = usuarioFacade.count();
        return idNuevo;
    }
    
    @DELETE
    @Path("/sesiones/usuario/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public boolean cerrarSesion(@PathParam("id") int id){
        return true;
    }
    
    @GET
    @Path("/usuarios/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario obtenerUsuario(@PathParam("id") int id){
        Usuario entidad = usuarioFacade.find(id);
        if(entidad == null){
            return new Usuario();
        }
        return entidad;
    }
}
