/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author ASUS
 */
public class Docentes {

    private String nombre;
    private String apellido;
    private double calificacion;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public Docentes(String nombre, String apellido, double calificacion, double c, double c3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacion = calificacion;
        this.calificacion2 = c;
        this.calificacion3 = c3;
    }

    public void establecerNommbre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public void establecerCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    public void establecerCalificacion2(double calificacion) {
        this.calificacion2 = calificacion;
    }
    
    public void establecerCalificacion3(double calificacion) {
        this.calificacion3 = calificacion;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerCalificacion() {
        return calificacion;
    }
    
    
    public double obtenerCalificacion2() {
        return calificacion2;
    }
    
    public double obtenerCalificacion3() {
        return calificacion3;
    }

public void calcularPromedio() {
        promedio = (calificacion + calificacion2 + calificacion3) / 3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s %s\n"
                + "\tCalificaciones:\n"
                + "\t%.2f\n"
                + "\t%.2f\n"
                + "\t%.2f\n"
                + "\tPromedio: %.2f\n",
                obtenerNombre(),
                obtenerApellido(),
                calificacion,
                calificacion2,
                calificacion3,
                promedio);
        return cadena;

    }
}