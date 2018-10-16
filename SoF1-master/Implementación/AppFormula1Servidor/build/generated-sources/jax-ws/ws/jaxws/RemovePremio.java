
package ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "removePremio", namespace = "http://ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removePremio", namespace = "http://ws/")
public class RemovePremio {

    @XmlElement(name = "premio", namespace = "")
    private int premio;

    /**
     * 
     * @return
     *     returns int
     */
    public int getPremio() {
        return this.premio;
    }

    /**
     * 
     * @param premio
     *     the value for the premio property
     */
    public void setPremio(int premio) {
        this.premio = premio;
    }

}
