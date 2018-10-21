
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "obtenerResultadoClasificacionBySesionClasificacion", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerResultadoClasificacionBySesionClasificacion", namespace = "http://ws/")
public class ObtenerResultadoClasificacionBySesionClasificacion {

    @XmlElement(name = "idSesionClasificacion", namespace = "")
    private int idSesionClasificacion;

    /**
     * 
     * @return
     *     returns int
     */
    public int getIdSesionClasificacion() {
        return this.idSesionClasificacion;
    }

    /**
     * 
     * @param idSesionClasificacion
     *     the value for the idSesionClasificacion property
     */
    public void setIdSesionClasificacion(int idSesionClasificacion) {
        this.idSesionClasificacion = idSesionClasificacion;
    }

}
