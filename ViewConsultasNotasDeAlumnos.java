/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.AlumnoData;
import controlador.InscripcionData;
import controlador.MateriaData;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Alumno;
import modelo.Conexion;
import modelo.Inscripcion;
import modelo.Materia;

/**
 *
 * @author Caro_Z
 */
public class ViewConsultasNotasDeAlumnos extends javax.swing.JInternalFrame {

    private ArrayList<Alumno> listAlumnos;
    private AlumnoData ad;
    private ArrayList<Inscripcion> listaInscripcion;
   
    private InscripcionData id;
    private ArrayList<Materia> listaMaterias;
    private MateriaData md;
    private Conexion conexion;
    private DefaultTableModel modelo1;

    public ViewConsultasNotasDeAlumnos() {
        initComponents();
         this.setSize(700, 550);

        conexion =new Conexion();
        ad= new AlumnoData(conexion);
        listAlumnos= (ArrayList<Alumno>) ad.listarAlumnosActivos();
        
        id = new InscripcionData(conexion);                  
       listaInscripcion = (ArrayList)id.listarInscripciones();
       
       md = new MateriaData(conexion);
       listaMaterias =(ArrayList)md.listarMateriasActivas();
        
        modelo1= new DefaultTableModel();
        armarCabeceraTabla();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tNotas = new javax.swing.JTable();
        btSalir = new javax.swing.JButton();
        btNuevo = new javax.swing.JButton();
        rbAprobados = new javax.swing.JRadioButton();
        rdDesaprobados = new javax.swing.JRadioButton();
        rbSinNota = new javax.swing.JRadioButton();
        rbTodos = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LISTADO DE NOTAS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 40, 238, 29);

        tNotas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        tNotas.setForeground(new java.awt.Color(0, 0, 153));
        tNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "APELLIDO", "NOMBRE", "ID MATERIA", "MATERIA", "AÑO", "NOTA"
            }
        ));
        jScrollPane1.setViewportView(tNotas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 220, 630, 160);

        btSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSalir.setText("SALIR");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btSalir);
        btSalir.setBounds(440, 420, 76, 34);

        btNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btNuevo.setText("LIMPIAR");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btNuevo);
        btNuevo.setBounds(140, 410, 94, 34);

        rbAprobados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbAprobados.setText("Aprobados");
        rbAprobados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAprobadosActionPerformed(evt);
            }
        });
        getContentPane().add(rbAprobados);
        rbAprobados.setBounds(110, 120, 87, 23);

        rdDesaprobados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rdDesaprobados.setText("Desaprobados");
        rdDesaprobados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdDesaprobadosActionPerformed(evt);
            }
        });
        getContentPane().add(rdDesaprobados);
        rdDesaprobados.setBounds(110, 160, 107, 23);

        rbSinNota.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbSinNota.setText("Sin Nota");
        rbSinNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSinNotaActionPerformed(evt);
            }
        });
        getContentPane().add(rbSinNota);
        rbSinNota.setBounds(400, 120, 71, 23);

        rbTodos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbTodos.setSelected(true);
        rbTodos.setText("Todos");
        rbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTodosActionPerformed(evt);
            }
        });
        getContentPane().add(rbTodos);
        rbTodos.setBounds(400, 160, 59, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_form_institucion.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -30, 850, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        // TODO add your handling code here:
        borraFilasTabla();
        rbTodos.setSelected(true);
        rbSinNota.setSelected(false);
        rdDesaprobados.setSelected(false);
        rbAprobados.setSelected(false);


    }//GEN-LAST:event_btNuevoActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void rbAprobadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAprobadosActionPerformed
        // TODO add your handling code here:
        borraFilasTabla();

        rbSinNota.setSelected(false);
        rbTodos.setSelected(false);
        rdDesaprobados.setSelected(false);
        
        cargaDatosAprobados();
    }//GEN-LAST:event_rbAprobadosActionPerformed

    private void rdDesaprobadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdDesaprobadosActionPerformed
        // TODO add your handling code here:
        borraFilasTabla();
        
       
        rbSinNota.setSelected(false);
        rbAprobados.setSelected(false);
        rbTodos.setSelected(false);
        
         cargaDatosDesAprobados();
    }//GEN-LAST:event_rdDesaprobadosActionPerformed

    private void rbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTodosActionPerformed
        // TODO add your handling code here:
        borraFilasTabla();
       
        rdDesaprobados.setSelected(false);
        rbAprobados.setSelected(false);
        rbSinNota.setSelected(false);
        
         cargaTodosLosInscriptos();
    }//GEN-LAST:event_rbTodosActionPerformed

    private void rbSinNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSinNotaActionPerformed
        // TODO add your handling code here:
         borraFilasTabla();
       
        rbTodos.setSelected(false);
        rdDesaprobados.setSelected(false);
        rbAprobados.setSelected(false);
        
         listarInscripcionesSinNota();
    }//GEN-LAST:event_rbSinNotaActionPerformed

    private void armarCabeceraTabla() {
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("ID ALUMNO");
        columnas.add("APELLIDO");
        columnas.add("NOMBRE");
        columnas.add("ID MATERIA");
        columnas.add("MATERIA");
        columnas.add("AÑO");
        columnas.add("NOTA");
        for (Object it : columnas) {

            modelo1.addColumn(it);
        }
        tNotas.setModel(modelo1);
    }

    private void borraFilasTabla() {

        int a = modelo1.getRowCount() - 1;

        for (int i = a; i >= 0; i--) {

            modelo1.removeRow(i);
        }
    }

    private void cargaDatosAprobados() {
        borraFilasTabla();

        ArrayList<Inscripcion> lista = (ArrayList) id.alumnosAprobados();

        for (Inscripcion i : lista) {

            modelo1.addRow(new Object[]{i.getAlumno().getId_alumno(), i.getAlumno().getApellido(), i.getAlumno().getNombre(), i.getMateria().getId_materia(), i.getMateria().getNombre(), i.getMateria().getAnio(), i.getNota()});
        }
    }

    private void cargaDatosDesAprobados() {
        borraFilasTabla();

        ArrayList<Inscripcion> lista = (ArrayList) id.alumnosDesaprobados();

        for (Inscripcion i : lista) {

            modelo1.addRow(new Object[]{i.getAlumno().getId_alumno(), i.getAlumno().getApellido(), i.getAlumno().getNombre(), i.getMateria().getId_materia(), i.getMateria().getNombre(), i.getMateria().getAnio(), i.getNota()});
        }
    }

    private void cargaTodosLosInscriptos() {
        borraFilasTabla();

        ArrayList<Inscripcion> lista = (ArrayList) id.listarInscripciones();

        for (Inscripcion i : lista) {

            modelo1.addRow(new Object[]{i.getAlumno().getId_alumno(), i.getAlumno().getApellido(), i.getAlumno().getNombre(), i.getMateria().getId_materia(), i.getMateria().getNombre(), i.getMateria().getAnio(), i.getNota()});
        }
    }

    private void listarInscripcionesSinNota() {
        borraFilasTabla();

        ArrayList<Inscripcion> lista = (ArrayList) id.listarInscripcionesSinNota();

        for (Inscripcion i : lista) {

            modelo1.addRow(new Object[]{i.getAlumno().getId_alumno(), i.getAlumno().getApellido(), i.getAlumno().getNombre(), i.getMateria().getId_materia(), i.getMateria().getNombre(), i.getMateria().getAnio(), i.getNota()});
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbAprobados;
    private javax.swing.JRadioButton rbSinNota;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JRadioButton rdDesaprobados;
    private javax.swing.JTable tNotas;
    // End of variables declaration//GEN-END:variables
}
