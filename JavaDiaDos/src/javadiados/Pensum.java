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
public class Pensum {
    
    private List<Materia>materias;

    public Pensum() {
    }

    
    
    public Pensum(<any> materias) {
        this.materias = materias;
    }
    
    

    public <any> getMaterias() {
        return materias;
    }

    public void setMaterias(<any> materias) {
        this.materias = materias;
    }
    
    
    
}
