/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.estudiantes.modelo;

/**
 *
 * @author wilso
 */

public class Empleado extends Persona {
    private String codigoEmpleado;
    private String puesto;

    public Empleado(int id, String nombre, String nit, String telefono, String codigoEmpleado, String puesto) {
        super(id, nombre, nit, telefono);
        this.codigoEmpleado = codigoEmpleado;
        this.puesto = puesto;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + ", Código: " + codigoEmpleado + ", Puesto: " + puesto;
    }
}
