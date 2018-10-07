/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import entities.Usuario;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author andre
 */
@WebService(serviceName = "Auth")
public class Auth {

    @WebMethod(operationName = "iniciarSesion")
    public Usuario iniciarSesion(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrasena") String contrasena) {
        //TODO write your implementation code here:
        return null;
    }

    @WebMethod(operationName = "registrarUsuario")
    public Boolean registrarUsuario(@WebParam(name = "usuario") Usuario usuario) {
        //TODO write your implementation code here:
        return null;
    }

    @WebMethod(operationName = "cerrarSesion")
    public Boolean cerrarSesion(@WebParam(name = "usuario") Usuario usuario) {
        //TODO write your implementation code here:
        return null;
    }
    
    
}
