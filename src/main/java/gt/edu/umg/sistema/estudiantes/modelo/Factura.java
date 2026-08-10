/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.estudiantes.modelo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author wilso
 */
public class Factura {
    private int idFactura;
    private LocalDate fecha;
    private Cliente cliente; // Asociación
    private List<DetalleFactura> detalles; // Composición

    public Factura(int idFactura, LocalDate fecha, Cliente cliente) {
        this.idFactura = idFactura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.detalles = new ArrayList<>(); // Inicializa la lista (Composición)
    }

    public void agregarDetalle(DetalleFactura detalle) {
        this.detalles.add(detalle);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (DetalleFactura det : detalles) {
            total += det.calcularSubtotal();
        }
        return total;
    }
}