/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.estudiantes.modelo;

/**
 *
 * @author wilso
 */
public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private int existencia;

    public Producto(int idProducto, String nombre, double precio, int existencia) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
    }

    public boolean hayExistencia(int cantidad) {
        return this.existencia >= cantidad;
    }
}
