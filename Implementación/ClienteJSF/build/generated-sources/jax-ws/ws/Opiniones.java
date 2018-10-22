
package ws;

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
     * @param idUsuario
     * @param calificacionPremio
     * @param idPremio
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "calificarPremio", targetNamespace = "http://ws/", className = "ws.CalificarPremio")
    @Action(input = "http://ws/Opiniones/calificarPremio")
    public void calificarPremio(
        @WebParam(name = "idUsuario", targetNamespace = "")
        int idUsuario,
        @WebParam(name = "idPremio", targetNamespace = "")
        int idPremio,
        @WebParam(name = "calificacionPremio", targetNamespace = "")
        CalificacionPremio calificacionPremio);

    /**
     * 
     * @param calificacionPiloto
     * @param idUsuario
     * @param idPiloto
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "calificarPiloto", targetNamespace = "http://ws/", className = "ws.CalificarPiloto")
    @Action(input = "http://ws/Opiniones/calificarPiloto")
    public void calificarPiloto(
        @WebParam(name = "idUsuario", targetNamespace = "")
        int idUsuario,
        @WebParam(name = "idPiloto", targetNamespace = "")
        int idPiloto,
        @WebParam(name = "calificacionPiloto", targetNamespace = "")
        CalificacionPiloto calificacionPiloto);

    /**
     * 
     * @param idPremio
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerCalificacionPromedioPremio", targetNamespace = "http://ws/", className = "ws.ObtenerCalificacionPromedioPremio")
    @ResponseWrapper(localName = "obtenerCalificacionPromedioPremioResponse", targetNamespace = "http://ws/", className = "ws.ObtenerCalificacionPromedioPremioResponse")
    @Action(input = "http://ws/Opiniones/obtenerCalificacionPromedioPremioRequest", output = "http://ws/Opiniones/obtenerCalificacionPromedioPremioResponse")
    public double obtenerCalificacionPromedioPremio(
        @WebParam(name = "idPremio", targetNamespace = "")
        int idPremio);

    /**
     * 
     * @param idPiloto
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerCalificacionPromedioPiloto", targetNamespace = "http://ws/", className = "ws.ObtenerCalificacionPromedioPiloto")
    @ResponseWrapper(localName = "obtenerCalificacionPromedioPilotoResponse", targetNamespace = "http://ws/", className = "ws.ObtenerCalificacionPromedioPilotoResponse")
    @Action(input = "http://ws/Opiniones/obtenerCalificacionPromedioPilotoRequest", output = "http://ws/Opiniones/obtenerCalificacionPromedioPilotoResponse")
    public double obtenerCalificacionPromedioPiloto(
        @WebParam(name = "idPiloto", targetNamespace = "")
        int idPiloto);

    /**
     * 
     * @param idPremio
     * @return
     *     returns java.util.List<ws.CalificacionPremio>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerCalificacionesPremio", targetNamespace = "http://ws/", className = "ws.ObtenerCalificacionesPremio")
    @ResponseWrapper(localName = "obtenerCalificacionesPremioResponse", targetNamespace = "http://ws/", className = "ws.ObtenerCalificacionesPremioResponse")
    @Action(input = "http://ws/Opiniones/obtenerCalificacionesPremioRequest", output = "http://ws/Opiniones/obtenerCalificacionesPremioResponse")
    public List<CalificacionPremio> obtenerCalificacionesPremio(
        @WebParam(name = "idPremio", targetNamespace = "")
        int idPremio);

    /**
     * 
     * @return
     *     returns java.util.List<ws.Premio>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerTopPremios", targetNamespace = "http://ws/", className = "ws.ObtenerTopPremios")
    @ResponseWrapper(localName = "obtenerTopPremiosResponse", targetNamespace = "http://ws/", className = "ws.ObtenerTopPremiosResponse")
    @Action(input = "http://ws/Opiniones/obtenerTopPremiosRequest", output = "http://ws/Opiniones/obtenerTopPremiosResponse")
    public List<Premio> obtenerTopPremios();

    /**
     * 
     * @return
     *     returns java.util.List<ws.Piloto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerTopPilotos", targetNamespace = "http://ws/", className = "ws.ObtenerTopPilotos")
    @ResponseWrapper(localName = "obtenerTopPilotosResponse", targetNamespace = "http://ws/", className = "ws.ObtenerTopPilotosResponse")
    @Action(input = "http://ws/Opiniones/obtenerTopPilotosRequest", output = "http://ws/Opiniones/obtenerTopPilotosResponse")
    public List<Piloto> obtenerTopPilotos();

    /**
     * 
     * @param idPiloto
     * @return
     *     returns java.util.List<ws.CalificacionPiloto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerCalificacionesPiloto", targetNamespace = "http://ws/", className = "ws.ObtenerCalificacionesPiloto")
    @ResponseWrapper(localName = "obtenerCalificacionesPilotoResponse", targetNamespace = "http://ws/", className = "ws.ObtenerCalificacionesPilotoResponse")
    @Action(input = "http://ws/Opiniones/obtenerCalificacionesPilotoRequest", output = "http://ws/Opiniones/obtenerCalificacionesPilotoResponse")
    public List<CalificacionPiloto> obtenerCalificacionesPiloto(
        @WebParam(name = "idPiloto", targetNamespace = "")
        int idPiloto);

}
