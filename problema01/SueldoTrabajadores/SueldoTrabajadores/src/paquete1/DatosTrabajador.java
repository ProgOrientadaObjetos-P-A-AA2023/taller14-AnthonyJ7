/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Jhonder
 */
public class DatosTrabajador {

    private String cedula;
    private String nombres;
    private String correo;
    private double sueldo;
    private String mesSueldo;

    
    public DatosTrabajador(String ced, String nom, String crr, String mesS, double sd ) {
        cedula = ced;
        nombres = nom;
        correo = crr;
        sueldo = sd;
        mesSueldo = mesS;
    }

    
    
    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public String obtenerMesSueldo() {
        return mesSueldo;
    }

    public void establecerCedula(String x) {
        cedula = x;
    }

    public void establecerNombres(String x) {
        nombres = x;
    }

    public void establecerCorreo(String x) {
        correo = x;
    }

    public void establecerSueldo(double x) {
        sueldo = x;
    }

    public void establecerMesSueldo(String x) {
        mesSueldo = x;
    }
    
    
    @Override
    public String toString(){
        String cadena = String.format(
                  "Cedula: %s\n"
                + "Nombres: %s\n"
                + "Correo: %s\n"
                + "Sueldo: %.2f\n"
                + "Mes del sueldo: %s\n",
                cedula,
                nombres,
                correo,
                sueldo,
                mesSueldo);
        
        return cadena;
    }
}
