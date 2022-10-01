package Asignaturas;
import Miembros.*;

import java.util.ArrayList;

public class Curso {
    protected String titulo;
    private ArrayList <Inscripcion> delAlumno;

    public Curso(String titulo) {
        this.titulo = titulo;
    }
    
    
    private void inscripto(){
        System.out.println("Curso: "+ titulo);
        System.out.println("Cantidad de inscriptos "+ delAlumno.size());
        for (int i = 0; i < delAlumno.size(); i++) {
            System.out.println(delAlumno.get(i).getAlumno().getNombre());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Inscripcion> getDelAlumno() {
        return delAlumno;
    }

    public void setDelAlumno(Inscripcion i) {
        delAlumno.add(i);
    }
    
    
    
}