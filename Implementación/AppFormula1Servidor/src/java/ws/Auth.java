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
        System.out.println("valiandando....");
        List<Usuario> usuarios = usuarioFacade.findAll();
        for(Usuario u: usuarios){
            if(u.getUsuario().equals(usuario) ){
                return u;
            }
        }
        Usuario u= new Usuario(); 
        u.setIdUsuario(-1);
        return u;
    }

    @WebMethod(operationName = "registrarUsuario")
    public Boolean registrarUsuario(@WebParam(name = "usuario") Usuario usuario) {
        System.out.println("registrando..... "+usuario.getNombre());
        usuarioFacade.create(usuario);
        return true;
    }

    @WebMethod(operationName = "cerrarSesion")
    public Boolean cerrarSesion(@WebParam(name = "usuario") Usuario usuario) {
        //TODO write your implementation code here:
        return true;
    }
    
    
}
