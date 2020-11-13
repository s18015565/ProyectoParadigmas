
package Clases;

import java.util.ArrayList;

public class Grupo {
    
    String asignatura;
    String salon;
    String modalidad;
    ArrayList<Alumno> alumnos = null;
    ArrayList<Evaluacion> evaluaciones = null;

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void añadirAlumno(Alumno alumno){
        this.alumnos.add (alumno);
    }

    public ArrayList<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public void añadirEvaluaciones(ArrayList<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }
    
    public void calcularPromedios (){
        
    }
    
    
    
}
