
package entities;

/**
 *
 * @author SoF1
 */
public class Circuito {
    private int idCircuito;
    private String nombre;
    private String imagen;
    private long longitud;
    private Resultado record;
    private Piloto ultimo_ganador;

    public Circuito( String nombre, long longitud) {
        this.nombre = nombre;
        this.longitud = longitud;
    }

    public Circuito( String nombre, String imagen, long longitud, Resultado record, Piloto ultimo_ganador) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.longitud = longitud;
        this.record = record;
        this.ultimo_ganador = ultimo_ganador;
    }
    
    public Circuito() {
    }

    public int getIdCircuito() {
        return idCircuito;
    }

    public void setIdCircuito(int idCircuito) {
        this.idCircuito = idCircuito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public long getLongitud() {
        return longitud;
    }

    public void setLongitud(long longitud) {
        this.longitud = longitud;
    }

    public Resultado getRecord() {
        return record;
    }

    public void setRecord(Resultado record) {
        this.record = record;
    }

    public Piloto getUltimo_ganador() {
        return ultimo_ganador;
    }

    public void setUltimo_ganador(Piloto ultimo_ganador) {
        this.ultimo_ganador = ultimo_ganador;
    }



}
