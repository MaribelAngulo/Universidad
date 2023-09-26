package newpackage.vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import newpackage.entidades.Alumno;
import newpackage.entidades.Inscripcion;
import newpackage.entidades.Materia;

public class CargaDeNotas extends javax.swing.JInternalFrame {

    // GENERO EL MODELO PARA LA TABLA
    private DefaultTableModel modelo = new DefaultTableModel() {

        //SOBREESCRIBO EL SETVALUE Y DETERMINO QUE DATO INGRESO
        @Override
        public void setValueAt(Object value, int row, int column) {
            // HAGO LA VALIDACION
            if (esValido(value)) {
                super.setValueAt(value, row, column);
                jbtnGuardar.setEnabled(true);
            } else {
                // NO ES UN NUMERO
                if (!value.equals((Object) "Sin Nota")){
                JOptionPane.showMessageDialog(null, "Valor no válido","Error",0);
            }
            }
        }

        //PERMITO QUE SE EDITE SOLO LA COLUMNA DE NOTAS
        public boolean isCellEditable(int f, int c) {
            if (c == 2) {
                return true;
            } else {
                return false;
            }
        }

        //VERIFICO SI EL VALOR ES NUMERICO
        private boolean esValido(Object value) {
            try {
                double number = Double.parseDouble(value.toString());
                return number >= 0;
            } catch (NumberFormatException e) {
                return false;
            }
        }

    };

    public CargaDeNotas() {
        initComponents();
        cargarTabla(); //CARGO EL MODELO PARA LA TABLA
        cargarAlumnos(); // CARGO LOS ALUMNOS EN EL COMBOBOX
        jbtnGuardar.setEnabled(false);
    }

    //ESTE METODO CARGA LOS ALUMNOS
    private void cargarAlumnos() {

        InscripcionData inscData=new InscripcionData();
        List<Materia> listaMaterias = new ArrayList<Materia>();
               AlumnoData alumnoData = new AlumnoData();
        for (Alumno alumno : alumnoData.listarAlumnos()) {
             listaMaterias = inscData.obtenerMateriasCursadas(alumno.getIdAlumno());
            if (!listaMaterias.isEmpty()){
            jcboxAlumnos.addItem(alumno);
            }
        }
    }

    //ESTE METODO CARGA EL MODELO DE LA TABLA
    private void cargarTabla() {

        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");
        jTableAlumnoNota.setModel(modelo);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlumnoNota = new javax.swing.JTable();
        jbtnSalir = new javax.swing.JButton();
        jbtnGuardar = new javax.swing.JButton();
        jcboxAlumnos = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Carga De Notas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Carga De Notas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setText("Seleccione un Alumno:");

        jTableAlumnoNota.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableAlumnoNota);

        jbtnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-salir-50.png"))); // NOI18N
        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jbtnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-guardar-50.png"))); // NOI18N
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jcboxAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxAlumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jbtnGuardar)
                            .addGap(95, 95, 95)
                            .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcboxAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcboxAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnSalir))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //PRESIONO EL BOTON SALIR
    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed

        this.dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    // ESTE METODO RETORNA LA NOTA DE UNA ALUMNO SEGUN LA MATERIA
    //OBSERVACION -1 NO TIENE NOTA
    private double obtenerNota(int idalumno, int idmateria) {
        double nota = -1;
        InscripcionData inscripcionData = new InscripcionData(); // INSTANCION LA INSCRIPCION
        //OBTENGO UN ARRAYLIST DE INSCRIPCIONES DEL ALUMNO X
        ArrayList<Inscripcion> listaInscipcion = (ArrayList<Inscripcion>) inscripcionData.obtenerInscripcionesPorAlumno(idalumno);
        for (Inscripcion inscripcion : listaInscipcion) {
            if (inscripcion.getMateria().getIdMateria() == idmateria) { //RECORRO LAS INSCRIPCIONES DEL ALUMNO HASTA ENCONTRAR LA MATERIA QUE BUSCO
                nota = inscripcion.getNota(); //CARGO LA NOTA
            }
        }
        return nota;
    }

    //ESTE EVENTO CARGA LAS MATERIAS Y NOTAS DEL ALUMNO SELECIONADO EN EL COMBOBOX
    private void jcboxAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxAlumnosActionPerformed

        borrarFilas(); //CADA VEZ QUE CARGO BORRO LA TABLA
        InscripcionData inscripcionData = new InscripcionData();
        Alumno alumnoSeleccionado = new Alumno();
        alumnoSeleccionado = (Alumno) jcboxAlumnos.getSelectedItem(); //GUARDO EL ALUMNO SELECCIONADO
        String datoColumna; //REPRESENTA MI COLUMNA NOTA
        //RECORRO LAS MATERIAS EN LAS QUE SE INSCRIBIO EL ALUMNO
        for (Materia materia : inscripcionData.obtenerMateriasCursadas(alumnoSeleccionado.getIdAlumno())) {

            double Valor = obtenerNota(alumnoSeleccionado.getIdAlumno(), materia.getIdMateria()); //OBTENGO LA NOTA
            if (Valor >= 0) {
                datoColumna = String.valueOf(Valor);
            } else {
                datoColumna = "Sin Nota";
            }

            //CARGO EL MODELO
            modelo.addRow(new Object[]{
                materia.getIdMateria(),
                materia.getNombre(),
                datoColumna
            });
        }
        jbtnGuardar.setEnabled(false);
    }//GEN-LAST:event_jcboxAlumnosActionPerformed

    //PRESIONO EL BOTON GUARDAR
    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed

        boolean estado=false;
        InscripcionData inscripcionData = new InscripcionData();//INSTANCIO INSCRIPCION
        Alumno alumnoSeleccionado = new Alumno(); //CREO UN ALUMNO
        alumnoSeleccionado = (Alumno) jcboxAlumnos.getSelectedItem(); //GUARDO EL ALUMNO SELECCIONADO
        for (int i = 0; i < jTableAlumnoNota.getRowCount() ; i++) { //RECORRO LA TABLA Y ACTUALIZO SUS VALORES
            try {
            int materia= (Integer) jTableAlumnoNota.getValueAt(i, 0);
            double nota= Double.valueOf((String) jTableAlumnoNota.getValueAt(i, 2));
            estado=inscripcionData.actualizarNota(alumnoSeleccionado.getIdAlumno(), materia, nota);                
            } catch (NumberFormatException e) {
                if (!(((String) jTableAlumnoNota.getValueAt(i, 2)).equals("Sin Nota"))){
                JOptionPane.showMessageDialog(this, e.getMessage(),"Información",1);
                }
            }
        jbtnGuardar.setEnabled(false);
        }
        if (!estado) {
            JOptionPane.showMessageDialog(null, "No se pudo completar la tarea", "MENSAJE", 1);
        }else {
            JOptionPane.showMessageDialog(null, "Notas Modificadas", "MENSAJE", 1);
        }

    }//GEN-LAST:event_jbtnGuardarActionPerformed

    //ESTE METODO BORRA TODAS LAS FILAS DE LA TABLA
    private void borrarFilas() {
        int filas = jTableAlumnoNota.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableAlumnoNota;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JComboBox<Alumno> jcboxAlumnos;
    // End of variables declaration//GEN-END:variables
}
