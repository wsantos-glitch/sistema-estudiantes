/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.estudiantes.controlador;
import gt.edu.umg.sistema.estudiantes.dao.EstudianteDAO;
import gt.edu.umg.sistema.estudiantes.dao.EstudianteDAOImpl;
import gt.edu.umg.sistema.estudiantes.modelo.Estudiante;
import java.util.List;
/**
 *
 * @author wilso
 */
public class EstudianteController {
    private EstudianteDAO dao;

    public EstudianteController() {
        this.dao = new EstudianteDAOImpl();
    }

    public void registrarEstudiante(String id, String nombres, String apellidos, String email, String carnet) {
        Estudiante nuevo = new Estudiante(id, nombres, apellidos, email, carnet);
        dao.agregar(nuevo);
    }

    public List<Estudiante> listarEstudiantes() {
        return dao.obtenerTodos();
    }
}
