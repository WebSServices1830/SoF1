
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
 * JAX-WS RI 2.3.0
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Opiniones", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/AppFormula1Servidor/Opiniones?wsdl")
public class Opiniones_Service
    extends Service
{

    private final static URL OPINIONES_WSDL_LOCATION;
    private final static WebServiceException OPINIONES_EXCEPTION;
    private final static QName OPINIONES_QNAME = new QName("http://ws/", "Opiniones");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/AppFormula1Servidor/Opiniones?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OPINIONES_WSDL_LOCATION = url;
        OPINIONES_EXCEPTION = e;
    }

    public Opiniones_Service() {
        super(__getWsdlLocation(), OPINIONES_QNAME);
    }

    public Opiniones_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), OPINIONES_QNAME, features);
    }

    public Opiniones_Service(URL wsdlLocation) {
        super(wsdlLocation, OPINIONES_QNAME);
    }

    public Opiniones_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OPINIONES_QNAME, features);
    }

    public Opiniones_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Opiniones_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Opiniones
     */
    @WebEndpoint(name = "OpinionesPort")
    public Opiniones getOpinionesPort() {
        return super.getPort(new QName("http://ws/", "OpinionesPort"), Opiniones.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Opiniones
     */
    @WebEndpoint(name = "OpinionesPort")
    public Opiniones getOpinionesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "OpinionesPort"), Opiniones.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OPINIONES_EXCEPTION!= null) {
            throw OPINIONES_EXCEPTION;
        }
        return OPINIONES_WSDL_LOCATION;
    }

}
