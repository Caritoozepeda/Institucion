
package vistas;

import controlador.AlumnoData;
import controlador.InscripcionData;
import controlador.MateriaData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Alumno;
import modelo.Conexion;
import modelo.Inscripcion;
import modelo.Materia;

public class ViewCargaDeNotas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private ArrayList<Inscripcion> listarInscripcion;
    private ArrayList<Materia> listarMaterias;
    private ArrayList<Alumno> listaAlumnos;
    private InscripcionData inscripcionData;
    private MateriaData materiaData;
    private AlumnoData alumnoData;
    private Conexion conexion;

    public ViewCargaDeNotas() {
        initComponents();
         this.setSize(700, 550);

        conexion = new Conexion();
        modelo = new DefaultTableModel();

        inscripcionData = new InscripcionData(conexion);
        listarInscripcion = (ArrayList) inscripcionData.listarInscripciones();

        materiaData = new MateriaData(conexion);
        listarMaterias = (ArrayList) materiaData.listarMateriasActivas();

        alumnoData = new AlumnoData(conexion);
        listaAlumnos = (ArrayList) alumnoData.listarAlumnosActivos();

        cargarAlumnos();
        armarCabeceraTabla();
        borrarFilasT();
        cargarTabla();
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("Materia");
        columnas.add("Año");
        columnas.add("Nota");

        for (Object it : columnas) {
            modelo.addColumn(it);
        }
        jtCargaDeNotas.setModel(modelo);
    }

    private void cargarAlumnos() {
        for (Alumno item : listaAlumnos) {
            jComboBoxAlumno.addItem(item);
        }
    }

    public void borrarFilasT() {
        int fila = modelo.getRowCount() - 1;
        for (int i = fila; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargarTabla() {
        borrarFilasT();

        Alumno a = (Alumno) jComboBoxAlumno.getSelectedItem();
        int id = a.getId_alumno();
        List<Inscripcion> listIns = inscripcionData.buscarInscripcionesPorAlumno(id);
        for (Inscripcion ins : listIns) {
            modelo.addRow(new Object[]{ins.getMateria().getId_materia(), ins.getMateria().getNombre(), ins.getMateria().getAnio(), ins.getNota()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCargaDeNotas = new javax.swing.JTable();
        jComboBoxAlumno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        txtNota = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().setLayout(null);

        jbCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbCancelar.setText("CANCELAR");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar);
        jbCancelar.setBounds(250, 460, 89, 28);

        jtCargaDeNotas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jtCargaDeNotas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtCargaDeNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "MATERIA", "AÑO", "NOTA"
            }
        ));
        jtCargaDeNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCargaDeNotasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCargaDeNotas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 260, 537, 150);

        jComboBoxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxAlumno);
        jComboBoxAlumno.setBounds(180, 140, 177, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ALUMNO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 140, 97, 22);

        jbGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardar);
        jbGuardar.setBounds(70, 460, 89, 23);

        txtNota.setEnabled(false);
        txtNota.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNotaFocusLost(evt);
            }
        });
        txtNota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNotaKeyTyped(evt);
            }
        });
        getContentPane().add(txtNota);
        txtNota.setBounds(190, 200, 109, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOTA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 200, 62, 22);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CARGA DE NOTAS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 20, 213, 29);

        btSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSalir.setText("SALIR");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btSalir);
        btSalir.setBounds(430, 460, 89, 28);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_form_institucion.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-40, -20, 760, 660);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(50, 80, 254, 20);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(27, 421, 301, 10);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAlumnoActionPerformed
       
        borrarFilasT();
        cargarTabla();


    }//GEN-LAST:event_jComboBoxAlumnoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

         int filaSeleccionada = jtCargaDeNotas.getSelectedRow();
        if (!txtNota.getText().isEmpty()&& filaSeleccionada != -1) {

           
            Alumno a = (Alumno) jComboBoxAlumno.getSelectedItem();

            double nota_n = Double.parseDouble(txtNota.getText());
            int id_materia = (Integer) jtCargaDeNotas.getValueAt(filaSeleccionada, 0);
            String nombre = (String) jtCargaDeNotas.getValueAt(filaSeleccionada, 1);
            int anio = (Integer) jtCargaDeNotas.getValueAt(filaSeleccionada, 2);

            InscripcionData ins = new InscripcionData(conexion);

            ins.registrarNota(nota_n, a.getId_alumno(), id_materia);
            txtNota.setText("");
            cargarTabla();
            txtNota.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila ");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
      

        txtNota.setText("");
          borrarFilasT();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtCargaDeNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCargaDeNotasMouseClicked
      
        int filaSeleccionada = jtCargaDeNotas.getSelectedRow();
        try {
            if (filaSeleccionada != -1) {

                txtNota.setEnabled(true);

                Alumno a = (Alumno) jComboBoxAlumno.getSelectedItem();

                int id_materia = (Integer) jtCargaDeNotas.getValueAt(filaSeleccionada, 0);
                String nombre = (String) jtCargaDeNotas.getValueAt(filaSeleccionada, 1);
                int anio = (Integer) jtCargaDeNotas.getValueAt(filaSeleccionada, 2);
                double nota = (Double) jtCargaDeNotas.getValueAt(filaSeleccionada, 3);

                txtNota.setText(nota + "");

            } else {
                JOptionPane.showMessageDialog(this, " Debe seleccionar una fila");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " Volver a seleccionar una fila");
        }
    }//GEN-LAST:event_jtCargaDeNotasMouseClicked

    private void txtNotaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNotaFocusLost
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtNotaFocusLost

    private void txtNotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNotaKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            JOptionPane.showMessageDialog(this,"La nota debe ser numérica");
            evt.consume();
        }    
        
        
    }//GEN-LAST:event_txtNotaKeyTyped

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
       dispose();
        
    }//GEN-LAST:event_btSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<Alumno> jComboBoxAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JTable jtCargaDeNotas;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
