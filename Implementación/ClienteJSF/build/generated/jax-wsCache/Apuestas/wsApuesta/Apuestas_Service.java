
package wsApuesta;

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
@WebServiceClient(name = "Apuestas", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8080/AppFormula1Servidor/Apuestas?wsdl")
public class Apuestas_Service
    extends Service
{

    private final static URL APUESTAS_WSDL_LOCATION;
    private final static WebServiceException APUESTAS_EXCEPTION;
    private final static QName APUESTAS_QNAME = new QName("http://ws/", "Apuestas");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/AppFormula1Servidor/Apuestas?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        APUESTAS_WSDL_LOCATION = url;
        APUESTAS_EXCEPTION = e;
    }

    public Apuestas_Service() {
        super(__getWsdlLocation(), APUESTAS_QNAME);
    }

    public Apuestas_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), APUESTAS_QNAME, features);
    }

    public Apuestas_Service(URL wsdlLocation) {
        super(wsdlLocation, APUESTAS_QNAME);
    }

    public Apuestas_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, APUESTAS_QNAME, features);
    }

    public Apuestas_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Apuestas_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Apuestas
     */
    @WebEndpoint(name = "ApuestasPort")
    public Apuestas getApuestasPort() {
        return super.getPort(new QName("http://ws/", "ApuestasPort"), Apuestas.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Apuestas
     */
    @WebEndpoint(name = "ApuestasPort")
    public Apuestas getApuestasPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "ApuestasPort"), Apuestas.class, features);
    }

    private static URL __getWsdlLocation() {
        if (APUESTAS_EXCEPTION!= null) {
            throw APUESTAS_EXCEPTION;
        }
        return APUESTAS_WSDL_LOCATION;
    }

}
