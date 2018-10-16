
package ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Gestor", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/Gestor/Gestor?WSDL")
public class Gestor_Service
    extends Service
{

    private final static URL GESTOR_WSDL_LOCATION;
    private final static WebServiceException GESTOR_EXCEPTION;
    private final static QName GESTOR_QNAME = new QName("http://ws/", "Gestor");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Gestor/Gestor?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GESTOR_WSDL_LOCATION = url;
        GESTOR_EXCEPTION = e;
    }

    public Gestor_Service() {
        super(__getWsdlLocation(), GESTOR_QNAME);
    }

    public Gestor_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), GESTOR_QNAME, features);
    }

    public Gestor_Service(URL wsdlLocation) {
        super(wsdlLocation, GESTOR_QNAME);
    }

    public Gestor_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GESTOR_QNAME, features);
    }

    public Gestor_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Gestor_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Gestor
     */
    @WebEndpoint(name = "GestorPort")
    public Gestor getGestorPort() {
        return super.getPort(new QName("http://ws/", "GestorPort"), Gestor.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Gestor
     */
    @WebEndpoint(name = "GestorPort")
    public Gestor getGestorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "GestorPort"), Gestor.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GESTOR_EXCEPTION!= null) {
            throw GESTOR_EXCEPTION;
        }
        return GESTOR_WSDL_LOCATION;
    }

}
