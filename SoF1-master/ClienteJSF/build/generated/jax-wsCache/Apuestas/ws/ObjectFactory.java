
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

    private final static QName _HacerApuesta_QNAME = new QName("http://ws/", "hacerApuesta");
    private final static QName _HacerApuestaResponse_QNAME = new QName("http://ws/", "hacerApuestaResponse");
    private final static QName _ObtenerApuestasByUsuario_QNAME = new QName("http://ws/", "obtenerApuestasByUsuario");
    private final static QName _ObtenerApuestasByUsuarioResponse_QNAME = new QName("http://ws/", "obtenerApuestasByUsuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HacerApuesta }
     * 
     */
    public HacerApuesta createHacerApuesta() {
        return new HacerApuesta();
    }

    /**
     * Create an instance of {@link HacerApuestaResponse }
     * 
     */
    public HacerApuestaResponse createHacerApuestaResponse() {
        return new HacerApuestaResponse();
    }

    /**
     * Create an instance of {@link ObtenerApuestasByUsuario }
     * 
     */
    public ObtenerApuestasByUsuario createObtenerApuestasByUsuario() {
        return new ObtenerApuestasByUsuario();
    }

    /**
     * Create an instance of {@link ObtenerApuestasByUsuarioResponse }
     * 
     */
    public ObtenerApuestasByUsuarioResponse createObtenerApuestasByUsuarioResponse() {
        return new ObtenerApuestasByUsuarioResponse();
    }

    /**
     * Create an instance of {@link Apuesta }
     * 
     */
    public Apuesta createApuesta() {
        return new Apuesta();
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
     * Create an instance of {@link SesionCarrera }
     * 
     */
    public SesionCarrera createSesionCarrera() {
        return new SesionCarrera();
    }

    /**
     * Create an instance of {@link SesionClasificacion }
     * 
     */
    public SesionClasificacion createSesionClasificacion() {
        return new SesionClasificacion();
    }

    /**
     * Create an instance of {@link SesionPractica }
     * 
     */
    public SesionPractica createSesionPractica() {
        return new SesionPractica();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HacerApuesta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "hacerApuesta")
    public JAXBElement<HacerApuesta> createHacerApuesta(HacerApuesta value) {
        return new JAXBElement<HacerApuesta>(_HacerApuesta_QNAME, HacerApuesta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HacerApuestaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "hacerApuestaResponse")
    public JAXBElement<HacerApuestaResponse> createHacerApuestaResponse(HacerApuestaResponse value) {
        return new JAXBElement<HacerApuestaResponse>(_HacerApuestaResponse_QNAME, HacerApuestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerApuestasByUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerApuestasByUsuario")
    public JAXBElement<ObtenerApuestasByUsuario> createObtenerApuestasByUsuario(ObtenerApuestasByUsuario value) {
        return new JAXBElement<ObtenerApuestasByUsuario>(_ObtenerApuestasByUsuario_QNAME, ObtenerApuestasByUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerApuestasByUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerApuestasByUsuarioResponse")
    public JAXBElement<ObtenerApuestasByUsuarioResponse> createObtenerApuestasByUsuarioResponse(ObtenerApuestasByUsuarioResponse value) {
        return new JAXBElement<ObtenerApuestasByUsuarioResponse>(_ObtenerApuestasByUsuarioResponse_QNAME, ObtenerApuestasByUsuarioResponse.class, null, value);
    }

}
