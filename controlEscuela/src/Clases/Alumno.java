package Clases;

public class Alumno {
    
    private String matricula;
    private String nombre;
    private int calificacionExamen = 0;
    private int calificacionPractica = 0;
    private int calificacionFinal = 0;

    public Alumno(String matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
        
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalificacionExamen() {
        return calificacionExamen;
    }

    public void setCalificacionExamen(int calificacionExamen) {
        this.calificacionExamen = calificacionExamen;
    }

    public int getCalificacionPractica() {
        return calificacionPractica;
    }

    public void setCalificacionPractica(int calificacionPractica) {
        this.calificacionPractica = calificacionPractica;
    }

    public int getCalificacionFinal() {
        return calificacionFinal;
    }

    public void setCalificacionFinal(int calificacionFinal) {
        this.calificacionFinal = calificacionFinal;
    }

    
  
}
