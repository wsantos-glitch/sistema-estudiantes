/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author wilso
 */
package gt.edu.umg.sistema.estudiantes.dao;

import gt.edu.umg.sistema.estudiantes.modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;

public class FacturaDAOImpl implements FacturaDAO {
    private Conexion conexion = new Conexion();

    @Override
    public boolean guardarFacturaBD(String noFactura, String cliente, double total) {
        // En esta nueva versión también pediremos el NIT y la fecha
        return false; 
    }
    
    // Sobrecarga del método para incluir todos los datos de la BD
    public boolean guardarFacturaBD(String noFactura, String cliente, String nit, Date fecha, double total) {
        String sql = "INSERT INTO facturas (no_factura, cliente, nit, fecha, total) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
             
            ps.setString(1, noFactura);
            ps.setString(2, cliente);
            ps.setString(3, nit);
            ps.setDate(4, fecha);
            ps.setDouble(5, total);
            
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}