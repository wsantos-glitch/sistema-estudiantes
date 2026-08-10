/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wilso
 */
package gt.edu.umg.sistema.estudiantes.modelo;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private static final String URL = "jdbc:postgresql://localhost:5432/bd_sistema_estudiantes";
    private static final String USER = "postgres";
    private static final String PASS = "12345"; // <-- Escribe tu clave aquí

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            System.out.println("Error de BD: " + e.getMessage());
            return null;
        }
    }
}