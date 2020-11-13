
package Clases;

import java.util.ArrayList;

public class Grupo {
    
    String asignatura;
    String salon;
    String modalidad;
    ArrayList<Alumno> alumnos = null;
    
    public Grupo (String asignatura, String salon, String modalidad){
        
        this.setAsignatura(asignatura);
        this.setSalon(salon);
        this.setModalidad(modalidad);
        
    }

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

    
    public void añadirAlumno (Alumno alumno){
        alumnos.add(alumno);
    } 
    
    public ArrayList getAlumnos (){
        return alumnos;
    }
    
    public void subirCalificacionExamen(Alumno alumno, int calificacion){
        alumno.setCalificacionExamen(calificacion);
    }
    
    public void subirCalificacionPractica(Alumno alumno, int calificacion){
        alumno.setCalificacionPractica(calificacion);
    }
    
    public void calcularPromedios(){
        
        for (Alumno a : alumnos){
            a.setCalificacionFinal((a.getCalificacionExamen() + a.getCalificacionPractica()) / 2);
        }
    }
    
    public double calcularPorcentajeAprobados(){
        
        int aprobados = 0;
        
        for (Alumno a:alumnos) {
            if (a.getCalificacionFinal() >= 6) {
                aprobados++;
            }
            
        }
        return aprobados / alumnos.size();
    }
    
    
}
