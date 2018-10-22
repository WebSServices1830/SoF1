
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _CalificarPiloto_QNAME = new QName("http://ws/", "calificarPiloto");
    private final static QName _CalificarPremio_QNAME = new QName("http://ws/", "calificarPremio");
    private final static QName _ObtenerCalificacionPromedioPiloto_QNAME = new QName("http://ws/", "obtenerCalificacionPromedioPiloto");
    private final static QName _ObtenerCalificacionPromedioPilotoResponse_QNAME = new QName("http://ws/", "obtenerCalificacionPromedioPilotoResponse");
    private final static QName _ObtenerCalificacionPromedioPremio_QNAME = new QName("http://ws/", "obtenerCalificacionPromedioPremio");
    private final static QName _ObtenerCalificacionPromedioPremioResponse_QNAME = new QName("http://ws/", "obtenerCalificacionPromedioPremioResponse");
    private final static QName _ObtenerCalificacionesPiloto_QNAME = new QName("http://ws/", "obtenerCalificacionesPiloto");
    private final static QName _ObtenerCalificacionesPilotoResponse_QNAME = new QName("http://ws/", "obtenerCalificacionesPilotoResponse");
    private final static QName _ObtenerCalificacionesPremio_QNAME = new QName("http://ws/", "obtenerCalificacionesPremio");
    private final static QName _ObtenerCalificacionesPremioResponse_QNAME = new QName("http://ws/", "obtenerCalificacionesPremioResponse");
    private final static QName _ObtenerTopPilotos_QNAME = new QName("http://ws/", "obtenerTopPilotos");
    private final static QName _ObtenerTopPilotosResponse_QNAME = new QName("http://ws/", "obtenerTopPilotosResponse");
    private final static QName _ObtenerTopPremios_QNAME = new QName("http://ws/", "obtenerTopPremios");
    private final static QName _ObtenerTopPremiosResponse_QNAME = new QName("http://ws/", "obtenerTopPremiosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalificarPiloto }
     * 
     */
    public CalificarPiloto createCalificarPiloto() {
        return new CalificarPiloto();
    }

    /**
     * Create an instance of {@link CalificarPremio }
     * 
     */
    public CalificarPremio createCalificarPremio() {
        return new CalificarPremio();
    }

    /**
     * Create an instance of {@link ObtenerCalificacionPromedioPiloto }
     * 
     */
    public ObtenerCalificacionPromedioPiloto createObtenerCalificacionPromedioPiloto() {
        return new ObtenerCalificacionPromedioPiloto();
    }

    /**
     * Create an instance of {@link ObtenerCalificacionPromedioPilotoResponse }
     * 
     */
    public ObtenerCalificacionPromedioPilotoResponse createObtenerCalificacionPromedioPilotoResponse() {
        return new ObtenerCalificacionPromedioPilotoResponse();
    }

    /**
     * Create an instance of {@link ObtenerCalificacionPromedioPremio }
     * 
     */
    public ObtenerCalificacionPromedioPremio createObtenerCalificacionPromedioPremio() {
        return new ObtenerCalificacionPromedioPremio();
    }

    /**
     * Create an instance of {@link ObtenerCalificacionPromedioPremioResponse }
     * 
     */
    public ObtenerCalificacionPromedioPremioResponse createObtenerCalificacionPromedioPremioResponse() {
        return new ObtenerCalificacionPromedioPremioResponse();
    }

    /**
     * Create an instance of {@link ObtenerCalificacionesPiloto }
     * 
     */
    public ObtenerCalificacionesPiloto createObtenerCalificacionesPiloto() {
        return new ObtenerCalificacionesPiloto();
    }

    /**
     * Create an instance of {@link ObtenerCalificacionesPilotoResponse }
     * 
     */
    public ObtenerCalificacionesPilotoResponse createObtenerCalificacionesPilotoResponse() {
        return new ObtenerCalificacionesPilotoResponse();
    }

    /**
     * Create an instance of {@link ObtenerCalificacionesPremio }
     * 
     */
    public ObtenerCalificacionesPremio createObtenerCalificacionesPremio() {
        return new ObtenerCalificacionesPremio();
    }

    /**
     * Create an instance of {@link ObtenerCalificacionesPremioResponse }
     * 
     */
    public ObtenerCalificacionesPremioResponse createObtenerCalificacionesPremioResponse() {
        return new ObtenerCalificacionesPremioResponse();
    }

    /**
     * Create an instance of {@link ObtenerTopPilotos }
     * 
     */
    public ObtenerTopPilotos createObtenerTopPilotos() {
        return new ObtenerTopPilotos();
    }

    /**
     * Create an instance of {@link ObtenerTopPilotosResponse }
     * 
     */
    public ObtenerTopPilotosResponse createObtenerTopPilotosResponse() {
        return new ObtenerTopPilotosResponse();
    }

    /**
     * Create an instance of {@link ObtenerTopPremios }
     * 
     */
    public ObtenerTopPremios createObtenerTopPremios() {
        return new ObtenerTopPremios();
    }

    /**
     * Create an instance of {@link ObtenerTopPremiosResponse }
     * 
     */
    public ObtenerTopPremiosResponse createObtenerTopPremiosResponse() {
        return new ObtenerTopPremiosResponse();
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
     * Create an instance of {@link CalificacionPiloto }
     * 
     */
    public CalificacionPiloto createCalificacionPiloto() {
        return new CalificacionPiloto();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link Premio }
     * 
     */
    public Premio createPremio() {
        return new Premio();
    }

    /**
     * Create an instance of {@link Circuito }
     * 
     */
    public Circuito createCircuito() {
        return new Circuito();
    }

    /**
     * Create an instance of {@link CalificacionPremio }
     * 
     */
    public CalificacionPremio createCalificacionPremio() {
        return new CalificacionPremio();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalificarPiloto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "calificarPiloto")
    public JAXBElement<CalificarPiloto> createCalificarPiloto(CalificarPiloto value) {
        return new JAXBElement<CalificarPiloto>(_CalificarPiloto_QNAME, CalificarPiloto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalificarPremio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "calificarPremio")
    public JAXBElement<CalificarPremio> createCalificarPremio(CalificarPremio value) {
        return new JAXBElement<CalificarPremio>(_CalificarPremio_QNAME, CalificarPremio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCalificacionPromedioPiloto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerCalificacionPromedioPiloto")
    public JAXBElement<ObtenerCalificacionPromedioPiloto> createObtenerCalificacionPromedioPiloto(ObtenerCalificacionPromedioPiloto value) {
        return new JAXBElement<ObtenerCalificacionPromedioPiloto>(_ObtenerCalificacionPromedioPiloto_QNAME, ObtenerCalificacionPromedioPiloto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCalificacionPromedioPilotoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerCalificacionPromedioPilotoResponse")
    public JAXBElement<ObtenerCalificacionPromedioPilotoResponse> createObtenerCalificacionPromedioPilotoResponse(ObtenerCalificacionPromedioPilotoResponse value) {
        return new JAXBElement<ObtenerCalificacionPromedioPilotoResponse>(_ObtenerCalificacionPromedioPilotoResponse_QNAME, ObtenerCalificacionPromedioPilotoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCalificacionPromedioPremio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerCalificacionPromedioPremio")
    public JAXBElement<ObtenerCalificacionPromedioPremio> createObtenerCalificacionPromedioPremio(ObtenerCalificacionPromedioPremio value) {
        return new JAXBElement<ObtenerCalificacionPromedioPremio>(_ObtenerCalificacionPromedioPremio_QNAME, ObtenerCalificacionPromedioPremio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCalificacionPromedioPremioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerCalificacionPromedioPremioResponse")
    public JAXBElement<ObtenerCalificacionPromedioPremioResponse> createObtenerCalificacionPromedioPremioResponse(ObtenerCalificacionPromedioPremioResponse value) {
        return new JAXBElement<ObtenerCalificacionPromedioPremioResponse>(_ObtenerCalificacionPromedioPremioResponse_QNAME, ObtenerCalificacionPromedioPremioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCalificacionesPiloto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerCalificacionesPiloto")
    public JAXBElement<ObtenerCalificacionesPiloto> createObtenerCalificacionesPiloto(ObtenerCalificacionesPiloto value) {
        return new JAXBElement<ObtenerCalificacionesPiloto>(_ObtenerCalificacionesPiloto_QNAME, ObtenerCalificacionesPiloto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCalificacionesPilotoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerCalificacionesPilotoResponse")
    public JAXBElement<ObtenerCalificacionesPilotoResponse> createObtenerCalificacionesPilotoResponse(ObtenerCalificacionesPilotoResponse value) {
        return new JAXBElement<ObtenerCalificacionesPilotoResponse>(_ObtenerCalificacionesPilotoResponse_QNAME, ObtenerCalificacionesPilotoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCalificacionesPremio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerCalificacionesPremio")
    public JAXBElement<ObtenerCalificacionesPremio> createObtenerCalificacionesPremio(ObtenerCalificacionesPremio value) {
        return new JAXBElement<ObtenerCalificacionesPremio>(_ObtenerCalificacionesPremio_QNAME, ObtenerCalificacionesPremio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCalificacionesPremioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerCalificacionesPremioResponse")
    public JAXBElement<ObtenerCalificacionesPremioResponse> createObtenerCalificacionesPremioResponse(ObtenerCalificacionesPremioResponse value) {
        return new JAXBElement<ObtenerCalificacionesPremioResponse>(_ObtenerCalificacionesPremioResponse_QNAME, ObtenerCalificacionesPremioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTopPilotos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerTopPilotos")
    public JAXBElement<ObtenerTopPilotos> createObtenerTopPilotos(ObtenerTopPilotos value) {
        return new JAXBElement<ObtenerTopPilotos>(_ObtenerTopPilotos_QNAME, ObtenerTopPilotos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTopPilotosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerTopPilotosResponse")
    public JAXBElement<ObtenerTopPilotosResponse> createObtenerTopPilotosResponse(ObtenerTopPilotosResponse value) {
        return new JAXBElement<ObtenerTopPilotosResponse>(_ObtenerTopPilotosResponse_QNAME, ObtenerTopPilotosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTopPremios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerTopPremios")
    public JAXBElement<ObtenerTopPremios> createObtenerTopPremios(ObtenerTopPremios value) {
        return new JAXBElement<ObtenerTopPremios>(_ObtenerTopPremios_QNAME, ObtenerTopPremios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTopPremiosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerTopPremiosResponse")
    public JAXBElement<ObtenerTopPremiosResponse> createObtenerTopPremiosResponse(ObtenerTopPremiosResponse value) {
        return new JAXBElement<ObtenerTopPremiosResponse>(_ObtenerTopPremiosResponse_QNAME, ObtenerTopPremiosResponse.class, null, value);
    }

}
