/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author nikme
 */
public class Escuderia {
private int idEscuderia;
private String nombre;
private String imagen;
private String lider;
private String tecnicoLider;
private Piloto p1;
private Piloto p2;
private String detalles;

    public int getIdEscuderia() {
        return idEscuderia;
    }

    public void setIdEscuderia(int idEscuderia) {
        this.idEscuderia = idEscuderia;
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

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getTecnicoLider() {
        return tecnicoLider;
    }

    public void setTecnicoLider(String tecnicoLider) {
        this.tecnicoLider = tecnicoLider;
    }

    public Piloto getP1() {
        return p1;
    }

    public void setP1(Piloto p1) {
        this.p1 = p1;
    }

    public Piloto getP2() {
        return p2;
    }

    public void setP2(Piloto p2) {
        this.p2 = p2;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Escuderia(String nombre, String imagen, String lider, String tecnicoLider, Piloto p1, Piloto p2, String detalles) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.lider = lider;
        this.tecnicoLider = tecnicoLider;
        this.p1 = p1;
        this.p2 = p2;
        this.detalles = detalles;
    }

    public Escuderia() {
    }



}
