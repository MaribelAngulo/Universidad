/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 *
 * @author Usuario
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/Fondo-Principal.png"));
        Image image = icon.getImage();
        jPanelPrincipal = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar2 = new javax.swing.JMenuBar();
        jmAlumnos = new javax.swing.JMenu();
        jMIFormularioAlumno = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmMateria = new javax.swing.JMenuItem();
        jMIAdministracion = new javax.swing.JMenu();
        jMManipulacionDeNotas = new javax.swing.JMenuItem();
        jMIInscripciones = new javax.swing.JMenuItem();
        jMIConsulta = new javax.swing.JMenu();
        jMIAlumnosXMateria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Universidad Grupo 67");
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(600, 300));

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        jmAlumnos.setText("Alumno");

        jMIFormularioAlumno.setText("Formulario Alumno");
        jMIFormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFormularioAlumnoActionPerformed(evt);
            }
        });
        jmAlumnos.add(jMIFormularioAlumno);

        jMenuBar2.add(jmAlumnos);

        jMenu4.setText("Materia");

        jmMateria.setText("Formulario Materia");
        jmMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMateriaActionPerformed(evt);
            }
        });
        jMenu4.add(jmMateria);

        jMenuBar2.add(jMenu4);

        jMIAdministracion.setText("Administración");

        jMManipulacionDeNotas.setText("Manipulación de Notas");
        jMManipulacionDeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMManipulacionDeNotasActionPerformed(evt);
            }
        });
        jMIAdministracion.add(jMManipulacionDeNotas);

        jMIInscripciones.setText("Inscripciones");
        jMIInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIInscripcionesActionPerformed(evt);
            }
        });
        jMIAdministracion.add(jMIInscripciones);

        jMenuBar2.add(jMIAdministracion);

        jMIConsulta.setText("Consulta");

        jMIAlumnosXMateria.setText("Listado de Alumnos por Materia");
        jMIAlumnosXMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAlumnosXMateriaActionPerformed(evt);
            }
        });
        jMIConsulta.add(jMIAlumnosXMateria);

        jMenuBar2.add(jMIConsulta);

        jMenu5.setText("Salir");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMIFormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFormularioAlumnoActionPerformed
        // TODO add your handling code here:
        FormularioAlumnos ventana = new FormularioAlumnos();
        jPanelPrincipal.removeAll();
        jPanelPrincipal.repaint();
        jPanelPrincipal.add(ventana);
        ventana.setVisible(true);

        int x = (jPanelPrincipal.getWidth() - ventana.getWidth()) / 2;
        int y = (jPanelPrincipal.getHeight() - ventana.getHeight()) / 2;
        ventana.setLocation(x, y);

    }//GEN-LAST:event_jMIFormularioAlumnoActionPerformed

    private void jmMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMateriaActionPerformed
        // TODO add your handling code here:
        FormularioMateria ventana = new FormularioMateria();
        jPanelPrincipal.removeAll();
        jPanelPrincipal.repaint();
        jPanelPrincipal.add(ventana);
        ventana.setVisible(true);

        int x = (jPanelPrincipal.getWidth() - ventana.getWidth()) / 2;
        int y = (jPanelPrincipal.getHeight() - ventana.getHeight()) / 2;
        ventana.setLocation(x, y);
    }//GEN-LAST:event_jmMateriaActionPerformed

    private void jMManipulacionDeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMManipulacionDeNotasActionPerformed
        // TODO add your handling code here:
        CargaDeNotas ventana = new CargaDeNotas();
        jPanelPrincipal.removeAll();
        jPanelPrincipal.repaint();
        jPanelPrincipal.add(ventana);
        ventana.setVisible(true);

        int x = (jPanelPrincipal.getWidth() - ventana.getWidth()) / 2;
        int y = (jPanelPrincipal.getHeight() - ventana.getHeight()) / 2;
        ventana.setLocation(x, y);
    }//GEN-LAST:event_jMManipulacionDeNotasActionPerformed

    private void jMIInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIInscripcionesActionPerformed
        // TODO add your handling code here:
        Inscripciones ventana = new Inscripciones();
        jPanelPrincipal.removeAll();
        jPanelPrincipal.repaint();
        jPanelPrincipal.add(ventana);
        ventana.setVisible(true);

        int x = (jPanelPrincipal.getWidth() - ventana.getWidth()) / 2;
        int y = (jPanelPrincipal.getHeight() - ventana.getHeight()) / 2;
        ventana.setLocation(x, y);
    }//GEN-LAST:event_jMIInscripcionesActionPerformed

    private void jMIAlumnosXMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAlumnosXMateriaActionPerformed
        // TODO add your handling code here:
        ListadoDeAlumnosPorMateria ventana = new ListadoDeAlumnosPorMateria();
        jPanelPrincipal.removeAll();
        jPanelPrincipal.repaint();
        jPanelPrincipal.add(ventana);
        ventana.setVisible(true);

        int x = (jPanelPrincipal.getWidth() - ventana.getWidth()) / 2;
        int y = (jPanelPrincipal.getHeight() - ventana.getHeight()) / 2;
        ventana.setLocation(x, y);
    }//GEN-LAST:event_jMIAlumnosXMateriaActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu5MouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMIAdministracion;
    private javax.swing.JMenuItem jMIAlumnosXMateria;
    private javax.swing.JMenu jMIConsulta;
    private javax.swing.JMenuItem jMIFormularioAlumno;
    private javax.swing.JMenuItem jMIInscripciones;
    private javax.swing.JMenuItem jMManipulacionDeNotas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JDesktopPane jPanelPrincipal;
    private javax.swing.JMenu jmAlumnos;
    private javax.swing.JMenuItem jmMateria;
    // End of variables declaration//GEN-END:variables
}
