package Asignaturas;
import Miembros.*;


public class Inscripcion {
    private Estudiante alumno;
    private Curso paraEl;

    public Inscripcion(Estudiante alumno, Curso paraEl) {
        this.alumno = alumno;
        this.paraEl = paraEl;
        paraEl.setDelAlumno(this);
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
