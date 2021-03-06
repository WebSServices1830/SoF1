
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
@WebService(name = "Resultados", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Resultados {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "simularTorneo", targetNamespace = "http://ws/", className = "ws.SimularTorneo")
    @Action(input = "http://ws/Resultados/simularTorneo")
    public void simularTorneo(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param idSesionClasificacion
     * @return
     *     returns java.util.List<ws.ResultadoClasificacion>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerResultadoClasificacionBySesionClasificacion", targetNamespace = "http://ws/", className = "ws.ObtenerResultadoClasificacionBySesionClasificacion")
    @ResponseWrapper(localName = "obtenerResultadoClasificacionBySesionClasificacionResponse", targetNamespace = "http://ws/", className = "ws.ObtenerResultadoClasificacionBySesionClasificacionResponse")
    @Action(input = "http://ws/Resultados/obtenerResultadoClasificacionBySesionClasificacionRequest", output = "http://ws/Resultados/obtenerResultadoClasificacionBySesionClasificacionResponse")
    public List<ResultadoClasificacion> obtenerResultadoClasificacionBySesionClasificacion(
        @WebParam(name = "idSesionClasificacion", targetNamespace = "")
        int idSesionClasificacion);

    /**
     * 
     * @param idSesionPractica
     * @return
     *     returns java.util.List<ws.ResultadoPractica>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerResultadoPracticaBySesionPractica", targetNamespace = "http://ws/", className = "ws.ObtenerResultadoPracticaBySesionPractica")
    @ResponseWrapper(localName = "obtenerResultadoPracticaBySesionPracticaResponse", targetNamespace = "http://ws/", className = "ws.ObtenerResultadoPracticaBySesionPracticaResponse")
    @Action(input = "http://ws/Resultados/obtenerResultadoPracticaBySesionPracticaRequest", output = "http://ws/Resultados/obtenerResultadoPracticaBySesionPracticaResponse")
    public List<ResultadoPractica> obtenerResultadoPracticaBySesionPractica(
        @WebParam(name = "idSesionPractica", targetNamespace = "")
        int idSesionPractica);

    /**
     * 
     * @param idPremio
     * @return
     *     returns ws.SesionClasificacion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerSesionClasificacionByPremio", targetNamespace = "http://ws/", className = "ws.ObtenerSesionClasificacionByPremio")
    @ResponseWrapper(localName = "obtenerSesionClasificacionByPremioResponse", targetNamespace = "http://ws/", className = "ws.ObtenerSesionClasificacionByPremioResponse")
    @Action(input = "http://ws/Resultados/obtenerSesionClasificacionByPremioRequest", output = "http://ws/Resultados/obtenerSesionClasificacionByPremioResponse")
    public SesionClasificacion obtenerSesionClasificacionByPremio(
        @WebParam(name = "idPremio", targetNamespace = "")
        int idPremio);

    /**
     * 
     * @param idSesionCarrera
     * @return
     *     returns java.util.List<ws.ResultadoCarrera>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerResultadoCarreraBySesionCarrera", targetNamespace = "http://ws/", className = "ws.ObtenerResultadoCarreraBySesionCarrera")
    @ResponseWrapper(localName = "obtenerResultadoCarreraBySesionCarreraResponse", targetNamespace = "http://ws/", className = "ws.ObtenerResultadoCarreraBySesionCarreraResponse")
    @Action(input = "http://ws/Resultados/obtenerResultadoCarreraBySesionCarreraRequest", output = "http://ws/Resultados/obtenerResultadoCarreraBySesionCarreraResponse")
    public List<ResultadoCarrera> obtenerResultadoCarreraBySesionCarrera(
        @WebParam(name = "idSesionCarrera", targetNamespace = "")
        int idSesionCarrera);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<ws.TablaGeneral>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "verResultadoGeneral", targetNamespace = "http://ws/", className = "ws.VerResultadoGeneral")
    @ResponseWrapper(localName = "verResultadoGeneralResponse", targetNamespace = "http://ws/", className = "ws.VerResultadoGeneralResponse")
    @Action(input = "http://ws/Resultados/verResultadoGeneralRequest", output = "http://ws/Resultados/verResultadoGeneralResponse")
    public List<TablaGeneral> verResultadoGeneral(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param idPremio
     * @return
     *     returns ws.SesionPractica
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerSesionPracticaByPremio", targetNamespace = "http://ws/", className = "ws.ObtenerSesionPracticaByPremio")
    @ResponseWrapper(localName = "obtenerSesionPracticaByPremioResponse", targetNamespace = "http://ws/", className = "ws.ObtenerSesionPracticaByPremioResponse")
    @Action(input = "http://ws/Resultados/obtenerSesionPracticaByPremioRequest", output = "http://ws/Resultados/obtenerSesionPracticaByPremioResponse")
    public SesionPractica obtenerSesionPracticaByPremio(
        @WebParam(name = "idPremio", targetNamespace = "")
        int idPremio);

    /**
     * 
     * @param idPremio
     * @return
     *     returns ws.SesionCarrera
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerSesionCarreraByPremio", targetNamespace = "http://ws/", className = "ws.ObtenerSesionCarreraByPremio")
    @ResponseWrapper(localName = "obtenerSesionCarreraByPremioResponse", targetNamespace = "http://ws/", className = "ws.ObtenerSesionCarreraByPremioResponse")
    @Action(input = "http://ws/Resultados/obtenerSesionCarreraByPremioRequest", output = "http://ws/Resultados/obtenerSesionCarreraByPremioResponse")
    public SesionCarrera obtenerSesionCarreraByPremio(
        @WebParam(name = "idPremio", targetNamespace = "")
        int idPremio);

}
