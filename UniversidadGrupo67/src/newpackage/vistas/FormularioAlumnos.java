
package newpackage.vistas;

import AccesoADatos.AlumnoData;
import java.sql.Date;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import newpackage.entidades.Alumno;


public class FormularioAlumnos extends javax.swing.JInternalFrame {

    private boolean alumnoEncontrado = false;
    private int codigoAlumno = 0;

    public FormularioAlumnos() {
        initComponents();
        IniciarControles();// LLAMO AL METODO PARA INICIAR LOS CONTROLES
        JDateFechaNacimiento.setDateFormatString("dd/MM/yyyy"); //ASIGNO EL FORMATO DE LA FECHA
        JDateFechaNacimiento.getDateEditor().setEnabled(false);

    }

    //INICIALIZO LOS CONTROLES
    private void IniciarControles() {
        //LIMPIO LOS TEXTBOX
        jTextDni.setText("");
        jTextNombre.setText("");
        jTextApellido.setText("");
        jRBEstado.setSelected(true);
        jRBEstado.setEnabled(false);
        jTextDni.setEnabled(true);
        //INICIO LOS BOTONES
        jBtnEliminar.setEnabled(false);
        jBtnGuardar.setEnabled(true);
        jBtnGuardar.setVisible(true);
        jBtnModificar.setEnabled(false);
        jBtnModificar.setVisible(false);
        alumnoEncontrado = false;
        JDateFechaNacimiento.getDateEditor().setDate(null);
        codigoAlumno = 0;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextNombre = new javax.swing.JTextField();
        jRBEstado = new javax.swing.JRadioButton();
        jBtnNuevo = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextDni = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jBtnBuscar = new javax.swing.JButton();
        jBtnModificar = new javax.swing.JButton();
        JDateFechaNacimiento = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setForeground(java.awt.Color.white);
        setTitle("Alumno");
        setName(""); // NOI18N

        jBtnNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-más-50.png"))); // NOI18N
        jBtnNuevo.setText("Nuevo");
        jBtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNuevoActionPerformed(evt);
            }
        });

        jBtnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-salir-50.png"))); // NOI18N
        jBtnSalir.setText("Salir");
        jBtnSalir.setMaximumSize(new java.awt.Dimension(69, 23));
        jBtnSalir.setMinimumSize(new java.awt.Dimension(69, 23));
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jBtnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-basura-501.png"))); // NOI18N
        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        jBtnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-guardar-50.png"))); // NOI18N
        jBtnGuardar.setText("Guardar");
        jBtnGuardar.setMaximumSize(new java.awt.Dimension(69, 23));
        jBtnGuardar.setMinimumSize(new java.awt.Dimension(69, 23));
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Alumno");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setText("Documento :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Apellido :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel4.setText("Nombre :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel5.setText("Estado :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento :");

        jTextDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDniKeyTyped(evt);
            }
        });

        jBtnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-búsqueda-26.png"))); // NOI18N
        jBtnBuscar.setText("Buscar");
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        jBtnModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-editar-50.png"))); // NOI18N
        jBtnModificar.setText("Modificar");
        jBtnModificar.setEnabled(false);
        jBtnModificar.setMaximumSize(new java.awt.Dimension(69, 23));
        jBtnModificar.setMinimumSize(new java.awt.Dimension(69, 23));
        jBtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JDateFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextDni, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jBtnBuscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRBEstado)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jBtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jBtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnBuscar))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5))
                    .addComponent(jRBEstado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(JDateFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnNuevo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnEliminar)
                        .addComponent(jBtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //PRESIONO EL BOTON SALIR
    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed

        this.dispose(); //ME CIERRO

    }//GEN-LAST:event_jBtnSalirActionPerformed

    //PRESIONO EL BOTON NUEVO Y LIMPIO TODOS LOS DATOS
    private void jBtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNuevoActionPerformed

        //INICIO LOS BOTONES Y TEXTBOX
        IniciarControles();

    }//GEN-LAST:event_jBtnNuevoActionPerformed

    //PRESIONA EL BOTON BUSCAR
    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed

        AlumnoData alumnoData = new AlumnoData(); // INSTANCIO ALUMNO DATA PARA ACCEDER A LA BASE DE DATOS
        Alumno alumno = new Alumno();  //CREO UN ALUMNO

        if (jTextDni.getText().isEmpty()) { //VERIFICO QUE DNI SEA DISTINTO DE VACIO
            JOptionPane.showMessageDialog(this, "Error Ingresar el DNI","Información",1);
        } else {
            try {
                alumno = alumnoData.buscarAlumnoPorDni(Integer.parseInt(jTextDni.getText().trim())); //BUSCO EL DNI
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error al cargar alumno " + e.getMessage(),"Información",1);
            }
            if (alumno != null) { //SI ALUMNO ES DISTINTO DE NULL LO ENCONTRO

                if (alumno.isActivo()) {

                    // MUESTRO LOS DATOS
                    jTextNombre.setText(alumno.getNombre());
                    jTextApellido.setText(alumno.getApellido());
                    jRBEstado.setSelected(alumno.isActivo());
                    JDateFechaNacimiento.setDate(Date.valueOf(alumno.getFechaNac()));
                    jTextDni.setEnabled(false);
                    //DESACTIVO EL BOTON ACTIVO LA UNICA FORMA DE BORRA ES POR EL BOTON
                    //jRBEstado.setEnabled(false);

                    //ACTIVO LOS BOTONES
                    jBtnEliminar.setEnabled(true);
                    jBtnModificar.setVisible(true);
                    jBtnModificar.setEnabled(true);
                    jBtnGuardar.setVisible(false);

                    alumnoEncontrado = true; // ACTIVO MI CLAVE PARA SABER QUE EL ALUMNO YA FUE ENCONTRADO
                    codigoAlumno = alumno.getIdAlumno();
                } else {

                    int respuesta = JOptionPane.showConfirmDialog(this, "Este alumno ya fue eliminado desea recuperarlo", "Confirmacion", JOptionPane.YES_NO_OPTION);
                    if (respuesta == 0) {
                        //ACTIVO EL ALUMNO
                        alumnoData.activoAlumno(alumno.getIdAlumno());
                        IniciarControles();
                       // this.dispose();
                    } else {
                        //ACTIVO LOS BOTONES
                        IniciarControles();
                    //    this.dispose();
                    }
                }
            } else {

                JOptionPane.showMessageDialog(this, "Su DNI no corresponde a ningun alumno registrado","Información",1);
                //ACTIVO LOS BOTONES
                IniciarControles();

            }
        }


    }//GEN-LAST:event_jBtnBuscarActionPerformed

    //SOLO DEJO INGRESAR NUMEROS
    private void jTextDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDniKeyTyped
        int key = evt.getKeyChar(); // guardo el codigo ASCII que genero el evento
        boolean numero = key >= 48 && key <= 57; //verifco si es un numero
        if (!numero) {
            evt.consume();  // NO LO ESCRIBE
        }
    }//GEN-LAST:event_jTextDniKeyTyped

    //PRESIONO EL BOTON GUARDAR
    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed

        Alumno alumno = new Alumno();
        AlumnoData alumnoData = new AlumnoData();
        String fecha = ((JTextField) JDateFechaNacimiento.getDateEditor().getUiComponent()).getText();   //GUARDO LA FECHA EN FORMATO STRING

        //PRIMERO VERIFICO QUE TODO LOS DATOS SEAN INGRESADOS      
        if (jTextDni.getText().isEmpty() || jTextApellido.getText().isEmpty() || jTextNombre.getText().isEmpty()
                || !jRBEstado.isSelected() || fecha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todo los datos deben completarse","Información",1);
        } else {
            //CARGO EL ALUMNO
            try {
                alumno.setDni(Integer.parseInt(jTextDni.getText()));
                alumno.setApellido(jTextApellido.getText());
                alumno.setNombre(jTextNombre.getText());
                alumno.setFechaNac(JDateFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                alumno.setActivo(jRBEstado.isSelected());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error de tipo de datos " + e.getMessage(),"Información",1);
            }

            //SI INGRESO TODO LOS DATOS VERIFICO SI EL ALUMNO YA EXISTE
            if (!alumnoData.dniExiste(alumno.getDni())) {
                alumnoData.guardarAlumno(alumno);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "El Alumno ya se encuentra en la Base de Datos","Información",1);
            }
        }
    }//GEN-LAST:event_jBtnGuardarActionPerformed

    //PRESIONO EL BOTON ELIMINAR ALUMNO
    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed

        AlumnoData alumnoData = new AlumnoData();
        Alumno alumno = new Alumno();
        //PRIMERO VERIFIQUE QUE TENGO UN DNI Y SEA CORRECTO
        if ((alumnoEncontrado) && (!jTextDni.getText().isEmpty())) {
            alumno = alumnoData.buscarAlumnoPorDni(Integer.parseInt(jTextDni.getText()));
            int respuesta = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar el alumno: " + alumno.getApellido() + " " + alumno.getNombre(), "Confirmacion", JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
                //ELIMINO EL ALUMNO
                alumnoData.eliminarAlumno(alumno.getIdAlumno());
                IniciarControles();
                //this.dispose();
            } else {
                //   this.dispose();
                //IniciarControles();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error al Borrar");
            this.dispose();
        }
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    //MODIFICO EL ALUMNO
    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed

        Alumno alumno = new Alumno();
        AlumnoData alumnoData = new AlumnoData();
        String fecha = ((JTextField) JDateFechaNacimiento.getDateEditor().getUiComponent()).getText();   //GUARDO LA FECHA EN FORMATO STRING

        //PRIMERO VERIFICO QUE TODO LOS DATOS SEAN INGRESADOS      
        if (jTextDni.getText().isEmpty() || jTextApellido.getText().isEmpty() || jTextNombre.getText().isEmpty()
                || !jRBEstado.isSelected() || fecha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todo los datos deben completarse","Información",1);
        } else {
            //CARGO EL ALUMNO
            try {
                alumno.setIdAlumno(codigoAlumno);
                alumno.setDni(Integer.parseInt(jTextDni.getText()));
                alumno.setApellido(jTextApellido.getText());
                alumno.setNombre(jTextNombre.getText());
                alumno.setFechaNac(JDateFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                alumno.setActivo(jRBEstado.isSelected());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error de tipo de datos " + e.getMessage(),"Información",1);
            }

            int respuesta = JOptionPane.showConfirmDialog(this, "Esta Seguro de modificar el alumno " + alumno.getApellido() + " " + alumno.getNombre(), "Confirmacion", JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
                //MODIFICO EL ALUMNO
                alumnoData.modificarAlumno(alumno);
               // this.dispose();
               IniciarControles();
            } else {
                // this.dispose();
               // IniciarControles();
            }
        }

    }//GEN-LAST:event_jBtnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDateFechaNacimiento;
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JButton jBtnNuevo;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextDni;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables
}
