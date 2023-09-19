/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo67;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import newpackage.entidades.Alumno;

import AccesoADatos.MateriaData;
import java.util.List;
import newpackage.entidades.Inscripcion;
import newpackage.entidades.Materia;

/**
 *
 * @author Usuario
 */
public class UniversidadGrupo67 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlumnoData auxAlumnoData=new AlumnoData();
        LocalDate fecha1 = LocalDate.of(2014, Month.JANUARY, 1);
        Date fecha= Date.valueOf(fecha1);
        Alumno alum1=new Alumno("Apellido", "Nombre", fecha1, true);
        //auxAlumnoData.guardarAlumno(alum1);
        //Alumno alum2=new Alumno();
        ArrayList<Alumno> Alumnos=new ArrayList();
        Alumnos=auxAlumnoData.listarAlumnos();
        for (Alumno Alumno1 : Alumnos) {
            
            System.out.println(Alumno1.toString());
        }
        
        
        
        
        
//        Materia materia = new Materia("Cs socialess", 2023, true);
//        Materia materia1 = new Materia("Cs Naturales", 2021, true);
        MateriaData md = new MateriaData();
        
//        System.out.println(md.buscarMateria(3));
//        System.out.println(md.buscarMateria(3));
//        System.out.println(md.listarMaterias());
        
        InscripcionData inscData = new InscripcionData();
//        
//        Alumno maris = auxAlumnoData.buscarAlumno(10);
//        Materia matematica = md.buscarMateria(1);
//        Inscripcion insc = new Inscripcion(maris, matematica, 8);
//        inscData.guardarInscripcion(insc);
//        inscData.actualizarNota(10, 1, 10);
//        inscData.borrarInscripcionMateriaAlumno(10, 1);
//        for(Inscripcion insc:inscData.obtenerInscripciones()){
////            System.out.println(insc);
//            System.out.println("Id Inscripcion: "+insc.getIdInscripcion());
//            System.out.println("Nombre y Apellido: "+insc.getAlumno().getNombre()+" "+insc.getAlumno().getApellido());
//            System.out.println("Materia: "+insc.getMateria().getNombre());
//            System.out.println("");
//        }
//          for(Inscripcion insc:inscData.obtenerInscripcionesPorAlumno(4)){
//            System.out.println(insc);
//          }
//        for(Materia materia:inscData.obtenerMateriasCursadas(4)){
//            System.out.println(materia);
//        }
        
//        for(Materia materia:inscData.obtenerMateriasNoCursadas(10)){
//            System.out.println(materia);
//        }
          for(Alumno alumno:inscData.obtenerAlumnosXMateria(1)){
            System.out.println(alumno);
        }
    }
    
}
