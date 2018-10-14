
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

    private final static QName _CerrarSesion_QNAME = new QName("http://ws/", "cerrarSesion");
    private final static QName _CerrarSesionResponse_QNAME = new QName("http://ws/", "cerrarSesionResponse");
    private final static QName _IniciarSesion_QNAME = new QName("http://ws/", "iniciarSesion");
    private final static QName _IniciarSesionResponse_QNAME = new QName("http://ws/", "iniciarSesionResponse");
    private final static QName _RegistrarUsuario_QNAME = new QName("http://ws/", "registrarUsuario");
    private final static QName _RegistrarUsuarioResponse_QNAME = new QName("http://ws/", "registrarUsuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CerrarSesion }
     * 
     */
    public CerrarSesion createCerrarSesion() {
        return new CerrarSesion();
    }

    /**
     * Create an instance of {@link CerrarSesionResponse }
     * 
     */
    public CerrarSesionResponse createCerrarSesionResponse() {
        return new CerrarSesionResponse();
    }

    /**
     * Create an instance of {@link IniciarSesion }
     * 
     */
    public IniciarSesion createIniciarSesion() {
        return new IniciarSesion();
    }

    /**
     * Create an instance of {@link IniciarSesionResponse }
     * 
     */
    public IniciarSesionResponse createIniciarSesionResponse() {
        return new IniciarSesionResponse();
    }

    /**
     * Create an instance of {@link RegistrarUsuario }
     * 
     */
    public RegistrarUsuario createRegistrarUsuario() {
        return new RegistrarUsuario();
    }

    /**
     * Create an instance of {@link RegistrarUsuarioResponse }
     * 
     */
    public RegistrarUsuarioResponse createRegistrarUsuarioResponse() {
        return new RegistrarUsuarioResponse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
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
     * Create an instance of {@link Foto }
     * 
     */
    public Foto createFoto() {
        return new Foto();
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
     * Create an instance of {@link ResultadoClasificacion }
     * 
     */
    public ResultadoClasificacion createResultadoClasificacion() {
        return new ResultadoClasificacion();
    }

    /**
     * Create an instance of {@link SesionPractica }
     * 
     */
    public SesionPractica createSesionPractica() {
        return new SesionPractica();
    }

    /**
     * Create an instance of {@link ResultadoPractica }
     * 
     */
    public ResultadoPractica createResultadoPractica() {
        return new ResultadoPractica();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CerrarSesion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "cerrarSesion")
    public JAXBElement<CerrarSesion> createCerrarSesion(CerrarSesion value) {
        return new JAXBElement<CerrarSesion>(_CerrarSesion_QNAME, CerrarSesion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CerrarSesionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "cerrarSesionResponse")
    public JAXBElement<CerrarSesionResponse> createCerrarSesionResponse(CerrarSesionResponse value) {
        return new JAXBElement<CerrarSesionResponse>(_CerrarSesionResponse_QNAME, CerrarSesionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IniciarSesion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "iniciarSesion")
    public JAXBElement<IniciarSesion> createIniciarSesion(IniciarSesion value) {
        return new JAXBElement<IniciarSesion>(_IniciarSesion_QNAME, IniciarSesion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IniciarSesionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "iniciarSesionResponse")
    public JAXBElement<IniciarSesionResponse> createIniciarSesionResponse(IniciarSesionResponse value) {
        return new JAXBElement<IniciarSesionResponse>(_IniciarSesionResponse_QNAME, IniciarSesionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registrarUsuario")
    public JAXBElement<RegistrarUsuario> createRegistrarUsuario(RegistrarUsuario value) {
        return new JAXBElement<RegistrarUsuario>(_RegistrarUsuario_QNAME, RegistrarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "registrarUsuarioResponse")
    public JAXBElement<RegistrarUsuarioResponse> createRegistrarUsuarioResponse(RegistrarUsuarioResponse value) {
        return new JAXBElement<RegistrarUsuarioResponse>(_RegistrarUsuarioResponse_QNAME, RegistrarUsuarioResponse.class, null, value);
    }

}
