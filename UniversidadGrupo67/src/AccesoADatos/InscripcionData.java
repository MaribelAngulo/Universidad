/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import java.sql.Connection;
import java.util.List;
import newpackage.entidades.Alumno;
import newpackage.entidades.Inscripcion;
import newpackage.entidades.Materia;

/**
 *
 * @author Usuario
 */
public class InscripcionData {
    
    private MateriaData materiaData;
    private AlumnoData alumnoData;
    private Connection con; //CREO UNA VARIABLE DE TIPO CONEXION

    public InscripcionData() {
    }
    
    public void guardarInscripcion(Inscripcion inscripcion){
    //ToDo    
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        //ToDo
        return null;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno){
        //ToDo
        return null;
    }
    
    public List<Materia> obtenerMateriasCursadas(int idAlumno){
        //ToDo
        return null;
    }
    
    public List<Materia> obtenerMateriasNoCursadas(int idAlumno){
        //ToDo
        return null;
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        //ToDo
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        //ToDo
    }
    
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
        //ToDo
        return null;
    }
}
