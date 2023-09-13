/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo67;

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
        
        Materia materia = new Materia("Cs socialess", 2023, true);
        Materia materia1 = new Materia("Cs Naturales", 2021, true);
        MateriaData md = new MateriaData();
        
        System.out.println(md.buscarMateria(3));
        System.out.println(md.buscarMateria(3));
        System.out.println(md.listarMaterias());
        
    }
    
}
