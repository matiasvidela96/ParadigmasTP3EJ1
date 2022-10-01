/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Miembros;

import Asignaturas.*;
import java.util.ArrayList;

/**
 *
 * @author mativ
 */
public class Estudiante extends Persona{
    protected Integer legajo;
    private ArrayList <Inscripcion> inscripto;

    public Estudiante(Integer legajo, String nombre) {
        this.legajo = legajo;
        super.nombre = nombre;
    }
    
    public void inscribir(Curso c){
    
    
    }
    
}
