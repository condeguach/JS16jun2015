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
public class ClaseEstudiante extends ClasePersona {

    private String fichaAcademica;
    private String carrera;

    public ClaseEstudiante() {
        super();
    }

  

    public ClaseEstudiante(String fichaAcademica, String carrera) {
        super();
        this.fichaAcademica = fichaAcademica;
        this.carrera = carrera;
    }

    public ClaseEstudiante(String fichaAcademica, String carrera, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.fichaAcademica = fichaAcademica;
        this.carrera = carrera;
    }

    public String getFichaAcademica() {
        return fichaAcademica;
    }

    public void setFichaAcademica(String fichaAcademica) {
        this.fichaAcademica = fichaAcademica;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nFicha Academica : "+fichaAcademica+"\nCarrera : "+carrera;
        
     //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
