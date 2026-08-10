/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.estudiantes.dao;

/**
 *
 * @author wilso
 */
public class FacturaDAOImpl implements FacturaDAO {
    @Override
    public boolean guardarFacturaBD(String noFactura, String cliente, double total) {
        // AQUÍ IRÁ LA CONEXIÓN A LA BASE DE DATOS EN EL FUTURO
        // Ej: Connection conn = Conexion.getConnection();
        // PreparedStatement ps = conn.prepareStatement("INSERT INTO facturas...");
        
        System.out.println("-------------------------------------------------");
        System.out.println("SIMULACIÓN DE CONEXIÓN A BASE DE DATOS INICIADA...");
        System.out.println("Ejecutando INSERT INTO facturas (no_factura, cliente, total)");
        System.out.println("DATOS GUARDADOS: Factura #" + noFactura + " | Cliente: " + cliente);
        System.out.println("-------------------------------------------------");
        
        return true; // Simulamos que se guardó correctamente
    }
}
