package paquete1;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        boolean bandera = true;
        
        ArrayList<DatosTrabajador> lista = new ArrayList<>();
        Enlace c = new Enlace();

        do {

            System.out.printf("\nMenu:\n1) Ingresar datos del trabajador"
                    + "\n2) Mostrar\n3) Salir \nElija una opcion: ");
            int resp = sc.nextInt();
            
            if (resp == 1) {
                sc.nextLine();
                    
                System.out.print("Ingrese la cedula: ");
                String cedula = sc.nextLine();
                System.out.print("Ingrese los nombres: ");
                String nombres = sc.nextLine();
                System.out.print("Ingrese el correo: ");
                String correo = sc.nextLine();
                System.out.print("Ingrese el sueldo: ");
                double sueldo = sc.nextDouble();
                sc.nextLine();
                System.out.print("Ingrese el mes del sueldo: ");
                String mes = sc.nextLine();

                DatosTrabajador trabajador = new DatosTrabajador(cedula,
                        nombres, correo, mes, sueldo);

                c.insertarTrabajador(trabajador);
                
                
                // System.out.printf("%s\n", docente);
                sc.nextLine();

            } else {

                if (resp == 2) {
                    
                    for (int i = 0; i < c.obtenerDataTrabajador().size(); i++) {
                        System.out.printf("%s", c.obtenerDataTrabajador().get(i));
                    }
                } else {

                    if (resp == 3) {
                        bandera = false;
                        System.out.print("\u001B[31m" + "SALIENDO DEL PROGRAMA...\n");

                    } else {
                        System.out.print("\u001B[31m" + "Error, opción no válida.\n");
                        //sc.nextLine();
                    }
                }

            }
        } while (bandera == true);

    }
}
