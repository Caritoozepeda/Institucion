/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.AlumnoData;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Alumno;
import modelo.Conexion;

/**
 *
 * @author salva
 */
public class ViewAlumnos extends javax.swing.JInternalFrame {

    private AlumnoData ad;
    private Conexion conexion;
    

    /**
     * Creates new form ViewAlumnos
     */
    public ViewAlumnos() {
        initComponents();
        this.setSize(700, 550);
        limpiar();
        botonesDesactivados();
        conexion = new Conexion();
        ad = new AlumnoData(conexion);
            
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
        jbGuardar1 = new javax.swing.JButton();
        jbGuardar2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        aID = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        aApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        aNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        aDate = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        aEstado = new javax.swing.JCheckBox();
        jbGuardar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbLimpiar1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alumnos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 0, 184, 61);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(248, 40, 384, 10);

        jbGuardar1.setBackground(new java.awt.Color(255, 255, 255));
        jbGuardar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbGuardar1.setText("Buscar alumno");
        jbGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardar1);
        jbGuardar1.setBounds(40, 90, 130, 30);

        jbGuardar2.setBackground(new java.awt.Color(255, 255, 255));
        jbGuardar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbGuardar2.setText("Agregar alumno");
        jbGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardar2);
        jbGuardar2.setBounds(219, 90, 140, 30);

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(154, 140, 24, 23);

        aID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aIDFocusLost(evt);
            }
        });
        aID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aIDKeyTyped(evt);
            }
        });
        getContentPane().add(aID);
        aID.setBounds(219, 142, 70, 24);

        jbBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jbBuscar);
        jbBuscar.setBounds(353, 141, 90, 30);

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(107, 182, 71, 23);

        aApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aApellidoFocusLost(evt);
            }
        });
        aApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(aApellido);
        aApellido.setBounds(219, 184, 230, 24);

        jLabel4.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(108, 238, 70, 23);

        aNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aNombreKeyTyped(evt);
            }
        });
        getContentPane().add(aNombre);
        aNombre.setBounds(219, 240, 230, 24);

        jLabel5.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha Nac:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(91, 295, 87, 23);

        aDate.setBackground(new java.awt.Color(255, 255, 255));
        aDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aDateFocusLost(evt);
            }
        });
        getContentPane().add(aDate);
        aDate.setBounds(219, 298, 118, 29);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(470, 280, 190, 136);

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(125, 347, 53, 23);

        aEstado.setBackground(new java.awt.Color(255, 255, 255));
        aEstado.setEnabled(false);
        aEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(aEstado);
        aEstado.setBounds(196, 347, 24, 24);

        jbGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jbGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jbGuardarFocusLost(evt);
            }
        });
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardar);
        jbGuardar.setBounds(30, 450, 90, 30);

        jbBorrar.setBackground(new java.awt.Color(255, 255, 255));
        jbBorrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbBorrar);
        jbBorrar.setBounds(150, 450, 90, 30);

        jbActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jbActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jbActualizar);
        jbActualizar.setBounds(280, 450, 100, 30);

        jbLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        jbLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jbLimpiar);
        jbLimpiar.setBounds(400, 450, 90, 30);

        jbLimpiar1.setBackground(new java.awt.Color(255, 255, 255));
        jbLimpiar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbLimpiar1.setText("Salir");
        jbLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbLimpiar1);
        jbLimpiar1.setBounds(530, 450, 70, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(40, 414, 173, 2);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_form_institucion.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-30, 0, 730, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        String apellido = aApellido.getText();
        String nombre = aNombre.getText();

        Date fech = aDate.getDate();
        LocalDate fechaNac = fech.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        boolean estado = aEstado.isEnabled();

        Alumno a = new Alumno(apellido, nombre, fechaNac, estado);

        ad.agregarAlumno(a);
        aID.setText(a.getId_alumno() + "");
        limpiar();

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed


        botonesBuscar();
        activarOtros();
        
      Alumno a = ad.buscarAlumno(Integer.parseInt(aID.getText()));

        int id = Integer.parseInt(aID.getText());

        if (aID.getText() != null && ad.alumnoExiste(id)) {
        
  
            aApellido.setText(a.getApellido());
            aNombre.setText(a.getNombre());
            //Hacer Localdate to Date
            LocalDate lc = a.getFechaNac();
            Date date = Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
            aDate.setDate(date);
            aEstado.setSelected(a.isActivo());
            desactivarOtros();
        } else {
            JOptionPane.showMessageDialog(this, "No se encontro el alumno");
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar();
        
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        if (aID.getText() != null) {
            int id = Integer.parseInt(aID.getText());
            String nombre = aNombre.getText();
            String apellido = aApellido.getText();

            Date sfecha = aDate.getDate();
            LocalDate fechaNac = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            boolean activo = aEstado.isSelected();

            Alumno a = new Alumno(apellido, nombre, fechaNac, activo);
            ad.modificarAlumno(id, a);

            JOptionPane.showMessageDialog(null, "alumno modificado con exito");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el alumno");
        }
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        int id = Integer.parseInt(aID.getText());
        if (ad.alumnoExiste(id)) {
            ad.eliminarAlumno(id);
            limpiar();
            desactivarOtros();
            desactivarId();
        } else {
            JOptionPane.showMessageDialog(this, "El alumno no existe");
        }
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiar1ActionPerformed
        dispose();
    }//GEN-LAST:event_jbLimpiar1ActionPerformed

    private void jbGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardar1ActionPerformed
        desactivarOtros();
        activarId();
        jbBuscar.setEnabled(true);

    }//GEN-LAST:event_jbGuardar1ActionPerformed

    private void jbGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardar2ActionPerformed
        desactivarId();
        activarOtros();
        //botonesGuardar();

        sinBotonesBuscar();
        jbBuscar.setEnabled(false);

       aID.setText("");
    }//GEN-LAST:event_jbGuardar2ActionPerformed

    private void aIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aIDFocusLost
        if (aID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede dejar vacio este campo");
            aID.requestFocus();
        }
    }//GEN-LAST:event_aIDFocusLost

    private void aApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aApellidoFocusLost
        if (aApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede dejar vacio este campo");
            aApellido.requestFocus();
        }
    }//GEN-LAST:event_aApellidoFocusLost

    private void jbGuardarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbGuardarFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jbGuardarFocusLost

    private void aApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aApellidoKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            JOptionPane.showMessageDialog(this, "El dato APELLIDO  no debe ser numérico");
            evt.consume();
        }
    }//GEN-LAST:event_aApellidoKeyTyped

    private void aNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aNombreKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            JOptionPane.showMessageDialog(this, "El dato NOMBRE  no debe ser numérico");
            evt.consume();
        }else{
            botonesGuardar();
        }
    }//GEN-LAST:event_aNombreKeyTyped

    private void aIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aIDKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            JOptionPane.showMessageDialog(this, "El dato ID debe ser numérico");
            evt.consume();
        }

    }//GEN-LAST:event_aIDKeyTyped

    private void aDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aDateFocusLost
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String fechaComoCadena = sdf.format(new Date());
        if ((!aID.getText().isEmpty())) {

            jbGuardar.setEnabled(true);

        } else {
            jbGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_aDateFocusLost

    private void aEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aEstadoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_aEstadoActionPerformed

    private void limpiar() {
        aApellido.setText("");
        aID.setText("");
        aNombre.setText("");
        aEstado.setSelected(false);
        aDate.setDate(null);
        desactivarOtros();
        desactivarId();
        botonesDesactivados();

    }

    private void activarId() {
        aID.setEnabled(true);
    }

    private void desactivarId() {
        aID.setEnabled(false);
    }

    private void activarOtros() {
        aNombre.setEnabled(true);
        aApellido.setEnabled(true);
        aDate.setEnabled(true);
        aEstado.setEnabled(true);

    }

    private void desactivarOtros() {
        aNombre.setEnabled(false);
        aApellido.setEnabled(false);
        aDate.setEnabled(false);
        aEstado.setEnabled(false);
    }

    private void botonesDesactivados() {
        jbGuardar.setEnabled(false);
        jbBorrar.setEnabled(false);
        jbActualizar.setEnabled(false);
        jbBuscar.setEnabled(false);
    }

    private void botonesBuscar() {
        jbActualizar.setEnabled(true);
        jbBorrar.setEnabled(true);
    }

    private void sinBotonesBuscar() {
        jbActualizar.setEnabled(false);
        jbBorrar.setEnabled(false);
    }
    private void botonesGuardar(){
        jbGuardar.setEnabled(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aApellido;
    private com.toedter.calendar.JDateChooser aDate;
    private javax.swing.JCheckBox aEstado;
    private javax.swing.JTextField aID;
    private javax.swing.JTextField aNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbGuardar1;
    private javax.swing.JButton jbGuardar2;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbLimpiar1;
    // End of variables declaration//GEN-END:variables
}
