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
public class ClaseProfesor extends ClasePersona {

    private String profesion;
    private int añosExperiencia;

    public ClaseProfesor() {
        super();
    }

    public ClaseProfesor(String profesion, int añosExperiencia) {
        super();
        this.profesion = profesion;
        this.añosExperiencia = añosExperiencia;
    }

    public ClaseProfesor(String profesion, int añosExperiencia, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.profesion = profesion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nProfesion : "+profesion+"\nAños de Experiencia : "+añosExperiencia;
        
     //To change body of generated methods, choose Tools | Templates.
    }

}
