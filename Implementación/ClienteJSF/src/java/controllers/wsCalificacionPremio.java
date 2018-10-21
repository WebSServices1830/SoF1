/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import ws.CalificacionPremio;
import ws.Premio;


/**
 *
 * @author Michael
 */
@Named(value = "wsCalificacionPremio")
@ManagedBean
public class wsCalificacionPremio {

    /**
     * Creates a new instance of wsCalificacionPiloto
     */
    CalificacionPremio calificacion = new CalificacionPremio();
    List<CalificacionPremio> calificaciones = new ArrayList<CalificacionPremio>();
    List<Premio> pilotos = new ArrayList<Premio>();


    
    public wsCalificacionPremio() {
    }
    
    
    public void calificar(){
        
        
    }
    
    //---------------------------------------------------------------------------------------
    
}
