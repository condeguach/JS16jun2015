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
public class ClasePersona {

    private String nombre;
    private int edad;
    private char sexo;

    public ClasePersona() {
    }

    public ClasePersona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+"\nEdad : "+edad+"\nSexo : "+sexo; 
                
//To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
