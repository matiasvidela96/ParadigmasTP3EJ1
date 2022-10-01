/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import Asignaturas.*;
import Miembros.*;


/**
 *
 * @author mativ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creo estudiantes
        Estudiante e1 = new Estudiante (001,"matias");
        Estudiante e2 = new Estudiante (002,"augusto");
        
        //creo cursos
        Curso c1 = new Curso ("Paradigmas");
        
        //creo profesores
        Profesor p1 = new Profesor("leon");
        
        //setear curso a profesor
        p1.dicta(c1);
        
        //inscribir estudiantes a cursos
        e1.inscribir(c1);
        
        //mostrar alumnos inscriptos a cursos
        c1.inscriptos();
    }
    
}