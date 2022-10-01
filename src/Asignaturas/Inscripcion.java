package Asignaturas;
import Miembros.*;


public class Inscripcion {
    private Estudiante alumno;
    private Curso paraEl;

    public Inscripcion(Estudiante alumno, Curso paraEl) {//al crear una inscripcion guardo en hashtable de curso al alumno
        this.alumno = alumno;
        this.paraEl = paraEl;
       
//        paraEl.put(alumno.getLegajo(), this);  
        
        paraEl.setDelAlumno(alumno,this);
    }

    public Estudiante getAlumno() {
        return alumno;
    }

    public void setAlumno(Estudiante alumno) {
        this.alumno = alumno;
    }

    public Curso getParaEl() {
        return paraEl;
    }

    public void setParaEl(Curso paraEl) {
        this.paraEl = paraEl;
    }
    
    
    
    
}
