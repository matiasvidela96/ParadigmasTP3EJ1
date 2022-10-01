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
    private ArrayList <Inscripcion> inscripto = new ArrayList<Inscripcion>();

    public Estudiante(Integer legajo, String nombre) {
        this.legajo = legajo;
        super.nombre = nombre;
    }
    
    public void inscribir(Curso c) throws ErrorInscripcion{
    
        if (inscripto.size() == 3) {throw new ErrorInscripcion();}
        Inscripcion i = new Inscripcion(this,c);
        inscripto.add(i);    
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Inscripcion> getInscripto() {
        return inscripto;
    }

    public void setInscripto(ArrayList<Inscripcion> inscripto) {
        this.inscripto = inscripto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
