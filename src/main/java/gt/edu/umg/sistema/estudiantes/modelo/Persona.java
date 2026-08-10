/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.estudiantes.modelo;

/**
 *
 * @author wilso
 */

public abstract class Persona {
    private int id;
    private String nombre;
    private String nit;
    private String telefono;

    // Constructor vacío
    public Persona() {}

    // Constructor con parámetros
    public Persona(int id, String nombre, String nit, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.nit = nit;
        this.telefono = telefono;
    }

    // Método que será sobreescrito (polimorfismo/herencia)
    public String mostrarInformacion() {
        return "ID: " + id + ", Nombre: " + nombre + ", NIT: " + nit + ", Tel: " + telefono;
    }

    // (Genera los Getters y Setters haciendo clic derecho > Insert Code > Getter and Setter)
}