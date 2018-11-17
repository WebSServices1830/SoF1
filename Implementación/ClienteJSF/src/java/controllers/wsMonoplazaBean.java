/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import entities.Campeonato;
import entities.Monoplaza;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.primefaces.model.UploadedFile;


/**
 *
 * @author sala a
 */
@Named(value = "wsMonoplazaBean")
@ManagedBean
public class wsMonoplazaBean {

   
    
  String filePath = "C:\\xampp\\htdocs\\images\\cars\\";
    /**
     * Creates a new instance of wsMonoplazaBean
     */
    private List<Monoplaza> monoplazas=new ArrayList<>();
    
    Monoplaza monoplaza=new Monoplaza();
    
     @ManagedProperty(value = "#{wsSessionBean.campeonato}")
    private Campeonato c;

    public Campeonato getC() {
        return c;
    }

    public void setC(Campeonato c) {
        this.c = c;
    }
    
    
    
     private UploadedFile file;

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }
    
    public wsMonoplazaBean() {
    }

    public String save() throws IOException{
        upload();
         monoplaza.setImagen("http://"+wsSessionBean.IP + "/images/cars/" + monoplaza.getMarca()+ ".jpg");
         monoplaza.setCampeonato(c);
//         createMonoplaza(monoplaza);
        return "listado";
    } 
    public String delete(int id){
   //     removeMonoplaza(id);
        return null;
    }
        public String editarView(int id) throws IOException {
 //           monoplaza=findMonoplaza(id);
        return "edit";

    }

    
    public List<Monoplaza> getMonoplazas() {
 //       monoplazas=findAllMonoplaza(c.getIdCampeonato());
        return monoplazas;
    }

    public void setMonoplazas(List<Monoplaza> monoplazas) {
        this.monoplazas = monoplazas;
    }

    public Monoplaza getMonoplaza() {
        return monoplaza;
    }

    public void setMonoplaza(Monoplaza monoplaza) {
        this.monoplaza = monoplaza;
    }
 
    public String edit() throws IOException{
        monoplaza.setCampeonato(c);
        System.out.println("editando "+monoplaza.getIdMonoplaza());
        upload();
 //       editMonoplaza(monoplaza);
    return "listado";
    }
public void upload() throws IOException {
        //System.out.println("tmp directory" System.getProperty("java.io.tmpdir"));
        byte[] bytes = null;
                System.out.println("Size " + file.getSize());

        
        if (null != file && file.getSize() >0) {
             monoplaza.setImagen("http://"+wsSessionBean.IP + "/images/cars/" + monoplaza.getMarca()+ ".jpg");
       System.out.println("Name " );
        
            copyFile(monoplaza.getMarca()+".jpg", file.getInputstream());
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

    
}
