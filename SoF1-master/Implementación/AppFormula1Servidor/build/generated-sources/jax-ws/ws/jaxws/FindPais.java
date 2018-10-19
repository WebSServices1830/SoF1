
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findPais", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findPais", namespace = "http://ws/")
public class FindPais {

    @XmlElement(name = "idPais", namespace = "")
    private int idPais;

    /**
     * 
     * @return
     *     returns int
     */
    public int getIdPais() {
        return this.idPais;
    }

    /**
     * 
     * @param idPais
     *     the value for the idPais property
     */
    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

}
