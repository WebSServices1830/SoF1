
package proxy;

import java.util.List;
import javax.jws.Oneway;
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
@WebService(name = "Opiniones", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Opiniones {


    /**
     * 
     * @return
     *     returns java.util.List<proxy.Piloto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerTopPilotos", targetNamespace = "http://ws/", className = "proxy.ObtenerTopPilotos")
    @ResponseWrapper(localName = "obtenerTopPilotosResponse", targetNamespace = "http://ws/", className = "proxy.ObtenerTopPilotosResponse")
    @Action(input = "http://ws/Opiniones/obtenerTopPilotosRequest", output = "http://ws/Opiniones/obtenerTopPilotosResponse")
    public List<Piloto> obtenerTopPilotos();

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Premio>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerTopPremios", targetNamespace = "http://ws/", className = "proxy.ObtenerTopPremios")
    @ResponseWrapper(localName = "obtenerTopPremiosResponse", targetNamespace = "http://ws/", className = "proxy.ObtenerTopPremiosResponse")
    @Action(input = "http://ws/Opiniones/obtenerTopPremiosRequest", output = "http://ws/Opiniones/obtenerTopPremiosResponse")
    public List<Premio> obtenerTopPremios();

    /**
     * 
     * @param idPremio
     * @return
     *     returns java.util.List<proxy.Calificacion>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerCalificacionesPremio", targetNamespace = "http://ws/", className = "proxy.ObtenerCalificacionesPremio")
    @ResponseWrapper(localName = "obtenerCalificacionesPremioResponse", targetNamespace = "http://ws/", className = "proxy.ObtenerCalificacionesPremioResponse")
    @Action(input = "http://ws/Opiniones/obtenerCalificacionesPremioRequest", output = "http://ws/Opiniones/obtenerCalificacionesPremioResponse")
    public List<Calificacion> obtenerCalificacionesPremio(
        @WebParam(name = "idPremio", targetNamespace = "")
        int idPremio);

    /**
     * 
     * @param idPiloto
     * @return
     *     returns java.util.List<proxy.Calificacion>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerCalificacionesPiloto", targetNamespace = "http://ws/", className = "proxy.ObtenerCalificacionesPiloto")
    @ResponseWrapper(localName = "obtenerCalificacionesPilotoResponse", targetNamespace = "http://ws/", className = "proxy.ObtenerCalificacionesPilotoResponse")
    @Action(input = "http://ws/Opiniones/obtenerCalificacionesPilotoRequest", output = "http://ws/Opiniones/obtenerCalificacionesPilotoResponse")
    public List<Calificacion> obtenerCalificacionesPiloto(
        @WebParam(name = "idPiloto", targetNamespace = "")
        int idPiloto);

    /**
     * 
     * @param calificacion
     * @param idUsuario
     * @param idPiloto
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "calificarPiloto", targetNamespace = "http://ws/", className = "proxy.CalificarPiloto")
    @Action(input = "http://ws/Opiniones/calificarPiloto")
    public void calificarPiloto(
        @WebParam(name = "idUsuario", targetNamespace = "")
        int idUsuario,
        @WebParam(name = "idPiloto", targetNamespace = "")
        int idPiloto,
        @WebParam(name = "calificacion", targetNamespace = "")
        Calificacion calificacion);

    /**
     * 
     * @param calificacion
     * @param idUsuario
     * @param idPremio
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "calificarPremio", targetNamespace = "http://ws/", className = "proxy.CalificarPremio")
    @Action(input = "http://ws/Opiniones/calificarPremio")
    public void calificarPremio(
        @WebParam(name = "idUsuario", targetNamespace = "")
        int idUsuario,
        @WebParam(name = "idPremio", targetNamespace = "")
        int idPremio,
        @WebParam(name = "calificacion", targetNamespace = "")
        Calificacion calificacion);

}
