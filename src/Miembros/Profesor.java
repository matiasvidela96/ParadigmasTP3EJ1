/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Miembros;

import Asignaturas.*;

/**
 *
 * @author mativ
 */
public class Profesor extends Persona{

    private Curso curso;
    
    public Profesor(String nombre) {
        super.nombre = nombre;
    }
    
    //seria el set curso
    public void dicta (Curso c){
    
        this.curso = c;
        
    }

    public Curso getCurso() {
        return curso;
    }
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void getCursoDictado() {
        System.out.println("El profesor " + this.nombre + " " + "dicta el curso " + curso.getTitulo());        
    }
    
    
    
}
