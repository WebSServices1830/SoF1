
package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Auth", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Auth {


    /**
     * 
     * @param usuario
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registrarUsuario", targetNamespace = "http://ws/", className = "ws.RegistrarUsuario")
    @ResponseWrapper(localName = "registrarUsuarioResponse", targetNamespace = "http://ws/", className = "ws.RegistrarUsuarioResponse")
    @Action(input = "http://ws/Auth/registrarUsuarioRequest", output = "http://ws/Auth/registrarUsuarioResponse")
    public Boolean registrarUsuario(
        @WebParam(name = "usuario", targetNamespace = "")
        Usuario usuario);

    /**
     * 
     * @param usuario
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cerrarSesion", targetNamespace = "http://ws/", className = "ws.CerrarSesion")
    @ResponseWrapper(localName = "cerrarSesionResponse", targetNamespace = "http://ws/", className = "ws.CerrarSesionResponse")
    @Action(input = "http://ws/Auth/cerrarSesionRequest", output = "http://ws/Auth/cerrarSesionResponse")
    public Boolean cerrarSesion(
        @WebParam(name = "usuario", targetNamespace = "")
        Usuario usuario);

    /**
     * 
     * @param usuario
     * @param contrasena
     * @return
     *     returns ws.Usuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "iniciarSesion", targetNamespace = "http://ws/", className = "ws.IniciarSesion")
    @ResponseWrapper(localName = "iniciarSesionResponse", targetNamespace = "http://ws/", className = "ws.IniciarSesionResponse")
    @Action(input = "http://ws/Auth/iniciarSesionRequest", output = "http://ws/Auth/iniciarSesionResponse")
    public Usuario iniciarSesion(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena);

}
