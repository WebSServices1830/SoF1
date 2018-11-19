/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Campeonato;
import entities.Pais;
import entities.Piloto;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.ws.rs.core.GenericType;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceRef;
import org.primefaces.model.UploadedFile;
import ws.OpinionesRestClient;
import ws.PaisesRestClient;
import ws.PilotoRestClient;

/**
 *
 * @author USUARIO
 */
@Named(value = "wsPilotoBean")
@ManagedBean
public class wsPilotoBean {

    @ManagedProperty(value = "#{wsSessionBean.campeonato}")
    private Campeonato c;
    
    private   PilotoRestClient pcl=new PilotoRestClient();
   private     PaisesRestClient prcl=new PaisesRestClient();
    
    public Campeonato getC() {
        return c;
    }

    public void setC(Campeonato c) {
        this.c = c;
    }
    
    
    
    String filePath = "C:\\xampp\\htdocs\\images\\pilots\\";

    float m;
    

    public float getM() {
        return m;
    }

    public void setM(float m) {
        this.m = m;
    }


    /**
     * Creates a new instance of wsPilotoBean
     */
    List<Piloto> pilotos = new ArrayList<>();
    Piloto piloto = new Piloto();
    private Date fecha;
    
    int idpais;
    public int getIdpais() {
        return idpais;
    }

    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }
    
     List<Pais> paises=new ArrayList<>();

    public List<Pais> getPaises() {
        paises=findAllPais();
        return paises;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }
     
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Piloto getPiloto() {
        
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public List<Piloto> getPilotos() {
     pilotos=findAllPilotoByCampeonato(c.getIdCampeonato());
        return pilotos;
    }

    public void setPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }
private OpinionesRestClient opinionesRest =new OpinionesRestClient();
    
      public Integer getPromedioPiloto(int idPiloto) {

return Double.valueOf(opinionesRest.obtenerCalificacionPromedioPiloto(String.class, idPiloto+"").replaceAll(",", ".")).intValue();
    }
    public wsPilotoBean() {
    }

    public String save() throws IOException {
        piloto.setCampeonato(c);
        upload();
    
        Pais p= prcl.obtenerPaisPorId(Pais.class, idpais+"");
        piloto.setPais(p);
        String crearPilotos = pcl.crearPilotos(piloto, String.class);
        System.out.println("save "+crearPilotos);
        return "listado";
    }
    


    public void delete(int id) {
        pcl.eliminarPilotos(id+"");
        System.out.println("borrando " + id);

    }

    public String editar(int id) throws IOException {
           piloto= pcl.obtenerPilotosPorId(Piloto.class, id+"");
           idpais=piloto.getPais().getIdPais();
     
           return "editar";

    }

    public String edit() throws IOException {
        piloto.setCampeonato(c);
        upload();
        Pais p= prcl.obtenerPaisPorId(Pais.class, idpais+"");
        piloto.setPais(p);
       
        pcl.editarPilotos(piloto);
  //      editPiloto(piloto);
        return "listado";

    }

    private UploadedFile file;

    public Date getDate(Date xmlgc){
        if(xmlgc== null) return null;
        return xmlgc;
    }
    
    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public void upload() throws IOException {
        //System.out.println("Name " + getName());
        //System.out.println("tmp directory" System.getProperty("java.io.tmpdir"));
        byte[] bytes = null;

        if (null != file && file.getSize()>0) {
         piloto.setImagen("http://"+wsSessionBean.IP + "/images/pilots/" + piloto.getNumero()+ ".jpg");

        System.out.println("File Name " + file.getFileName());
        System.out.println("File New Name " + piloto.getNumero());
        System.out.println("Size " + file.getSize());
            copyFile(piloto.getNumero() + ".jpg", file.getInputstream());
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

    private List<Pais> findAllPais() {
        return prcl.obtenerPaises(new GenericType<List<Pais>>() {});
    }

    private List<Piloto> findAllPilotoByCampeonato(Integer idCampeonato) {
        
        return pcl.obtenerPilotosByCampeonato(new GenericType<List<Piloto>>(){}, idCampeonato+"");
    }

       
    
}
