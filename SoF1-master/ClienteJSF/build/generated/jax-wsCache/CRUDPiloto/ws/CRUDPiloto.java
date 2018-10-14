
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
@WebService(name = "CRUDPiloto", targetNamespace = "http://piloto/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CRUDPiloto {


    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "remove", targetNamespace = "http://piloto/", className = "ws.Remove")
    @Action(input = "http://piloto/CRUDPiloto/remove")
    public void remove(
        @WebParam(name = "entity", targetNamespace = "")
        int entity);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.Object
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "find", targetNamespace = "http://piloto/", className = "ws.Find")
    @ResponseWrapper(localName = "findResponse", targetNamespace = "http://piloto/", className = "ws.FindResponse")
    @Action(input = "http://piloto/CRUDPiloto/findRequest", output = "http://piloto/CRUDPiloto/findResponse")
    public Object find(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "create", targetNamespace = "http://piloto/", className = "ws.Create")
    @Action(input = "http://piloto/CRUDPiloto/create")
    public void create(
        @WebParam(name = "entity", targetNamespace = "")
        Piloto entity);

    /**
     * 
     * @return
     *     returns java.util.List<ws.Piloto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://piloto/", className = "ws.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://piloto/", className = "ws.FindAllResponse")
    @Action(input = "http://piloto/CRUDPiloto/findAllRequest", output = "http://piloto/CRUDPiloto/findAllResponse")
    public List<Piloto> findAll();

    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "edit", targetNamespace = "http://piloto/", className = "ws.Edit")
    @Action(input = "http://piloto/CRUDPiloto/edit")
    public void edit(
        @WebParam(name = "entity", targetNamespace = "")
        Piloto entity);

}
