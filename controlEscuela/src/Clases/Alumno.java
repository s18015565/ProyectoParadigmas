package Clases;

public class Alumno {
    
    private String matricula;
    private String nombre;
    private int calificacion = 0;

    public Alumno(String matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
        
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String valor) {
        this.matricula = valor;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String valor) {
        this.nombre = valor;
    }

    public int getCalificacionFinal() {
        return this.calificacion;
    }

    public void setCalificacion(int valor) {
        this.calificacion = valor;
    }
  
}
