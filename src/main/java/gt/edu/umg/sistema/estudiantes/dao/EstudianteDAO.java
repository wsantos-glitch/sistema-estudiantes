/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gt.edu.umg.sistema.estudiantes.dao;
import gt.edu.umg.sistema.estudiantes.modelo.Estudiante;
import java.util.List;
/**
 *
 * @author wilso
 */
public interface EstudianteDAO {
    void agregar(Estudiante estudiante);
    List<Estudiante> obtenerTodos();
}

