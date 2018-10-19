
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "editPais", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editPais", namespace = "http://ws/")
public class EditPais {

    @XmlElement(name = "pais", namespace = "")
    private entities.Pais pais;

    /**
     * 
     * @return
     *     returns Pais
     */
    public entities.Pais getPais() {
        return this.pais;
    }

    /**
     * 
     * @param pais
     *     the value for the pais property
     */
    public void setPais(entities.Pais pais) {
        this.pais = pais;
    }

}
