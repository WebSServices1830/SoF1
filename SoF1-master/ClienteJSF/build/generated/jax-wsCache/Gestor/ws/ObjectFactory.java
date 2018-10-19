
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

    private final static QName _CreateCampeonato_QNAME = new QName("http://ws/", "createCampeonato");
    private final static QName _CreateCircuito_QNAME = new QName("http://ws/", "createCircuito");
    private final static QName _CreateEscuderia_QNAME = new QName("http://ws/", "createEscuderia");
    private final static QName _CreateMonoplaza_QNAME = new QName("http://ws/", "createMonoplaza");
    private final static QName _CreatePais_QNAME = new QName("http://ws/", "createPais");
    private final static QName _CreatePiloto_QNAME = new QName("http://ws/", "createPiloto");
    private final static QName _CreatePremio_QNAME = new QName("http://ws/", "createPremio");
    private final static QName _EditCampeonato_QNAME = new QName("http://ws/", "editCampeonato");
    private final static QName _EditCircuito_QNAME = new QName("http://ws/", "editCircuito");
    private final static QName _EditEscuderia_QNAME = new QName("http://ws/", "editEscuderia");
    private final static QName _EditMonoplaza_QNAME = new QName("http://ws/", "editMonoplaza");
    private final static QName _EditPais_QNAME = new QName("http://ws/", "editPais");
    private final static QName _EditPiloto_QNAME = new QName("http://ws/", "editPiloto");
    private final static QName _EditPremio_QNAME = new QName("http://ws/", "editPremio");
    private final static QName _FindAllCampeonato_QNAME = new QName("http://ws/", "findAllCampeonato");
    private final static QName _FindAllCampeonatoResponse_QNAME = new QName("http://ws/", "findAllCampeonatoResponse");
    private final static QName _FindAllCircuito_QNAME = new QName("http://ws/", "findAllCircuito");
    private final static QName _FindAllCircuitoResponse_QNAME = new QName("http://ws/", "findAllCircuitoResponse");
    private final static QName _FindAllEscuderia_QNAME = new QName("http://ws/", "findAllEscuderia");
    private final static QName _FindAllEscuderiaResponse_QNAME = new QName("http://ws/", "findAllEscuderiaResponse");
    private final static QName _FindAllMonoplaza_QNAME = new QName("http://ws/", "findAllMonoplaza");
    private final static QName _FindAllMonoplazaResponse_QNAME = new QName("http://ws/", "findAllMonoplazaResponse");
    private final static QName _FindAllPais_QNAME = new QName("http://ws/", "findAllPais");
    private final static QName _FindAllPaisResponse_QNAME = new QName("http://ws/", "findAllPaisResponse");
    private final static QName _FindAllPiloto_QNAME = new QName("http://ws/", "findAllPiloto");
    private final static QName _FindAllPilotoResponse_QNAME = new QName("http://ws/", "findAllPilotoResponse");
    private final static QName _FindAllPremio_QNAME = new QName("http://ws/", "findAllPremio");
    private final static QName _FindAllPremioResponse_QNAME = new QName("http://ws/", "findAllPremioResponse");
    private final static QName _FindCampeonato_QNAME = new QName("http://ws/", "findCampeonato");
    private final static QName _FindCampeonatoResponse_QNAME = new QName("http://ws/", "findCampeonatoResponse");
    private final static QName _FindCircuito_QNAME = new QName("http://ws/", "findCircuito");
    private final static QName _FindCircuitoResponse_QNAME = new QName("http://ws/", "findCircuitoResponse");
    private final static QName _FindEscuderia_QNAME = new QName("http://ws/", "findEscuderia");
    private final static QName _FindEscuderiaResponse_QNAME = new QName("http://ws/", "findEscuderiaResponse");
    private final static QName _FindMonoplaza_QNAME = new QName("http://ws/", "findMonoplaza");
    private final static QName _FindMonoplazaResponse_QNAME = new QName("http://ws/", "findMonoplazaResponse");
    private final static QName _FindPais_QNAME = new QName("http://ws/", "findPais");
    private final static QName _FindPaisResponse_QNAME = new QName("http://ws/", "findPaisResponse");
    private final static QName _FindPiloto_QNAME = new QName("http://ws/", "findPiloto");
    private final static QName _FindPilotoResponse_QNAME = new QName("http://ws/", "findPilotoResponse");
    private final static QName _FindPremio_QNAME = new QName("http://ws/", "findPremio");
    private final static QName _FindPremioResponse_QNAME = new QName("http://ws/", "findPremioResponse");
    private final static QName _ObtenerEscuderiasByCampeonato_QNAME = new QName("http://ws/", "obtenerEscuderiasByCampeonato");
    private final static QName _ObtenerEscuderiasByCampeonatoResponse_QNAME = new QName("http://ws/", "obtenerEscuderiasByCampeonatoResponse");
    private final static QName _ObtenerMonoplazasByCampeonato_QNAME = new QName("http://ws/", "obtenerMonoplazasByCampeonato");
    private final static QName _ObtenerMonoplazasByCampeonatoResponse_QNAME = new QName("http://ws/", "obtenerMonoplazasByCampeonatoResponse");
    private final static QName _ObtenerPilotosByCampeonato_QNAME = new QName("http://ws/", "obtenerPilotosByCampeonato");
    private final static QName _ObtenerPilotosByCampeonatoResponse_QNAME = new QName("http://ws/", "obtenerPilotosByCampeonatoResponse");
    private final static QName _ObtenerPremiosByCampeonato_QNAME = new QName("http://ws/", "obtenerPremiosByCampeonato");
    private final static QName _ObtenerPremiosByCampeonatoResponse_QNAME = new QName("http://ws/", "obtenerPremiosByCampeonatoResponse");
    private final static QName _RemoveCampeonato_QNAME = new QName("http://ws/", "removeCampeonato");
    private final static QName _RemoveCircuito_QNAME = new QName("http://ws/", "removeCircuito");
    private final static QName _RemoveEscuderia_QNAME = new QName("http://ws/", "removeEscuderia");
    private final static QName _RemoveMonoplaza_QNAME = new QName("http://ws/", "removeMonoplaza");
    private final static QName _RemovePais_QNAME = new QName("http://ws/", "removePais");
    private final static QName _RemovePiloto_QNAME = new QName("http://ws/", "removePiloto");
    private final static QName _RemovePremio_QNAME = new QName("http://ws/", "removePremio");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateCampeonato }
     * 
     */
    public CreateCampeonato createCreateCampeonato() {
        return new CreateCampeonato();
    }

    /**
     * Create an instance of {@link CreateCircuito }
     * 
     */
    public CreateCircuito createCreateCircuito() {
        return new CreateCircuito();
    }

    /**
     * Create an instance of {@link CreateEscuderia }
     * 
     */
    public CreateEscuderia createCreateEscuderia() {
        return new CreateEscuderia();
    }

    /**
     * Create an instance of {@link CreateMonoplaza }
     * 
     */
    public CreateMonoplaza createCreateMonoplaza() {
        return new CreateMonoplaza();
    }

    /**
     * Create an instance of {@link CreatePais }
     * 
     */
    public CreatePais createCreatePais() {
        return new CreatePais();
    }

    /**
     * Create an instance of {@link CreatePiloto }
     * 
     */
    public CreatePiloto createCreatePiloto() {
        return new CreatePiloto();
    }

    /**
     * Create an instance of {@link CreatePremio }
     * 
     */
    public CreatePremio createCreatePremio() {
        return new CreatePremio();
    }

    /**
     * Create an instance of {@link EditCampeonato }
     * 
     */
    public EditCampeonato createEditCampeonato() {
        return new EditCampeonato();
    }

    /**
     * Create an instance of {@link EditCircuito }
     * 
     */
    public EditCircuito createEditCircuito() {
        return new EditCircuito();
    }

    /**
     * Create an instance of {@link EditEscuderia }
     * 
     */
    public EditEscuderia createEditEscuderia() {
        return new EditEscuderia();
    }

    /**
     * Create an instance of {@link EditMonoplaza }
     * 
     */
    public EditMonoplaza createEditMonoplaza() {
        return new EditMonoplaza();
    }

    /**
     * Create an instance of {@link EditPais }
     * 
     */
    public EditPais createEditPais() {
        return new EditPais();
    }

    /**
     * Create an instance of {@link EditPiloto }
     * 
     */
    public EditPiloto createEditPiloto() {
        return new EditPiloto();
    }

    /**
     * Create an instance of {@link EditPremio }
     * 
     */
    public EditPremio createEditPremio() {
        return new EditPremio();
    }

    /**
     * Create an instance of {@link FindAllCampeonato }
     * 
     */
    public FindAllCampeonato createFindAllCampeonato() {
        return new FindAllCampeonato();
    }

    /**
     * Create an instance of {@link FindAllCampeonatoResponse }
     * 
     */
    public FindAllCampeonatoResponse createFindAllCampeonatoResponse() {
        return new FindAllCampeonatoResponse();
    }

    /**
     * Create an instance of {@link FindAllCircuito }
     * 
     */
    public FindAllCircuito createFindAllCircuito() {
        return new FindAllCircuito();
    }

    /**
     * Create an instance of {@link FindAllCircuitoResponse }
     * 
     */
    public FindAllCircuitoResponse createFindAllCircuitoResponse() {
        return new FindAllCircuitoResponse();
    }

    /**
     * Create an instance of {@link FindAllEscuderia }
     * 
     */
    public FindAllEscuderia createFindAllEscuderia() {
        return new FindAllEscuderia();
    }

    /**
     * Create an instance of {@link FindAllEscuderiaResponse }
     * 
     */
    public FindAllEscuderiaResponse createFindAllEscuderiaResponse() {
        return new FindAllEscuderiaResponse();
    }

    /**
     * Create an instance of {@link FindAllMonoplaza }
     * 
     */
    public FindAllMonoplaza createFindAllMonoplaza() {
        return new FindAllMonoplaza();
    }

    /**
     * Create an instance of {@link FindAllMonoplazaResponse }
     * 
     */
    public FindAllMonoplazaResponse createFindAllMonoplazaResponse() {
        return new FindAllMonoplazaResponse();
    }

    /**
     * Create an instance of {@link FindAllPais }
     * 
     */
    public FindAllPais createFindAllPais() {
        return new FindAllPais();
    }

    /**
     * Create an instance of {@link FindAllPaisResponse }
     * 
     */
    public FindAllPaisResponse createFindAllPaisResponse() {
        return new FindAllPaisResponse();
    }

    /**
     * Create an instance of {@link FindAllPiloto }
     * 
     */
    public FindAllPiloto createFindAllPiloto() {
        return new FindAllPiloto();
    }

    /**
     * Create an instance of {@link FindAllPilotoResponse }
     * 
     */
    public FindAllPilotoResponse createFindAllPilotoResponse() {
        return new FindAllPilotoResponse();
    }

    /**
     * Create an instance of {@link FindAllPremio }
     * 
     */
    public FindAllPremio createFindAllPremio() {
        return new FindAllPremio();
    }

    /**
     * Create an instance of {@link FindAllPremioResponse }
     * 
     */
    public FindAllPremioResponse createFindAllPremioResponse() {
        return new FindAllPremioResponse();
    }

    /**
     * Create an instance of {@link FindCampeonato }
     * 
     */
    public FindCampeonato createFindCampeonato() {
        return new FindCampeonato();
    }

    /**
     * Create an instance of {@link FindCampeonatoResponse }
     * 
     */
    public FindCampeonatoResponse createFindCampeonatoResponse() {
        return new FindCampeonatoResponse();
    }

    /**
     * Create an instance of {@link FindCircuito }
     * 
     */
    public FindCircuito createFindCircuito() {
        return new FindCircuito();
    }

    /**
     * Create an instance of {@link FindCircuitoResponse }
     * 
     */
    public FindCircuitoResponse createFindCircuitoResponse() {
        return new FindCircuitoResponse();
    }

    /**
     * Create an instance of {@link FindEscuderia }
     * 
     */
    public FindEscuderia createFindEscuderia() {
        return new FindEscuderia();
    }

    /**
     * Create an instance of {@link FindEscuderiaResponse }
     * 
     */
    public FindEscuderiaResponse createFindEscuderiaResponse() {
        return new FindEscuderiaResponse();
    }

    /**
     * Create an instance of {@link FindMonoplaza }
     * 
     */
    public FindMonoplaza createFindMonoplaza() {
        return new FindMonoplaza();
    }

    /**
     * Create an instance of {@link FindMonoplazaResponse }
     * 
     */
    public FindMonoplazaResponse createFindMonoplazaResponse() {
        return new FindMonoplazaResponse();
    }

    /**
     * Create an instance of {@link FindPais }
     * 
     */
    public FindPais createFindPais() {
        return new FindPais();
    }

    /**
     * Create an instance of {@link FindPaisResponse }
     * 
     */
    public FindPaisResponse createFindPaisResponse() {
        return new FindPaisResponse();
    }

    /**
     * Create an instance of {@link FindPiloto }
     * 
     */
    public FindPiloto createFindPiloto() {
        return new FindPiloto();
    }

    /**
     * Create an instance of {@link FindPilotoResponse }
     * 
     */
    public FindPilotoResponse createFindPilotoResponse() {
        return new FindPilotoResponse();
    }

    /**
     * Create an instance of {@link FindPremio }
     * 
     */
    public FindPremio createFindPremio() {
        return new FindPremio();
    }

    /**
     * Create an instance of {@link FindPremioResponse }
     * 
     */
    public FindPremioResponse createFindPremioResponse() {
        return new FindPremioResponse();
    }

    /**
     * Create an instance of {@link ObtenerEscuderiasByCampeonato }
     * 
     */
    public ObtenerEscuderiasByCampeonato createObtenerEscuderiasByCampeonato() {
        return new ObtenerEscuderiasByCampeonato();
    }

    /**
     * Create an instance of {@link ObtenerEscuderiasByCampeonatoResponse }
     * 
     */
    public ObtenerEscuderiasByCampeonatoResponse createObtenerEscuderiasByCampeonatoResponse() {
        return new ObtenerEscuderiasByCampeonatoResponse();
    }

    /**
     * Create an instance of {@link ObtenerMonoplazasByCampeonato }
     * 
     */
    public ObtenerMonoplazasByCampeonato createObtenerMonoplazasByCampeonato() {
        return new ObtenerMonoplazasByCampeonato();
    }

    /**
     * Create an instance of {@link ObtenerMonoplazasByCampeonatoResponse }
     * 
     */
    public ObtenerMonoplazasByCampeonatoResponse createObtenerMonoplazasByCampeonatoResponse() {
        return new ObtenerMonoplazasByCampeonatoResponse();
    }

    /**
     * Create an instance of {@link ObtenerPilotosByCampeonato }
     * 
     */
    public ObtenerPilotosByCampeonato createObtenerPilotosByCampeonato() {
        return new ObtenerPilotosByCampeonato();
    }

    /**
     * Create an instance of {@link ObtenerPilotosByCampeonatoResponse }
     * 
     */
    public ObtenerPilotosByCampeonatoResponse createObtenerPilotosByCampeonatoResponse() {
        return new ObtenerPilotosByCampeonatoResponse();
    }

    /**
     * Create an instance of {@link ObtenerPremiosByCampeonato }
     * 
     */
    public ObtenerPremiosByCampeonato createObtenerPremiosByCampeonato() {
        return new ObtenerPremiosByCampeonato();
    }

    /**
     * Create an instance of {@link ObtenerPremiosByCampeonatoResponse }
     * 
     */
    public ObtenerPremiosByCampeonatoResponse createObtenerPremiosByCampeonatoResponse() {
        return new ObtenerPremiosByCampeonatoResponse();
    }

    /**
     * Create an instance of {@link RemoveCampeonato }
     * 
     */
    public RemoveCampeonato createRemoveCampeonato() {
        return new RemoveCampeonato();
    }

    /**
     * Create an instance of {@link RemoveCircuito }
     * 
     */
    public RemoveCircuito createRemoveCircuito() {
        return new RemoveCircuito();
    }

    /**
     * Create an instance of {@link RemoveEscuderia }
     * 
     */
    public RemoveEscuderia createRemoveEscuderia() {
        return new RemoveEscuderia();
    }

    /**
     * Create an instance of {@link RemoveMonoplaza }
     * 
     */
    public RemoveMonoplaza createRemoveMonoplaza() {
        return new RemoveMonoplaza();
    }

    /**
     * Create an instance of {@link RemovePais }
     * 
     */
    public RemovePais createRemovePais() {
        return new RemovePais();
    }

    /**
     * Create an instance of {@link RemovePiloto }
     * 
     */
    public RemovePiloto createRemovePiloto() {
        return new RemovePiloto();
    }

    /**
     * Create an instance of {@link RemovePremio }
     * 
     */
    public RemovePremio createRemovePremio() {
        return new RemovePremio();
    }

    /**
     * Create an instance of {@link Pais }
     * 
     */
    public Pais createPais() {
        return new Pais();
    }

    /**
     * Create an instance of {@link Monoplaza }
     * 
     */
    public Monoplaza createMonoplaza() {
        return new Monoplaza();
    }

    /**
     * Create an instance of {@link Campeonato }
     * 
     */
    public Campeonato createCampeonato() {
        return new Campeonato();
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
     * Create an instance of {@link Piloto }
     * 
     */
    public Piloto createPiloto() {
        return new Piloto();
    }

    /**
     * Create an instance of {@link Escuderia }
     * 
     */
    public Escuderia createEscuderia() {
        return new Escuderia();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCampeonato }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createCampeonato")
    public JAXBElement<CreateCampeonato> createCreateCampeonato(CreateCampeonato value) {
        return new JAXBElement<CreateCampeonato>(_CreateCampeonato_QNAME, CreateCampeonato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCircuito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createCircuito")
    public JAXBElement<CreateCircuito> createCreateCircuito(CreateCircuito value) {
        return new JAXBElement<CreateCircuito>(_CreateCircuito_QNAME, CreateCircuito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEscuderia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createEscuderia")
    public JAXBElement<CreateEscuderia> createCreateEscuderia(CreateEscuderia value) {
        return new JAXBElement<CreateEscuderia>(_CreateEscuderia_QNAME, CreateEscuderia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMonoplaza }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createMonoplaza")
    public JAXBElement<CreateMonoplaza> createCreateMonoplaza(CreateMonoplaza value) {
        return new JAXBElement<CreateMonoplaza>(_CreateMonoplaza_QNAME, CreateMonoplaza.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePais }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createPais")
    public JAXBElement<CreatePais> createCreatePais(CreatePais value) {
        return new JAXBElement<CreatePais>(_CreatePais_QNAME, CreatePais.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePiloto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createPiloto")
    public JAXBElement<CreatePiloto> createCreatePiloto(CreatePiloto value) {
        return new JAXBElement<CreatePiloto>(_CreatePiloto_QNAME, CreatePiloto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePremio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createPremio")
    public JAXBElement<CreatePremio> createCreatePremio(CreatePremio value) {
        return new JAXBElement<CreatePremio>(_CreatePremio_QNAME, CreatePremio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCampeonato }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "editCampeonato")
    public JAXBElement<EditCampeonato> createEditCampeonato(EditCampeonato value) {
        return new JAXBElement<EditCampeonato>(_EditCampeonato_QNAME, EditCampeonato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCircuito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "editCircuito")
    public JAXBElement<EditCircuito> createEditCircuito(EditCircuito value) {
        return new JAXBElement<EditCircuito>(_EditCircuito_QNAME, EditCircuito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditEscuderia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "editEscuderia")
    public JAXBElement<EditEscuderia> createEditEscuderia(EditEscuderia value) {
        return new JAXBElement<EditEscuderia>(_EditEscuderia_QNAME, EditEscuderia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditMonoplaza }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "editMonoplaza")
    public JAXBElement<EditMonoplaza> createEditMonoplaza(EditMonoplaza value) {
        return new JAXBElement<EditMonoplaza>(_EditMonoplaza_QNAME, EditMonoplaza.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditPais }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "editPais")
    public JAXBElement<EditPais> createEditPais(EditPais value) {
        return new JAXBElement<EditPais>(_EditPais_QNAME, EditPais.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditPiloto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "editPiloto")
    public JAXBElement<EditPiloto> createEditPiloto(EditPiloto value) {
        return new JAXBElement<EditPiloto>(_EditPiloto_QNAME, EditPiloto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditPremio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "editPremio")
    public JAXBElement<EditPremio> createEditPremio(EditPremio value) {
        return new JAXBElement<EditPremio>(_EditPremio_QNAME, EditPremio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCampeonato }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllCampeonato")
    public JAXBElement<FindAllCampeonato> createFindAllCampeonato(FindAllCampeonato value) {
        return new JAXBElement<FindAllCampeonato>(_FindAllCampeonato_QNAME, FindAllCampeonato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCampeonatoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllCampeonatoResponse")
    public JAXBElement<FindAllCampeonatoResponse> createFindAllCampeonatoResponse(FindAllCampeonatoResponse value) {
        return new JAXBElement<FindAllCampeonatoResponse>(_FindAllCampeonatoResponse_QNAME, FindAllCampeonatoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCircuito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllCircuito")
    public JAXBElement<FindAllCircuito> createFindAllCircuito(FindAllCircuito value) {
        return new JAXBElement<FindAllCircuito>(_FindAllCircuito_QNAME, FindAllCircuito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCircuitoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllCircuitoResponse")
    public JAXBElement<FindAllCircuitoResponse> createFindAllCircuitoResponse(FindAllCircuitoResponse value) {
        return new JAXBElement<FindAllCircuitoResponse>(_FindAllCircuitoResponse_QNAME, FindAllCircuitoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllEscuderia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllEscuderia")
    public JAXBElement<FindAllEscuderia> createFindAllEscuderia(FindAllEscuderia value) {
        return new JAXBElement<FindAllEscuderia>(_FindAllEscuderia_QNAME, FindAllEscuderia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllEscuderiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllEscuderiaResponse")
    public JAXBElement<FindAllEscuderiaResponse> createFindAllEscuderiaResponse(FindAllEscuderiaResponse value) {
        return new JAXBElement<FindAllEscuderiaResponse>(_FindAllEscuderiaResponse_QNAME, FindAllEscuderiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllMonoplaza }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllMonoplaza")
    public JAXBElement<FindAllMonoplaza> createFindAllMonoplaza(FindAllMonoplaza value) {
        return new JAXBElement<FindAllMonoplaza>(_FindAllMonoplaza_QNAME, FindAllMonoplaza.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllMonoplazaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllMonoplazaResponse")
    public JAXBElement<FindAllMonoplazaResponse> createFindAllMonoplazaResponse(FindAllMonoplazaResponse value) {
        return new JAXBElement<FindAllMonoplazaResponse>(_FindAllMonoplazaResponse_QNAME, FindAllMonoplazaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllPais }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllPais")
    public JAXBElement<FindAllPais> createFindAllPais(FindAllPais value) {
        return new JAXBElement<FindAllPais>(_FindAllPais_QNAME, FindAllPais.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllPaisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllPaisResponse")
    public JAXBElement<FindAllPaisResponse> createFindAllPaisResponse(FindAllPaisResponse value) {
        return new JAXBElement<FindAllPaisResponse>(_FindAllPaisResponse_QNAME, FindAllPaisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllPiloto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllPiloto")
    public JAXBElement<FindAllPiloto> createFindAllPiloto(FindAllPiloto value) {
        return new JAXBElement<FindAllPiloto>(_FindAllPiloto_QNAME, FindAllPiloto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllPilotoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllPilotoResponse")
    public JAXBElement<FindAllPilotoResponse> createFindAllPilotoResponse(FindAllPilotoResponse value) {
        return new JAXBElement<FindAllPilotoResponse>(_FindAllPilotoResponse_QNAME, FindAllPilotoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllPremio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllPremio")
    public JAXBElement<FindAllPremio> createFindAllPremio(FindAllPremio value) {
        return new JAXBElement<FindAllPremio>(_FindAllPremio_QNAME, FindAllPremio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllPremioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findAllPremioResponse")
    public JAXBElement<FindAllPremioResponse> createFindAllPremioResponse(FindAllPremioResponse value) {
        return new JAXBElement<FindAllPremioResponse>(_FindAllPremioResponse_QNAME, FindAllPremioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCampeonato }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findCampeonato")
    public JAXBElement<FindCampeonato> createFindCampeonato(FindCampeonato value) {
        return new JAXBElement<FindCampeonato>(_FindCampeonato_QNAME, FindCampeonato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCampeonatoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findCampeonatoResponse")
    public JAXBElement<FindCampeonatoResponse> createFindCampeonatoResponse(FindCampeonatoResponse value) {
        return new JAXBElement<FindCampeonatoResponse>(_FindCampeonatoResponse_QNAME, FindCampeonatoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCircuito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findCircuito")
    public JAXBElement<FindCircuito> createFindCircuito(FindCircuito value) {
        return new JAXBElement<FindCircuito>(_FindCircuito_QNAME, FindCircuito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCircuitoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findCircuitoResponse")
    public JAXBElement<FindCircuitoResponse> createFindCircuitoResponse(FindCircuitoResponse value) {
        return new JAXBElement<FindCircuitoResponse>(_FindCircuitoResponse_QNAME, FindCircuitoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEscuderia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findEscuderia")
    public JAXBElement<FindEscuderia> createFindEscuderia(FindEscuderia value) {
        return new JAXBElement<FindEscuderia>(_FindEscuderia_QNAME, FindEscuderia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEscuderiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findEscuderiaResponse")
    public JAXBElement<FindEscuderiaResponse> createFindEscuderiaResponse(FindEscuderiaResponse value) {
        return new JAXBElement<FindEscuderiaResponse>(_FindEscuderiaResponse_QNAME, FindEscuderiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMonoplaza }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findMonoplaza")
    public JAXBElement<FindMonoplaza> createFindMonoplaza(FindMonoplaza value) {
        return new JAXBElement<FindMonoplaza>(_FindMonoplaza_QNAME, FindMonoplaza.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMonoplazaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findMonoplazaResponse")
    public JAXBElement<FindMonoplazaResponse> createFindMonoplazaResponse(FindMonoplazaResponse value) {
        return new JAXBElement<FindMonoplazaResponse>(_FindMonoplazaResponse_QNAME, FindMonoplazaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPais }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findPais")
    public JAXBElement<FindPais> createFindPais(FindPais value) {
        return new JAXBElement<FindPais>(_FindPais_QNAME, FindPais.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPaisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findPaisResponse")
    public JAXBElement<FindPaisResponse> createFindPaisResponse(FindPaisResponse value) {
        return new JAXBElement<FindPaisResponse>(_FindPaisResponse_QNAME, FindPaisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPiloto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findPiloto")
    public JAXBElement<FindPiloto> createFindPiloto(FindPiloto value) {
        return new JAXBElement<FindPiloto>(_FindPiloto_QNAME, FindPiloto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPilotoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findPilotoResponse")
    public JAXBElement<FindPilotoResponse> createFindPilotoResponse(FindPilotoResponse value) {
        return new JAXBElement<FindPilotoResponse>(_FindPilotoResponse_QNAME, FindPilotoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPremio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findPremio")
    public JAXBElement<FindPremio> createFindPremio(FindPremio value) {
        return new JAXBElement<FindPremio>(_FindPremio_QNAME, FindPremio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPremioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findPremioResponse")
    public JAXBElement<FindPremioResponse> createFindPremioResponse(FindPremioResponse value) {
        return new JAXBElement<FindPremioResponse>(_FindPremioResponse_QNAME, FindPremioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerEscuderiasByCampeonato }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerEscuderiasByCampeonato")
    public JAXBElement<ObtenerEscuderiasByCampeonato> createObtenerEscuderiasByCampeonato(ObtenerEscuderiasByCampeonato value) {
        return new JAXBElement<ObtenerEscuderiasByCampeonato>(_ObtenerEscuderiasByCampeonato_QNAME, ObtenerEscuderiasByCampeonato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerEscuderiasByCampeonatoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerEscuderiasByCampeonatoResponse")
    public JAXBElement<ObtenerEscuderiasByCampeonatoResponse> createObtenerEscuderiasByCampeonatoResponse(ObtenerEscuderiasByCampeonatoResponse value) {
        return new JAXBElement<ObtenerEscuderiasByCampeonatoResponse>(_ObtenerEscuderiasByCampeonatoResponse_QNAME, ObtenerEscuderiasByCampeonatoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerMonoplazasByCampeonato }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerMonoplazasByCampeonato")
    public JAXBElement<ObtenerMonoplazasByCampeonato> createObtenerMonoplazasByCampeonato(ObtenerMonoplazasByCampeonato value) {
        return new JAXBElement<ObtenerMonoplazasByCampeonato>(_ObtenerMonoplazasByCampeonato_QNAME, ObtenerMonoplazasByCampeonato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerMonoplazasByCampeonatoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerMonoplazasByCampeonatoResponse")
    public JAXBElement<ObtenerMonoplazasByCampeonatoResponse> createObtenerMonoplazasByCampeonatoResponse(ObtenerMonoplazasByCampeonatoResponse value) {
        return new JAXBElement<ObtenerMonoplazasByCampeonatoResponse>(_ObtenerMonoplazasByCampeonatoResponse_QNAME, ObtenerMonoplazasByCampeonatoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPilotosByCampeonato }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerPilotosByCampeonato")
    public JAXBElement<ObtenerPilotosByCampeonato> createObtenerPilotosByCampeonato(ObtenerPilotosByCampeonato value) {
        return new JAXBElement<ObtenerPilotosByCampeonato>(_ObtenerPilotosByCampeonato_QNAME, ObtenerPilotosByCampeonato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPilotosByCampeonatoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerPilotosByCampeonatoResponse")
    public JAXBElement<ObtenerPilotosByCampeonatoResponse> createObtenerPilotosByCampeonatoResponse(ObtenerPilotosByCampeonatoResponse value) {
        return new JAXBElement<ObtenerPilotosByCampeonatoResponse>(_ObtenerPilotosByCampeonatoResponse_QNAME, ObtenerPilotosByCampeonatoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPremiosByCampeonato }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerPremiosByCampeonato")
    public JAXBElement<ObtenerPremiosByCampeonato> createObtenerPremiosByCampeonato(ObtenerPremiosByCampeonato value) {
        return new JAXBElement<ObtenerPremiosByCampeonato>(_ObtenerPremiosByCampeonato_QNAME, ObtenerPremiosByCampeonato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPremiosByCampeonatoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerPremiosByCampeonatoResponse")
    public JAXBElement<ObtenerPremiosByCampeonatoResponse> createObtenerPremiosByCampeonatoResponse(ObtenerPremiosByCampeonatoResponse value) {
        return new JAXBElement<ObtenerPremiosByCampeonatoResponse>(_ObtenerPremiosByCampeonatoResponse_QNAME, ObtenerPremiosByCampeonatoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCampeonato }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "removeCampeonato")
    public JAXBElement<RemoveCampeonato> createRemoveCampeonato(RemoveCampeonato value) {
        return new JAXBElement<RemoveCampeonato>(_RemoveCampeonato_QNAME, RemoveCampeonato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCircuito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "removeCircuito")
    public JAXBElement<RemoveCircuito> createRemoveCircuito(RemoveCircuito value) {
        return new JAXBElement<RemoveCircuito>(_RemoveCircuito_QNAME, RemoveCircuito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveEscuderia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "removeEscuderia")
    public JAXBElement<RemoveEscuderia> createRemoveEscuderia(RemoveEscuderia value) {
        return new JAXBElement<RemoveEscuderia>(_RemoveEscuderia_QNAME, RemoveEscuderia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMonoplaza }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "removeMonoplaza")
    public JAXBElement<RemoveMonoplaza> createRemoveMonoplaza(RemoveMonoplaza value) {
        return new JAXBElement<RemoveMonoplaza>(_RemoveMonoplaza_QNAME, RemoveMonoplaza.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePais }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "removePais")
    public JAXBElement<RemovePais> createRemovePais(RemovePais value) {
        return new JAXBElement<RemovePais>(_RemovePais_QNAME, RemovePais.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePiloto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "removePiloto")
    public JAXBElement<RemovePiloto> createRemovePiloto(RemovePiloto value) {
        return new JAXBElement<RemovePiloto>(_RemovePiloto_QNAME, RemovePiloto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePremio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "removePremio")
    public JAXBElement<RemovePremio> createRemovePremio(RemovePremio value) {
        return new JAXBElement<RemovePremio>(_RemovePremio_QNAME, RemovePremio.class, null, value);
    }

}
