/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.vistas;

import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import newpackage.entidades.Alumno;
import newpackage.entidades.Materia;

/**
 *
 * @author Natasha
 */
public class ListadoDeAlumnosPorMateria extends javax.swing.JInternalFrame {

    MateriaData matData = new MateriaData();
    InscripcionData insData = new InscripcionData();

    private final DefaultTableModel tabla = new DefaultTableModel() { //Creo un objeto DefaulTableModel para darle un modelo a la tabla
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public ListadoDeAlumnosPorMateria() {
        initComponents();
        armarCabecera(); //Armo cabecera de la tabla
        armarComboBox(); //Armo ComboBox

        // Crear y aplicar el renderizador personalizado para centrar el contenido de las celdas
        DefaultTableCellRenderer centrar = new DefaultTableCellRenderer();
        centrar.setHorizontalAlignment(JLabel.CENTER);

        // Aplicar el renderizador personalizado a las columnas específicas que deseas centrar
        jTable.getColumnModel().getColumn(0).setCellRenderer(centrar); // ID
        jTable.getColumnModel().getColumn(1).setCellRenderer(centrar); // Apellido
        jTable.getColumnModel().getColumn(2).setCellRenderer(centrar); // Nombre
        jTable.getColumnModel().getColumn(3).setCellRenderer(centrar); // DNI
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCBMateria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jRBAlumnos = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jRBMaterias = new javax.swing.JRadioButton();

        setTitle("Alumnos por materia");
        setPreferredSize(new java.awt.Dimension(752, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCBMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMateriaActionPerformed(evt);
            }
        });
        getContentPane().add(jCBMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 280, 30));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable.getTableHeader().setResizingAllowed(false);
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 590, 290));

        jRBAlumnos.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jRBAlumnos.setText("Incluir inactivos");
        jRBAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBAlumnosActionPerformed(evt);
            }
        });
        getContentPane().add(jRBAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 140, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Alumnos por materia");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, 60));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 590, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel4.setText("Seleccione una materia: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 30));

        jBSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-salir-50.png"))); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, -1, -1));

        jRBMaterias.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jRBMaterias.setText("Incluir inactivas");
        jRBMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMateriasActionPerformed(evt);
            }
        });
        getContentPane().add(jRBMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMateriaActionPerformed
        rellenarTabla();
    }//GEN-LAST:event_jCBMateriaActionPerformed

    private void jRBAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBAlumnosActionPerformed
        rellenarTabla();
    }//GEN-LAST:event_jRBAlumnosActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose(); //Salir
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jRBMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMateriasActionPerformed
        armarComboBox(); //Metodo para armar ComboBox
    }//GEN-LAST:event_jRBMateriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Materia> jCBMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRBAlumnos;
    private javax.swing.JRadioButton jRBMaterias;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables

    // Metodo para armar cabecera de tabla
    public void armarCabecera() {
        tabla.addColumn("ID"); //Creo columna
        tabla.addColumn("Apellido"); //Creo columna
        tabla.addColumn("Nombre"); //Creo columna
        tabla.addColumn("DNI"); //Creo columna
        jTable.setModel(tabla); //Seteo el modelo(tabla) a jTable
        setTamañoColumna(0, 0); //Le doy tamaño a las columnas
        setTamañoColumna(1, 100); //Le doy tamaño a las columnas
        setTamañoColumna(2, 100); //Le doy tamaño a las columnas
        setTamañoColumna(3, 100); //Le doy tamaño a las columnas
        centrarEncabezado(jTable); //Centro los encabezados
    }

    // Metodo para borrar filas de la tabla
    private void borrarFilas() {
        int f = jTable.getRowCount() - 1;
        for (; f >= 0; f--) {
            tabla.removeRow(f);
        }
    }

    //Metodo para darle un tamaño a la columna
    private void setTamañoColumna(int columna, int tamaño) {
        TableColumn column = jTable.getColumnModel().getColumn(columna);
        column.setPreferredWidth(tamaño);
    }

    // Método para centrar los encabezados de las columnas
    private void centrarEncabezado(JTable table) {
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
    }

    //Metodo para rellenar ComboBox
    private void armarComboBox() {
        ArrayList<Materia> listaMaterias = new ArrayList<Materia>(matData.listarMaterias()); //Creo ArrayList y lo lleno con el metodo listarMaterias() de la clase MateriaData
        jCBMateria.removeAllItems(); //Remuevo todos los items del ComboBox
        for (Materia materia : listaMaterias) { //For-e
            if (materia.isActivo() && jRBMaterias.isSelected() == false) { //Si la materia esta habilitada y el RadioButton desactivado..
                jCBMateria.addItem(materia); //Agregar nombre de materia al ComboBox
            } else if (jRBMaterias.isSelected() == true) { //Si esta activado el RadioButton...
                jCBMateria.addItem(materia); //Agregar nombre de materia al ComboBox
            }
        }
    }

    //Metodo para rellenar la tabla
    public void rellenarTabla() {
        Materia materia = (Materia)jCBMateria.getSelectedItem();
        if(materia != null){
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>(insData.obtenerAlumnosXMateria(materia.getIdMateria())); //Hago un ArrayList con los alumnos
        borrarFilas(); //Borro filas
       for (Alumno alumno1 : alumnos) {
            if (alumno1.isActivo() == true && jRBAlumnos.isSelected() == false) { //Si el alumno esta activo y el RadioButton esta desactivado..
                tabla.addRow(new Object[]{alumno1.getIdAlumno(), alumno1.getApellido(), alumno1.getNombre(), alumno1.getDni()});
            } else if (jRBAlumnos.isSelected() == true) { // Si el RadioButton esta activoado, muestra todo
                tabla.addRow(new Object[]{alumno1.getIdAlumno(), alumno1.getApellido(), alumno1.getNombre(), alumno1.getDni()});
            }
        }
        }
    }
}
