
package ws;

import java.util.List;
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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Apuestas", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Apuestas {


    /**
     * 
     * @param idUsuario
     * @param idPiloto
     * @param cantidad
     * @param idPremio
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hacerApuesta", targetNamespace = "http://ws/", className = "ws.HacerApuesta")
    @ResponseWrapper(localName = "hacerApuestaResponse", targetNamespace = "http://ws/", className = "ws.HacerApuestaResponse")
    @Action(input = "http://ws/Apuestas/hacerApuestaRequest", output = "http://ws/Apuestas/hacerApuestaResponse")
    public boolean hacerApuesta(
        @WebParam(name = "idUsuario", targetNamespace = "")
        int idUsuario,
        @WebParam(name = "cantidad", targetNamespace = "")
        double cantidad,
        @WebParam(name = "idPremio", targetNamespace = "")
        int idPremio,
        @WebParam(name = "idPiloto", targetNamespace = "")
        int idPiloto);

    /**
     * 
     * @param idUsuario
     * @return
     *     returns java.util.List<ws.Apuesta>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerApuestasByUsuario", targetNamespace = "http://ws/", className = "ws.ObtenerApuestasByUsuario")
    @ResponseWrapper(localName = "obtenerApuestasByUsuarioResponse", targetNamespace = "http://ws/", className = "ws.ObtenerApuestasByUsuarioResponse")
    @Action(input = "http://ws/Apuestas/obtenerApuestasByUsuarioRequest", output = "http://ws/Apuestas/obtenerApuestasByUsuarioResponse")
    public List<Apuesta> obtenerApuestasByUsuario(
        @WebParam(name = "idUsuario", targetNamespace = "")
        int idUsuario);

}
