/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import paquete3.Enlace;

/**
 *
 * @author ASUS
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Enlace c = new Enlace();

        for (int i = 0; i < c.obtenerDataCalificaciones().size(); i++) {
            System.out.printf("%s", c.obtenerDataCalificaciones().get(i));
        }

    }
}
