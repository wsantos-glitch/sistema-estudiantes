/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.estudiantes.dao;
import gt.edu.umg.sistema.estudiantes.modelo.Estudiante;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author wilso
 */
public class EstudianteDAOImpl implements EstudianteDAO {
    private List<Estudiante> estudiantes = new ArrayList<>();

    @Override
    public void agregar(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    @Override
    public List<Estudiante> obtenerTodos() {
        return estudiantes;
    }
}