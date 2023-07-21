package paquete1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Enlace {
    
    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/base02.bd";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarTrabajador(DatosTrabajador trabajador) {

        try {

            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO Trabajador (cedula, "
                    + "nombres, correo, mesSueldo, sueldo) "
                    + "values ('%s', '%s' , '%s' , '%s', '%.2f')",
                    trabajador.obtenerCedula(),
                    trabajador.obtenerNombres(),
                    trabajador.obtenerCorreo(),
                    trabajador.obtenerMesSueldo(),
                    trabajador.obtenerSueldo());
            System.out.print(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarTrabajador");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<DatosTrabajador> obtenerDataTrabajador() { 
        
        ArrayList<DatosTrabajador> lista = new ArrayList<>();
        
        try{  
            
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from Trabajador;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                
                DatosTrabajador t = new DatosTrabajador(rs.getString("nombres"),
                        rs.getString("cedula"),
                        rs.getString("correo"),
                        rs.getString("mesSueldo"),
                        rs.getDouble("sueldo"));
                
                lista.add(t);
                
            }
            
            obtenerConexion().close();
            
        } catch (SQLException e) { 
            
             System.out.println("Exception: insertarTrabajador");
             System.out.println(e.getMessage());  
             
        }  
        return lista;
    }

}