/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Estudiante[] estudiantes = new Estudiante[10];
        estudiantes[0] = new Estudiante("Juan", "Matemáticas", "Profesor A", 95);
        estudiantes[1] = new Estudiante("María", "Historia", "Profesor B", 85);
        estudiantes[2] = new Estudiante("Pedro", "Ciencias", "Profesor C", 91);
        estudiantes[3] = new Estudiante("Sebastian", "Español", "Profesor E", 86);
        estudiantes[4] = new Estudiante("Santiago", "Fisica", "Profesor F", 92);
        estudiantes[5] = new Estudiante("Daniel", "Civica", "Profesor G", 90);
        estudiantes[6] = new Estudiante("Laura", "Estudios Sociales", "Profesor H", 75);
       

       
        StringBuilder listado = new StringBuilder("Listado de Estudiantes:\n");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null) {
                listado.append("Nombre: ").append(estudiante.getNombre())
                        .append(", Curso: ").append(estudiante.getCurso())
                        .append(", Profesor: ").append(estudiante.getProfesor())
                        .append(", Calificación: ").append(estudiante.getCalificacion())
                        .append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, listado.toString());

    
        Estudiante mayorCalificacion = estudiantes[0];
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null && estudiante.getCalificacion() > mayorCalificacion.getCalificacion()) {
                mayorCalificacion = estudiante;
            }
        }
        JOptionPane.showMessageDialog(null, "Estudiante con la nota mayor: " + mayorCalificacion.getNombre());

       
        Estudiante menorCalificacion = estudiantes[0];
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null && estudiante.getCalificacion() < menorCalificacion.getCalificacion()) {
                menorCalificacion = estudiante;
            }
        }
        JOptionPane.showMessageDialog(null, "Estudiante con la nota menor: " + menorCalificacion.getNombre());

    
        double sumaCalificaciones = 0;
        int cantidadEstudiantes = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null) {
                sumaCalificaciones += estudiante.getCalificacion();
                cantidadEstudiantes++;
            }
        }
        double promedio = sumaCalificaciones / cantidadEstudiantes;
        JOptionPane.showMessageDialog(null, "Promedio de calificaciones: " + promedio);

       
        StringBuilder calificacionesEncimaPromedio = new StringBuilder("Calificaciones por encima del promedio:\n");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null && estudiante.getCalificacion() > promedio) {
                calificacionesEncimaPromedio.append(estudiante.getNombre())
                        .append(": ").append(estudiante.getCalificacion())
                        .append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, calificacionesEncimaPromedio.toString());

       
        StringBuilder calificacionesDebajoPromedio = new StringBuilder("Calificaciones por debajo del promedio:\n");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null && estudiante.getCalificacion() < promedio) {
                calificacionesDebajoPromedio.append(estudiante.getNombre())
                        .append(": ").append(estudiante.getCalificacion())
                        .append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, calificacionesDebajoPromedio.toString());
    }
}
