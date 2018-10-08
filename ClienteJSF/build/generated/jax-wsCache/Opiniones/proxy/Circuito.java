
package proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para circuito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="circuito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="campeonato" type="{http://ws/}campeonato" minOccurs="0"/&gt;
 *         &lt;element name="fechRecord" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fotos" type="{http://ws/}foto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="idCircuito" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="longitud" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pais" type="{http://ws/}pais" minOccurs="0"/&gt;
 *         &lt;element name="piloto" type="{http://ws/}piloto" minOccurs="0"/&gt;
 *         &lt;element name="record" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ultimoGanador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vueltas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "circuito", propOrder = {
    "campeonato",
    "fechRecord",
    "fotos",
    "idCircuito",
    "longitud",
    "nombre",
    "pais",
    "piloto",
    "record",
    "ultimoGanador",
    "vueltas"
})
public class Circuito {

    protected Campeonato campeonato;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechRecord;
    @XmlElement(nillable = true)
    protected List<Foto> fotos;
    protected Integer idCircuito;
    protected Double longitud;
    protected String nombre;
    protected Pais pais;
    protected Piloto piloto;
    protected Double record;
    protected String ultimoGanador;
    protected Integer vueltas;

    /**
     * Obtiene el valor de la propiedad campeonato.
     * 
     * @return
     *     possible object is
     *     {@link Campeonato }
     *     
     */
    public Campeonato getCampeonato() {
        return campeonato;
    }

    /**
     * Define el valor de la propiedad campeonato.
     * 
     * @param value
     *     allowed object is
     *     {@link Campeonato }
     *     
     */
    public void setCampeonato(Campeonato value) {
        this.campeonato = value;
    }

    /**
     * Obtiene el valor de la propiedad fechRecord.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechRecord() {
        return fechRecord;
    }

    /**
     * Define el valor de la propiedad fechRecord.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechRecord(XMLGregorianCalendar value) {
        this.fechRecord = value;
    }

    /**
     * Gets the value of the fotos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fotos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFotos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Foto }
     * 
     * 
     */
    public List<Foto> getFotos() {
        if (fotos == null) {
            fotos = new ArrayList<Foto>();
        }
        return this.fotos;
    }

    /**
     * Obtiene el valor de la propiedad idCircuito.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCircuito() {
        return idCircuito;
    }

    /**
     * Define el valor de la propiedad idCircuito.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCircuito(Integer value) {
        this.idCircuito = value;
    }

    /**
     * Obtiene el valor de la propiedad longitud.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitud() {
        return longitud;
    }

    /**
     * Define el valor de la propiedad longitud.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitud(Double value) {
        this.longitud = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link Pais }
     *     
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link Pais }
     *     
     */
    public void setPais(Pais value) {
        this.pais = value;
    }

    /**
     * Obtiene el valor de la propiedad piloto.
     * 
     * @return
     *     possible object is
     *     {@link Piloto }
     *     
     */
    public Piloto getPiloto() {
        return piloto;
    }

    /**
     * Define el valor de la propiedad piloto.
     * 
     * @param value
     *     allowed object is
     *     {@link Piloto }
     *     
     */
    public void setPiloto(Piloto value) {
        this.piloto = value;
    }

    /**
     * Obtiene el valor de la propiedad record.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecord() {
        return record;
    }

    /**
     * Define el valor de la propiedad record.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecord(Double value) {
        this.record = value;
    }

    /**
     * Obtiene el valor de la propiedad ultimoGanador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltimoGanador() {
        return ultimoGanador;
    }

    /**
     * Define el valor de la propiedad ultimoGanador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltimoGanador(String value) {
        this.ultimoGanador = value;
    }

    /**
     * Obtiene el valor de la propiedad vueltas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVueltas() {
        return vueltas;
    }

    /**
     * Define el valor de la propiedad vueltas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVueltas(Integer value) {
        this.vueltas = value;
    }

}
