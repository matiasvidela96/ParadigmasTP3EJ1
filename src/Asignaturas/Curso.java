package Asignaturas;
import Miembros.*;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class Curso extends Hashtable <Integer, Inscripcion> {
    protected String titulo;
    private Hashtable<Integer,Inscripcion> delAlumno;

    public Curso(String titulo) {
        this.titulo = titulo;
        delAlumno = new Hashtable<>();
    }
    
    //muestro los inscriptos al curso
    public void inscriptos(){
        System.out.println("Curso: " + titulo);
        System.out.println("Cantidad de inscriptos "+ delAlumno.size());
        System.out.println("----------------------------------------------");

        Enumeration enum1 = delAlumno.elements(); //Se usa el objeto enum1 para reccorre los elmentos de un Hashtable retornado por elements. 
                                        //"elements()" retorna los elemenos delAlumno, es decir del hastable, instanciado.

        Inscripcion i1;        

        //Se recorren los elementos de la enumeración, extrayendo en cada iteración el objeto "RegistroVirtuales" cointenido en el hastable
        while (  enum1.hasMoreElements() ) {
            i1=(Inscripcion) enum1.nextElement();
            System.out.println("Legajo: " + i1.getAlumno().getLegajo());
            System.out.println("Nombre: " + i1.getAlumno().getNombre());
            System.out.println("----------------------------------------------");
        } 

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Hashtable<Integer, Inscripcion> getDelAlumno() {
        return delAlumno;
    }

    public void setDelAlumno(Estudiante e,Inscripcion i) {
        delAlumno.put(e.getLegajo(), i);
    }
    
    
    
}