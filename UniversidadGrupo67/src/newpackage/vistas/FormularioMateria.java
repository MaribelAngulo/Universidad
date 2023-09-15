/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.vistas;

import AccesoADatos.Conexion;
import AccesoADatos.MateriaData;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import newpackage.entidades.Materia;

/**
 *
 * @author Natasha
 */
public class FormularioMateria extends javax.swing.JFrame {

    private Connection con = null;
    private boolean mdfActivado = false;
    private boolean gdActivado = false;
    private MateriaData materiaData = new MateriaData();
    private Materia materia = new Materia();

    /**
     * Creates new form FormularioMateria
     */
    public FormularioMateria() {
        initComponents();
        jTfNombre.setEditable(false);
        jTfNombre.setBackground(Color.gray);
        jTfAnio.setEditable(false);
        jTfAnio.setBackground(Color.gray);
        jRbEstado.setEnabled(false);
        jBEliminar.setEnabled(false);
        jBGuardar.setEnabled(false);
        jBModificar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jBNuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTfCodigo = new javax.swing.JTextField();
        jTfNombre = new javax.swing.JTextField();
        jTfAnio = new javax.swing.JTextField();
        jRbEstado = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jBModificar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-más-50.png"))); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo:");

        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-salir-50.png"))); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-basura-501.png"))); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-guardar-50.png"))); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jLabel5.setText("Estado :");

        jLabel6.setText("Año:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Materia");

        jBModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-editar-50.png"))); // NOI18N
        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-búsqueda-26.png"))); // NOI18N
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBBuscar))
                                    .addComponent(jTfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(jTfAnio)
                                    .addComponent(jRbEstado)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jBNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(jBEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jBGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBModificar)))
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jBBuscar))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jRbEstado))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBEliminar)
                    .addComponent(jBGuardar)
                    .addComponent(jBModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed

        //If para activar tocando Button Modificar y al volver a tocarlo lo desactiva
        if (mdfActivado == false) {
            jTfNombre.setEditable(true); //Activa TextField Nombre
            jTfNombre.setBackground(Color.white); //Cambia de color a blanco
            jTfAnio.setEditable(true); //Activa TextField Año
            jTfAnio.setBackground(Color.white); //Cambia de color a blanco
            jRbEstado.setEnabled(true); //Activa RadioButton Estado
            jTfCodigo.setEditable(false); //Desactiva TextField Codigo
            jTfCodigo.setBackground(Color.gray); //Cambia de color a gris
            mdfActivado = true; //Pasa a true el mdfActivado
            jBEliminar.setEnabled(false); //Desactiva Button Eliminar
            jBGuardar.setEnabled(true); //Activa el Button Guardar
        } else {
            jTfNombre.setEditable(false); //Activa TextField Nombre
            jTfNombre.setBackground(Color.gray); //Cambia de color a blanco
            jTfAnio.setEditable(false); //Activa TextField Año
            jTfAnio.setBackground(Color.gray); //Cambia de color a blanco
            jRbEstado.setEnabled(false); //Activa RadioButton Estado
            jTfCodigo.setEditable(true); //Activa TextField Codigo
            jTfCodigo.setBackground(Color.white); //Cambia de color a blanco
            mdfActivado = false; //Pasa a false el mdfActivado
            jBEliminar.setEnabled(true); //Activa Button Eliminar
            jBGuardar.setEnabled(false); //Desactiva el Button Guardar
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        jTfNombre.setEditable(false);
        jTfNombre.setBackground(Color.gray);
        jTfAnio.setEditable(false);
        jTfAnio.setBackground(Color.gray);
        jRbEstado.setEnabled(false);
        jBEliminar.setEnabled(false);
        jBGuardar.setEnabled(false);
        jBModificar.setEnabled(false);
        jTfCodigo.setEditable(true);
        jTfCodigo.setBackground(Color.white);

        int codigo = 0;

        try { //Bloque TRY-CATCH para verificar si el codigo es valido.
            codigo = Integer.parseInt(jTfCodigo.getText());
            materia = materiaData.buscarMateria(Integer.parseInt(jTfCodigo.getText()));
            if (materia != null) {
                jTfNombre.setText(materia.getNombre());
                jTfAnio.setText(String.valueOf(materia.getAnioMateria()));
                jRbEstado.setSelected(materia.isActivo());
                if (!jTfNombre.getText().equals("")) {
                    jBModificar.setEnabled(true); //Actviar boton de modificar
                    jBEliminar.setEnabled(true); //Activar boton de eliminar
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
            return;
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        try { //Bloque TRY-CATCH para verificar si el codigo es valido.
            materia.setIdMateria(Integer.parseInt(jTfCodigo.getText()));
            materia.setNombre(jTfNombre.getText());
            materia.setAnioMateria(Integer.parseInt(jTfAnio.getText()));
            materia.setActivo(jRbEstado.isSelected());
            materiaData.eliminarMateria(materia);
            jBBuscar.doClick();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
            return;
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        int codigo = 0;

        if (mdfActivado) {
            try { //Bloque TRY-CATCH para verificar si el codigo es valido.
                codigo = Integer.parseInt(jTfCodigo.getText());
                if (jTfNombre.getText().equals("")) { //Verifica que no sea una cadena vacia
                    JOptionPane.showMessageDialog(null, "Ingrese un nombre valido"); //Dialogo de nombre invalido
                    return;
                }
                materia.setNombre(jTfNombre.getText());
                materia.setAnioMateria(Integer.parseInt(jTfAnio.getText()));
                materia.setActivo(jRbEstado.isSelected());
                materia.setIdMateria(codigo);
                materiaData.modificarMateria(materia);
                jBModificar.doClick(); //Simulacion de click en el boton modificar para desactivar botones y textfield
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
                return;
            }
        } else {
            if (jTfNombre.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese un nombre valido"); //Dialogo de nombre invalido
                return;
            }
            try{
            materia.setNombre(jTfNombre.getText());
            materia.setAnioMateria(Integer.parseInt(jTfAnio.getText()));
            materia.setActivo(jRbEstado.isSelected());
            materia.setIdMateria(-1);
            materiaData.agregarMateria(materia);
            jBNuevo.doClick();
            }catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
                return;
            }
        }

    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed

        if (gdActivado == false) {
            jTfNombre.setEditable(true); //Activar TextField Nombre
            jTfNombre.setBackground(Color.white); //Cambiar de color a white
            jTfNombre.setText(""); //Vaciar TextField
            jTfAnio.setEditable(true); //Activar TextField 
            jTfAnio.setBackground(Color.white); //Cambiar de color a white
            jTfAnio.setText(""); //Vaciar TextField
            jRbEstado.setEnabled(false); //Desactivar RadioButton Estado
            jRbEstado.setSelected(true); //Seleccionar RadioButton Estado
            jTfCodigo.setEditable(false); //Desactivar TextField Codigo
            jTfCodigo.setBackground(Color.gray); //Cambiar de color a gray
            jTfCodigo.setText(""); //Vaciar TextField
            jBModificar.setEnabled(false); //Desactivar boton Modificar
            jBEliminar.setEnabled(false); //Desactivar boton Eliminar
            jBGuardar.setEnabled(true); //Activar boton Guardar
            gdActivado = true;
        } else {
            jTfNombre.setEditable(false);
            jTfNombre.setBackground(Color.gray);
            jTfAnio.setEditable(false);
            jTfAnio.setBackground(Color.gray);
            jRbEstado.setEnabled(false);
            jBEliminar.setEnabled(false);
            jBGuardar.setEnabled(false);
            jBModificar.setEnabled(false);
            jTfCodigo.setEditable(true); //Desactivar TextField Codigo
            jTfCodigo.setBackground(Color.white); //Cambiar de color a white
            jTfCodigo.setText(""); //Vaciar TextField
            jTfAnio.setText(""); //Vaciar TextField
            jTfNombre.setText(""); //Vaciar TextField
            jRbEstado.setSelected(false); //Deseleccionar RadioButton Estado
            gdActivado = false;
        }
    }//GEN-LAST:event_jBNuevoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioMateria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRbEstado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTfAnio;
    private javax.swing.JTextField jTfCodigo;
    private javax.swing.JTextField jTfNombre;
    // End of variables declaration//GEN-END:variables
}
