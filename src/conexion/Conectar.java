/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author argue
 */
public class Conectar {

    public static final String URL = "jdbc:mysql://localhost:3306/eltrastero";
    public static final String USER = "apu";
    public static final String CLAVE = "apu";

    public Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
            System.out.println("conectada");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
    
    public static void main(String[] args) {
        Conectar con=new Conectar();
        con.getConexion();
    }

    
}
