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
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Alumno;
import modelo.Conexion;
import modelo.Inscripcion;
import modelo.Materia;

/**
 *
 * @author Caro_Z
 */
public class ViewListadoDeMateriasPorAlumno extends javax.swing.JInternalFrame {

    private ArrayList<Alumno> listaAlumnos;
    private AlumnoData alumnoData;
    private ArrayList<Inscripcion> listaInscripcion;
    private InscripcionData inscripcionData;
    private List<Materia> listaMaterias;
    private MateriaData materiaData;
    private Conexion conexion;
    private DefaultTableModel modelo;

    public ViewListadoDeMateriasPorAlumno() {
        initComponents();
         this.setSize(660, 550);

        conexion = new Conexion();
        alumnoData = new AlumnoData(conexion);
        listaAlumnos = (ArrayList<Alumno>) alumnoData.listarAlumnosActivos();

        cargaAlumnos();
        modelo = new DefaultTableModel();
        armaCabeceraTabla();

        inscripcionData = new InscripcionData(conexion);
        listaInscripcion = (ArrayList) inscripcionData.listarInscripciones();

        materiaData = new MateriaData(conexion);
        listaMaterias = (ArrayList) materiaData.listarMateriasActivas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btBuscar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tMaterias = new javax.swing.JTable();
        cbAlumno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        btBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btBuscar.setText("BUSCAR");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btBuscar);
        btBuscar.setBounds(418, 137, 91, 35);

        btSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSalir.setText("SALIR");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btSalir);
        btSalir.setBounds(419, 382, 90, 33);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTADO DE MATERIAS POR ALUMNO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(57, 42, 523, 27);

        tMaterias.setBackground(new java.awt.Color(204, 204, 255));
        tMaterias.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        tMaterias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "MATERIA", "AÑO"
            }
        ));
        jScrollPane1.setViewportView(tMaterias);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(57, 255, 476, 95);

        cbAlumno.setBackground(new java.awt.Color(255, 204, 102));
        cbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(cbAlumno);
        cbAlumno.setBounds(184, 144, 205, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ALUMNO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(67, 140, 87, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LISTADO DE MATERIAS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(194, 205, 176, 17);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_form_institucion.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-26, -30, 630, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAlumnoActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:
        cargaDatosAlumnos();
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_btSalirActionPerformed
    private void cargaAlumnos(){
    //Carga las materias al ComboBox
   
         for(Alumno item:listaAlumnos){
            
            cbAlumno.addItem(item);
           
    }
        
    }
    private void armaCabeceraTabla(){
  
           //Titulos de Columnas
        ArrayList<Object> columnas=new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("Nombre");
        columnas.add("Año");
        for(Object it:columnas){
        
            modelo.addColumn(it);
        }
        tMaterias.setModel(modelo);
  }
    private void borraFilasTabla(){

        int a =modelo.getRowCount()-1;

           for(int i=a;i>=0;i--){
   
                modelo.removeRow(i );
           }
}
    private void cargaDatosAlumnos(){
    
        borraFilasTabla();
           //Llenar filas con las materias en las que esta incripto un alumno
           
        Alumno seleccionado= (Alumno)cbAlumno.getSelectedItem();
        
        ArrayList<Materia> lista = (ArrayList)inscripcionData.listarMateriasPorAlumno(seleccionado.getId_alumno());
        
        for(Materia m :lista){
        
            modelo.addRow(new Object[]{m.getId_materia(),m.getNombre(),m.getAnio()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<Alumno> cbAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tMaterias;
    // End of variables declaration//GEN-END:variables
}