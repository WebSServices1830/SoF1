
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para piloto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="piloto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="biografia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="campeonatos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fecha_nacimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="foto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idPiloto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lugar_nacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="multiplicador" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="podios" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "piloto", propOrder = {
    "biografia",
    "campeonatos",
    "fechaNacimiento",
    "foto",
    "idPiloto",
    "lugarNacimiento",
    "multiplicador",
    "nombre",
    "numero",
    "podios"
})
public class Piloto {

    protected String biografia;
    protected int campeonatos;
    @XmlElement(name = "fecha_nacimiento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNacimiento;
    protected String foto;
    protected int idPiloto;
    @XmlElement(name = "lugar_nacimiento")
    protected String lugarNacimiento;
    protected double multiplicador;
    protected String nombre;
    protected int numero;
    protected int podios;

    /**
     * Obtiene el valor de la propiedad biografia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiografia() {
        return biografia;
    }

    /**
     * Define el valor de la propiedad biografia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiografia(String value) {
        this.biografia = value;
    }

    /**
     * Obtiene el valor de la propiedad campeonatos.
     * 
     */
    public int getCampeonatos() {
        return campeonatos;
    }

    /**
     * Define el valor de la propiedad campeonatos.
     * 
     */
    public void setCampeonatos(int value) {
        this.campeonatos = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNacimiento(XMLGregorianCalendar value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad foto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoto() {
        
        return "http://localhost/images/"+nombre+".jpg";
    }

    /**
     * Define el valor de la propiedad foto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoto(String value) {
        this.foto = value;
    }

    /**
     * Obtiene el valor de la propiedad idPiloto.
     * 
     */
    public int getIdPiloto() {
        return idPiloto;
    }

    /**
     * Define el valor de la propiedad idPiloto.
     * 
     */
    public void setIdPiloto(int value) {
        this.idPiloto = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    /**
     * Define el valor de la propiedad lugarNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarNacimiento(String value) {
        this.lugarNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad multiplicador.
     * 
     */
    public double getMultiplicador() {
        return multiplicador;
    }

    /**
     * Define el valor de la propiedad multiplicador.
     * 
     */
    public void setMultiplicador(double value) {
        this.multiplicador = value;
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
     * Obtiene el valor de la propiedad numero.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad podios.
     * 
     */
    public int getPodios() {
        return podios;
    }

    /**
     * Define el valor de la propiedad podios.
     * 
     */
    public void setPodios(int value) {
        this.podios = value;
    }

}
