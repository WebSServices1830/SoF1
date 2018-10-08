/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import proxy.Monoplaza;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
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

    /**
     * Creates a new instance of wsMonoplazaBean
     */
    private List<Monoplaza> monoplazas=new ArrayList<>();
    
    Monoplaza monoplaza=new Monoplaza();
    
    
    
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
        return "listado";//endava   12 de actubre 8 am
    } 
    
    public List<Monoplaza> getMonoplazas() {
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
 

   String filePath = "C:\\wamp\\www\\images\\";    
public void upload() throws IOException {
        //System.out.println("Name " + getName());
        //System.out.println("tmp directory" System.getProperty("java.io.tmpdir"));
        byte[] bytes = null;

        if (null != file) {
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
