
package Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Evaluacion {
    
    String nombre;
    String tipo;
    ArrayList<Alumno> calificacionesEvaluacion;
    
    public Evaluacion(ArrayList<Alumno> alumnos, String nombre, String tipo){
        
        if (tipo!="EXAMEN" || tipo != "PRACTICA") {
            
            System.out.println("\f");
            System.out.println("Introduzca EXAMEN o PRACTICA.");
            return;
        }
        
        if (alumnos.isEmpty()) {
            
            System.out.println("\f");
            System.out.println("Añada alumnos antes de declarar evaluaciones.");
            return;
        }
        
        this.calificacionesEvaluacion = alumnos;
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public void subirCalificaciones (){
        
        Scanner lector = new Scanner (System.in);
        
        for (Alumno a:calificacionesEvaluacion) {
            
            System.out.println("Inserte la calificacion de cada alumno. \n\n");
            System.out.print(a.getMatricula() +  a.getNombre()+" :");
            a.setCalificacion(lector.nextInt());
            System.out.println("\f");
            
        }
        
    }
    
    
    
    
    
    
}
