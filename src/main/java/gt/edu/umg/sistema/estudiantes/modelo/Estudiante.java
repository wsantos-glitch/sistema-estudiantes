/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.estudiantes.modelo;

/**
 *
 * @author wilso
 */
public class Estudiante {
    private String id;
    private String email;
    private String apellidos;
    private String nombres;
    private String carnet;
    
public Estudiante(String id, String nombres, String apellidos, String email, String carnet) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.carnet = carnet;
    }

    // Getters
    public String getId() { return id; }
    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public String getEmail() { return email; }
    public String getCarnet() { return carnet; }
}  