/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:AutenticacionResource
 * [autenticacion]<br>
 * USAGE:
 * <pre>
 *        AutenticacionClient client = new AutenticacionClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author USUARIO
 */
public class AutenticacionRestClient {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://"+Util.ip+":8080/f1RestServer/webresources";

    public AutenticacionRestClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("autenticacion");
    }

    public <T> T cerrarSesion(Class<T> responseType, String id) throws ClientErrorException {
        return webTarget.path(java.text.MessageFormat.format("sesiones/usuario/{0}", new Object[]{id})).request().delete(responseType);
    }

    public <T> T registrarUsuario(Object requestEntity, Class<T> responseType) throws ClientErrorException {
        return webTarget.path("usuarios").request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON), responseType);
    }

    public <T> T obtenerUsuario(Class<T> responseType, String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("usuarios/{0}", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public <T> T iniciarSesion(Class<T> responseType, String usuario, String contrasena) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("sesiones/{0}/{1}", new Object[]{usuario, contrasena}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void close() {
        client.close();
    }
    
}
