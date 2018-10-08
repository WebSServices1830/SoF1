
package proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObtenerCircuitoByPremio_QNAME = new QName("http://ws/", "obtenerCircuitoByPremio");
    private final static QName _ObtenerCircuitoByPremioResponse_QNAME = new QName("http://ws/", "obtenerCircuitoByPremioResponse");
    private final static QName _ObtenerPilotosByEscuderia_QNAME = new QName("http://ws/", "obtenerPilotosByEscuderia");
    private final static QName _ObtenerPilotosByEscuderiaResponse_QNAME = new QName("http://ws/", "obtenerPilotosByEscuderiaResponse");
    private final static QName _ObtenerResultadoCarreraByPremio_QNAME = new QName("http://ws/", "obtenerResultadoCarreraByPremio");
    private final static QName _ObtenerResultadoCarreraByPremioResponse_QNAME = new QName("http://ws/", "obtenerResultadoCarreraByPremioResponse");
    private final static QName _ObtenerResultadoClasificacionByPremio_QNAME = new QName("http://ws/", "obtenerResultadoClasificacionByPremio");
    private final static QName _ObtenerResultadoClasificacionByPremioResponse_QNAME = new QName("http://ws/", "obtenerResultadoClasificacionByPremioResponse");
    private final static QName _ObtenerResultadoPracticaByPremio_QNAME = new QName("http://ws/", "obtenerResultadoPracticaByPremio");
    private final static QName _ObtenerResultadoPracticaByPremioResponse_QNAME = new QName("http://ws/", "obtenerResultadoPracticaByPremioResponse");
    private final static QName _SimularTorneo_QNAME = new QName("http://ws/", "simularTorneo");
    private final static QName _VerResultadoGeneral_QNAME = new QName("http://ws/", "verResultadoGeneral");
    private final static QName _VerResultadoGeneralResponse_QNAME = new QName("http://ws/", "verResultadoGeneralResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerCircuitoByPremio }
     * 
     */
    public ObtenerCircuitoByPremio createObtenerCircuitoByPremio() {
        return new ObtenerCircuitoByPremio();
    }

    /**
     * Create an instance of {@link ObtenerCircuitoByPremioResponse }
     * 
     */
    public ObtenerCircuitoByPremioResponse createObtenerCircuitoByPremioResponse() {
        return new ObtenerCircuitoByPremioResponse();
    }

    /**
     * Create an instance of {@link ObtenerPilotosByEscuderia }
     * 
     */
    public ObtenerPilotosByEscuderia createObtenerPilotosByEscuderia() {
        return new ObtenerPilotosByEscuderia();
    }

    /**
     * Create an instance of {@link ObtenerPilotosByEscuderiaResponse }
     * 
     */
    public ObtenerPilotosByEscuderiaResponse createObtenerPilotosByEscuderiaResponse() {
        return new ObtenerPilotosByEscuderiaResponse();
    }

    /**
     * Create an instance of {@link ObtenerResultadoCarreraByPremio }
     * 
     */
    public ObtenerResultadoCarreraByPremio createObtenerResultadoCarreraByPremio() {
        return new ObtenerResultadoCarreraByPremio();
    }

    /**
     * Create an instance of {@link ObtenerResultadoCarreraByPremioResponse }
     * 
     */
    public ObtenerResultadoCarreraByPremioResponse createObtenerResultadoCarreraByPremioResponse() {
        return new ObtenerResultadoCarreraByPremioResponse();
    }

    /**
     * Create an instance of {@link ObtenerResultadoClasificacionByPremio }
     * 
     */
    public ObtenerResultadoClasificacionByPremio createObtenerResultadoClasificacionByPremio() {
        return new ObtenerResultadoClasificacionByPremio();
    }

    /**
     * Create an instance of {@link ObtenerResultadoClasificacionByPremioResponse }
     * 
     */
    public ObtenerResultadoClasificacionByPremioResponse createObtenerResultadoClasificacionByPremioResponse() {
        return new ObtenerResultadoClasificacionByPremioResponse();
    }

    /**
     * Create an instance of {@link ObtenerResultadoPracticaByPremio }
     * 
     */
    public ObtenerResultadoPracticaByPremio createObtenerResultadoPracticaByPremio() {
        return new ObtenerResultadoPracticaByPremio();
    }

    /**
     * Create an instance of {@link ObtenerResultadoPracticaByPremioResponse }
     * 
     */
    public ObtenerResultadoPracticaByPremioResponse createObtenerResultadoPracticaByPremioResponse() {
        return new ObtenerResultadoPracticaByPremioResponse();
    }

    /**
     * Create an instance of {@link SimularTorneo }
     * 
     */
    public SimularTorneo createSimularTorneo() {
        return new SimularTorneo();
    }

    /**
     * Create an instance of {@link VerResultadoGeneral }
     * 
     */
    public VerResultadoGeneral createVerResultadoGeneral() {
        return new VerResultadoGeneral();
    }

    /**
     * Create an instance of {@link VerResultadoGeneralResponse }
     * 
     */
    public VerResultadoGeneralResponse createVerResultadoGeneralResponse() {
        return new VerResultadoGeneralResponse();
    }

    /**
     * Create an instance of {@link ResultadoClasificacion }
     * 
     */
    public ResultadoClasificacion createResultadoClasificacion() {
        return new ResultadoClasificacion();
    }

    /**
     * Create an instance of {@link Piloto }
     * 
     */
    public Piloto createPiloto() {
        return new Piloto();
    }

    /**
     * Create an instance of {@link Campeonato }
     * 
     */
    public Campeonato createCampeonato() {
        return new Campeonato();
    }

    /**
     * Create an instance of {@link Escuderia }
     * 
     */
    public Escuderia createEscuderia() {
        return new Escuderia();
    }

    /**
     * Create an instance of {@link Monoplaza }
     * 
     */
    public Monoplaza createMonoplaza() {
        return new Monoplaza();
    }

    /**
     * Create an instance of {@link Pais }
     * 
     */
    public Pais createPais() {
        return new Pais();
    }

    /**
     * Create an instance of {@link SesionClasificacion }
     * 
     */
    public SesionClasificacion createSesionClasificacion() {
        return new SesionClasificacion();
    }

    /**
     * Create an instance of {@link Circuito }
     * 
     */
    public Circuito createCircuito() {
        return new Circuito();
    }

    /**
     * Create an instance of {@link Foto }
     * 
     */
    public Foto createFoto() {
        return new Foto();
    }

    /**
     * Create an instance of {@link ResultadoCarrera }
     * 
     */
    public ResultadoCarrera createResultadoCarrera() {
        return new ResultadoCarrera();
    }

    /**
     * Create an instance of {@link SesionCarrera }
     * 
     */
    public SesionCarrera createSesionCarrera() {
        return new SesionCarrera();
    }

    /**
     * Create an instance of {@link ResultadoPractica }
     * 
     */
    public ResultadoPractica createResultadoPractica() {
        return new ResultadoPractica();
    }

    /**
     * Create an instance of {@link SesionPractica }
     * 
     */
    public SesionPractica createSesionPractica() {
        return new SesionPractica();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCircuitoByPremio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerCircuitoByPremio")
    public JAXBElement<ObtenerCircuitoByPremio> createObtenerCircuitoByPremio(ObtenerCircuitoByPremio value) {
        return new JAXBElement<ObtenerCircuitoByPremio>(_ObtenerCircuitoByPremio_QNAME, ObtenerCircuitoByPremio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCircuitoByPremioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerCircuitoByPremioResponse")
    public JAXBElement<ObtenerCircuitoByPremioResponse> createObtenerCircuitoByPremioResponse(ObtenerCircuitoByPremioResponse value) {
        return new JAXBElement<ObtenerCircuitoByPremioResponse>(_ObtenerCircuitoByPremioResponse_QNAME, ObtenerCircuitoByPremioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPilotosByEscuderia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerPilotosByEscuderia")
    public JAXBElement<ObtenerPilotosByEscuderia> createObtenerPilotosByEscuderia(ObtenerPilotosByEscuderia value) {
        return new JAXBElement<ObtenerPilotosByEscuderia>(_ObtenerPilotosByEscuderia_QNAME, ObtenerPilotosByEscuderia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPilotosByEscuderiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerPilotosByEscuderiaResponse")
    public JAXBElement<ObtenerPilotosByEscuderiaResponse> createObtenerPilotosByEscuderiaResponse(ObtenerPilotosByEscuderiaResponse value) {
        return new JAXBElement<ObtenerPilotosByEscuderiaResponse>(_ObtenerPilotosByEscuderiaResponse_QNAME, ObtenerPilotosByEscuderiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerResultadoCarreraByPremio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerResultadoCarreraByPremio")
    public JAXBElement<ObtenerResultadoCarreraByPremio> createObtenerResultadoCarreraByPremio(ObtenerResultadoCarreraByPremio value) {
        return new JAXBElement<ObtenerResultadoCarreraByPremio>(_ObtenerResultadoCarreraByPremio_QNAME, ObtenerResultadoCarreraByPremio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerResultadoCarreraByPremioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerResultadoCarreraByPremioResponse")
    public JAXBElement<ObtenerResultadoCarreraByPremioResponse> createObtenerResultadoCarreraByPremioResponse(ObtenerResultadoCarreraByPremioResponse value) {
        return new JAXBElement<ObtenerResultadoCarreraByPremioResponse>(_ObtenerResultadoCarreraByPremioResponse_QNAME, ObtenerResultadoCarreraByPremioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerResultadoClasificacionByPremio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerResultadoClasificacionByPremio")
    public JAXBElement<ObtenerResultadoClasificacionByPremio> createObtenerResultadoClasificacionByPremio(ObtenerResultadoClasificacionByPremio value) {
        return new JAXBElement<ObtenerResultadoClasificacionByPremio>(_ObtenerResultadoClasificacionByPremio_QNAME, ObtenerResultadoClasificacionByPremio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerResultadoClasificacionByPremioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerResultadoClasificacionByPremioResponse")
    public JAXBElement<ObtenerResultadoClasificacionByPremioResponse> createObtenerResultadoClasificacionByPremioResponse(ObtenerResultadoClasificacionByPremioResponse value) {
        return new JAXBElement<ObtenerResultadoClasificacionByPremioResponse>(_ObtenerResultadoClasificacionByPremioResponse_QNAME, ObtenerResultadoClasificacionByPremioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerResultadoPracticaByPremio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerResultadoPracticaByPremio")
    public JAXBElement<ObtenerResultadoPracticaByPremio> createObtenerResultadoPracticaByPremio(ObtenerResultadoPracticaByPremio value) {
        return new JAXBElement<ObtenerResultadoPracticaByPremio>(_ObtenerResultadoPracticaByPremio_QNAME, ObtenerResultadoPracticaByPremio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerResultadoPracticaByPremioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerResultadoPracticaByPremioResponse")
    public JAXBElement<ObtenerResultadoPracticaByPremioResponse> createObtenerResultadoPracticaByPremioResponse(ObtenerResultadoPracticaByPremioResponse value) {
        return new JAXBElement<ObtenerResultadoPracticaByPremioResponse>(_ObtenerResultadoPracticaByPremioResponse_QNAME, ObtenerResultadoPracticaByPremioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimularTorneo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "simularTorneo")
    public JAXBElement<SimularTorneo> createSimularTorneo(SimularTorneo value) {
        return new JAXBElement<SimularTorneo>(_SimularTorneo_QNAME, SimularTorneo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerResultadoGeneral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "verResultadoGeneral")
    public JAXBElement<VerResultadoGeneral> createVerResultadoGeneral(VerResultadoGeneral value) {
        return new JAXBElement<VerResultadoGeneral>(_VerResultadoGeneral_QNAME, VerResultadoGeneral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerResultadoGeneralResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "verResultadoGeneralResponse")
    public JAXBElement<VerResultadoGeneralResponse> createVerResultadoGeneralResponse(VerResultadoGeneralResponse value) {
        return new JAXBElement<VerResultadoGeneralResponse>(_VerResultadoGeneralResponse_QNAME, VerResultadoGeneralResponse.class, null, value);
    }

}
