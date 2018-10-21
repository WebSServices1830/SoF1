
package ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "obtenerResultadoPracticaBySesionPracticaResponse", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerResultadoPracticaBySesionPracticaResponse", namespace = "http://ws/")
public class ObtenerResultadoPracticaBySesionPracticaResponse {

    @XmlElement(name = "return", namespace = "")
    private List<entities.ResultadoPractica> _return;

    /**
     * 
     * @return
     *     returns List<ResultadoPractica>
     */
    public List<entities.ResultadoPractica> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<entities.ResultadoPractica> _return) {
        this._return = _return;
    }

}
