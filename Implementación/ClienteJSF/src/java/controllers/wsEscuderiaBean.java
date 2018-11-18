/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Campeonato;
import entities.Escuderia;
import entities.Monoplaza;
import entities.Pais;
import entities.Piloto;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.ws.rs.core.GenericType;
import javax.xml.ws.WebServiceRef;
import org.primefaces.model.UploadedFile;
import ws.EscuderiasRestClient;
import ws.MonoplazasRestClient;
import ws.PaisesRestClient;
import ws.PilotoRestClient;

/**
 *
 * @author USUARIO
 */
@Named(value = "wsEscuderiaBean")
@ManagedBean
public class wsEscuderiaBean {

    private String filePath = "C:\\xampp\\htdocs\\images\\escuderias\\";
    private EscuderiasRestClient escueriaRest = new EscuderiasRestClient();
    private PaisesRestClient paisesRest = new PaisesRestClient();
    private PilotoRestClient piltotosRest = new PilotoRestClient();
    private MonoplazasRestClient monoplazaRest = new MonoplazasRestClient();

    /**
     * Creates a new instance of wsEscuderiaBean
     */
    public wsEscuderiaBean() {
    }
    private UploadedFile file;

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }
    List<Escuderia> escuderias = new ArrayList<>();
    Escuderia escuderia = new Escuderia();
    List<Piloto> pilotos = new ArrayList<>();
    Piloto piloto = new Piloto();
    Piloto piloto2 = new Piloto();

    Monoplaza m1 = new Monoplaza();
    Monoplaza m2 = new Monoplaza();
    int mid2;//= new Monoplaza();
    int mid1;//= new Monoplaza();
    int idp1;//= new Monoplaza();
    int idp2;//= new Monoplaza();

    int idpais;

    public int getIdpais() {
        return idpais;
    }

    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }

    List<Pais> paises = new ArrayList<>();

    public List<Pais> getPaises() {
        //     paises=findAllPais();
        return paises;
    }

    @ManagedProperty(value = "#{wsSessionBean.campeonato}")
    private Campeonato c;

    public int getIdp1() {
        return idp1;
    }

    public void setIdp1(int idp1) {
        this.idp1 = idp1;
    }

    public int getIdp2() {
        return idp2;
    }

    public void setIdp2(int idp2) {
        this.idp2 = idp2;
    }

    public Campeonato getC() {
        return c;
    }

    public void setC(Campeonato c) {
        this.c = c;
    }

    public int getMid1() {
        return mid1;
    }

    public void setMid1(int mid1) {
        this.mid1 = mid1;
    }

    public List<Escuderia> getEscuderias() {
        escuderias = findAllEscuderia(c.getIdCampeonato());
        return escuderias;
    }

    public void setEscuderias(List<Escuderia> escuderias) {
        this.escuderias = escuderias;
    }

    public int getMid2() {
        return mid2;
    }

    public void setMid2(int mid2) {
        this.mid2 = mid2;
    }

    List<Monoplaza> monoplazas = new ArrayList<>();

    public Escuderia getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(Escuderia escuderia) {
        this.escuderia = escuderia;
    }

    public Monoplaza getM1() {
        return m1;
    }

    public void setM1(Monoplaza m1) {
        this.m1 = m1;
    }

    public Monoplaza getM2() {
        return m2;
    }

    public void setM2(Monoplaza m2) {
        this.m2 = m2;
    }

    public List<Monoplaza> getMonoplazas() {
          monoplazas= monoplazaRest.obtenerPilotosByCampeonato(new GenericType<List<Monoplaza>>(){}, c.getIdCampeonato()+"");
      return monoplazas;
    }

    public void setMonoplazas(List<Monoplaza> monoplazas) {
        this.monoplazas = monoplazas;
    }

    public Piloto getPiloto2() {
        return piloto2;
    }

    public void setPiloto2(Piloto piloto2) {
        this.piloto2 = piloto2;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public List<Piloto> getPilotos() {
        pilotos =piltotosRest.obtenerPilotosByCampeonato(new GenericType<List<Piloto>>() {},c.getIdCampeonato()+"" );
        return pilotos;
    }

    public void setPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public String delete(int idescuderia) throws IOException {
        escueriaRest.eliminarEscuderia(idescuderia+"");
        return "";
    }

    public String save() throws IOException {
        upload();
        Pais p = null;
        p=paisesRest.obtenerPaisPorId(Pais.class, idpais+"");
        Monoplaza m1 = null;
        m1=monoplazaRest.obtenerMonoplazaPorId(Monoplaza.class, mid1+"");
        Monoplaza m2 = null;
        m2=monoplazaRest.obtenerMonoplazaPorId(Monoplaza.class, mid2+"");
        Piloto p1 = null;
        p1=piltotosRest.obtenerPilotosPorId(Piloto.class, idp1+"");
        Piloto p2 = null;
        p2=piltotosRest.obtenerPilotosPorId(Piloto.class, idp2+"");
        
        escuderia.setPiloto1(p1);
        escuderia.setPiloto2(p2);

        escuderia.setPais(p);
        escuderia.setCampeonato(c);
        escuderia.setMonoplaza1(m1);
        escuderia.setMonoplaza2(m2);
        
        escueriaRest.crearEscuderia(escuderia, String.class);
        return "listado";
    }

    public String edit() throws IOException {
        upload();
        Pais p = null;
        p=paisesRest.obtenerPaisPorId(Pais.class, idpais+"");
        Monoplaza m1 = null;
        m1=monoplazaRest.obtenerMonoplazaPorId(Monoplaza.class, mid1+"");
        Monoplaza m2 = null;
        m2=monoplazaRest.obtenerMonoplazaPorId(Monoplaza.class, mid2+"");
        Piloto p1 = null;
        p1=piltotosRest.obtenerPilotosPorId(Piloto.class, idp1+"");
        Piloto p2 = null;
        p2=piltotosRest.obtenerPilotosPorId(Piloto.class, idp2+"");
        escuderia.setPiloto1(p1);
        escuderia.setPiloto2(p2);
        escuderia.setPais(p);
        escuderia.setCampeonato(c);
        escuderia.setMonoplaza1(m1);
        escuderia.setMonoplaza2(m2);
        
        escueriaRest.editarEscuderia(escuderia);

        return "listado";
    }

    public String editarView(int idEscuderia) {
        escuderia=escueriaRest.obtenerEscuderiaPorId(Escuderia.class, idEscuderia+"");
        mid1 = escuderia.getMonoplaza1().getIdMonoplaza();
        mid2 = escuderia.getMonoplaza2().getIdMonoplaza();
        idp1 = escuderia.getPiloto1().getIdPiloto();
        idp2 = escuderia.getPiloto2().getIdPiloto();
        idpais = escuderia.getPais().getIdPais();

        return "editar";
    }

    public void upload() throws IOException {
        //System.out.println("tmp directory" System.getProperty("java.io.tmpdir"));
        byte[] bytes = null;
        System.out.println("Size " + file.getSize());

        if (null != file && file.getSize() > 0) {
            escuderia.setImagen("http://" + wsSessionBean.IP + "/images/escuderias/" + escuderia.getNombre() + ".jpg");

            copyFile(escuderia.getNombre() + ".jpg", file.getInputstream());
            FacesMessage message = new FacesMessage("Succesful", file.getFileName() + " is uploaded.");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }

    public void copyFile(String fileName, InputStream in) {
        try {

            // write the inputStream to a FileOutputStream
            OutputStream out = new FileOutputStream(new File(filePath + fileName));

            int read = 0;
            byte[] bytes = new byte[1024];

            while ((read = in.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }

            in.close();
            out.flush();
            out.close();

            System.out.println("New file created!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private List<Escuderia> findAllEscuderia(Integer idCampeonato) {

        return escueriaRest.obtenerPilotosByCampeonato(new GenericType<List<Escuderia>>() {
        }, idCampeonato + "");
    }

}
