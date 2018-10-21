
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "removePais", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removePais", namespace = "http://ws/")
public class RemovePais {

    @XmlElement(name = "pais", namespace = "")
    private int pais;

    /**
     * 
     * @return
     *     returns int
     */
    public int getPais() {
        return this.pais;
    }

    /**
     * 
     * @param pais
     *     the value for the pais property
     */
    public void setPais(int pais) {
        this.pais = pais;
    }

}
