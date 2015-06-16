/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadiados;

import java.util.List;

/**
 *
 * @author santamaria
 */
public class ClaseUniversidad {
    
    public static final String nombre = "UNEG";
     public static final String ubicacion = "Atlantico";
     
     //lista de carreras
     
     private List<ClaseCarrera>carreras;

    public ClaseUniversidad() {
        
        carreras = new ArrayList<>();
        
    }
     
     

    public ClaseUniversidad(List<ClaseCarrera> carreras) {
        this.carreras = carreras;
    }

     
     
    public List<ClaseCarrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<ClaseCarrera> carreras) {
        this.carreras = carreras;
    }
     
     
    
}
