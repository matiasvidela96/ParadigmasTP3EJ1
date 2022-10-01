/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asignaturas;

import Miembros.Estudiante;

/**
 *
 * @author mativ
 */
public class ErrorInscripcion extends Exception{
        
    public ErrorInscripcion(Estudiante e) {
        System.out.println("Error: no se puede inscribir en más de 3 materias");
    }
    
}
