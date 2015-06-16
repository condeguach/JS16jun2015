/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadiados;

/**
 *
 * @author santamaria
 */
public class JavaDiaDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      ClasePersona per1= new ClasePersona("jose",22,'m');
      
      ClaseEstudiante est1= new ClaseEstudiante("22312311","Ing. Iormatica",per1.getNombre(),per1.getEdad(),per1.getSexo());
      
      ClaseProfesor prof1= new ClaseProfesor("Ingenro",14,per1.getNombre(),per1.getEdad(),per1.getSexo());
        
      System.out.println("Persona "+per1);
      System.out.println("Estudiante "+est1);
      System.out.println("Profesor "+prof1);
      
      System.out.println("el nombre de la universidad es "+ClaseUniversidad.nombre);
           
    }
    
}
