
package ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "obtenerResultadoClasificacionBySesionClasificacionResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerResultadoClasificacionBySesionClasificacionResponse", namespace = "http://ws/")
public class ObtenerResultadoClasificacionBySesionClasificacionResponse {

    @XmlElement(name = "return", namespace = "")
    private List<entities.ResultadoClasificacion> _return;

    /**
     * 
     * @return
     *     returns List<ResultadoClasificacion>
     */
    public List<entities.ResultadoClasificacion> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<entities.ResultadoClasificacion> _return) {
        this._return = _return;
    }

}
