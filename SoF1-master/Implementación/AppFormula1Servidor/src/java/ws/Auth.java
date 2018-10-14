/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import entities.Usuario;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import negocio.UsuarioFacade;

/**
 *
 * @author andre
 */
@Stateless
@WebService(serviceName = "Auth")
public class Auth {
    @EJB
    UsuarioFacade usuarioFacade;

    @WebMethod(operationName = "iniciarSesion")
    public Usuario iniciarSesion(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrasena") String contrasena) {
        //TODO write your implementation code here:
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

    @WebMethod(operationName = "registrarUsuario")
    public Boolean registrarUsuario(@WebParam(name = "usuario") Usuario usuario) {
        usuarioFacade.create(usuario);
        return true;
    }

    @WebMethod(operationName = "cerrarSesion")
    public Boolean cerrarSesion(@WebParam(name = "usuario") Usuario usuario) {
        return true;
    }
    
    
}

