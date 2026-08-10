/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gt.edu.umg.sistema.estudiantes.dao;

/**
 *
 * @author wilso
 */
public interface FacturaDAO {
    // Recibirá los datos y retornará un booleano si se guardó exitosamente
    boolean guardarFacturaBD(String noFactura, String cliente, double total);
}
