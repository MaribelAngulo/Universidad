/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo67;

import AccesoADatos.AlumnoData;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import newpackage.entidades.Alumno;

import AccesoADatos.MateriaData;
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
        Alumno alum1=new Alumno("Apellido", "Nombre", fecha, true);
        //auxAlumnoData.guardarAlumno(alum1);
        //Alumno alum2=new Alumno();
        ArrayList<Alumno> Alumnos=new ArrayList();
        Alumnos=auxAlumnoData.listarAlumnos();
        for (Alumno Alumno1 : Alumnos) {
            
            System.out.println(Alumno1.toString());
        }
        
        
        
        
        
        Materia materia = new Materia("Cs socialess", 2023, true);
        Materia materia1 = new Materia("Cs Naturales", 2021, true);
        MateriaData md = new MateriaData();
        
        System.out.println(md.buscarMateria(3));
        System.out.println(md.buscarMateria(3));
        System.out.println(md.listarMaterias());
        
    }
    
}
