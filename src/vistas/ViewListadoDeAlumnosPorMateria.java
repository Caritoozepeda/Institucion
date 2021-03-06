/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.AlumnoData;
import controlador.InscripcionData;
import controlador.MateriaData;
import java.text.DateFormat;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import modelo.Alumno;
import modelo.Conexion;
import modelo.Inscripcion;
import modelo.Materia;



public class ViewListadoDeAlumnosPorMateria extends javax.swing.JInternalFrame {

    private ArrayList<Alumno> listAlumnos;
    private AlumnoData ad;
    private ArrayList<Inscripcion> listaInscripcion;
    private InscripcionData id;
    private ArrayList<Materia> listaMaterias;
    private MateriaData md;
    private Conexion conexion;
    private DefaultTableModel modelo1;
    
    
    public ViewListadoDeAlumnosPorMateria() {
        initComponents();
          this.setSize(700, 550);
        
        conexion =new Conexion();
        
         md = new MateriaData(conexion);
       listaMaterias =(ArrayList<Materia>)md.listarMateriasActivas();
        
          cargarMaterias();
        
        ad= new AlumnoData(conexion);
        listAlumnos= (ArrayList<Alumno>) ad.listarAlumnosActivos();
        
      
        modelo1= new DefaultTableModel();
        armarCabeceraTabla();
        
       id = new InscripcionData(conexion);                  
       listaInscripcion = (ArrayList<Inscripcion>)id.listarInscripciones();
       
      
        
        
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbMateria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlumnos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTADO DE ALUMNOS POR MATERIA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 30, 480, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MATERIA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(55, 126, 120, 22);

        getContentPane().add(cbMateria);
        cbMateria.setBounds(190, 130, 188, 20);

        tAlumnos.setBackground(new java.awt.Color(204, 204, 255));
        tAlumnos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        tAlumnos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "APELLIDO", "NOMBRE", "FECHA DE NAC"
            }
        ));
        jScrollPane1.setViewportView(tAlumnos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 260, 530, 140);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LISTADO DE ALUMNOS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 210, 245, 17);

        btBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btBuscar.setText("BUSCAR");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btBuscar);
        btBuscar.setBounds(457, 120, 89, 32);

        btSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSalir.setText("SALIR");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btSalir);
        btSalir.setBounds(470, 420, 88, 38);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_form_institucion.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-7, 0, 740, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:
        cargaDatosMaterias();
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed
    private void cargarMaterias(){
    //Carga las materias al ComboBox
  
   
         for(Materia item:listaMaterias){
            
            cbMateria.addItem(item);
          
    }
        
    }
     private void armarCabeceraTabla(){
  
           //Titulos de Columnas
        ArrayList<Object> columnas=new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("Apellido");
        columnas.add("Nombre");
        columnas.add("Fecha de Nac");
         
        for(Object it:columnas){
        
            modelo1.addColumn(it);
        }
        tAlumnos.setModel(modelo1);
        
   
  }
     
     private void borraFilasTabla(){

        int a =modelo1.getRowCount()-1;

           for(int i=a;i>=0;i--){
   
                modelo1.removeRow(i );
           }
}

      private void cargaDatosMaterias(){
    
        borraFilasTabla();
           //Llenar filas con las materias en las que esta incripto un alumno
           
        Materia seleccionado= (Materia)cbMateria.getSelectedItem();
        
        ArrayList<Alumno> lista = (ArrayList)id.listarAlumnosPorMateria(seleccionado.getId_materia());
        
                     
           
        for(Alumno a:lista){
       
          
            
            modelo1.addRow(new Object[]{a.getId_alumno(),a.getApellido(),a.getNombre() ,a.getFechaNac()});
            
        }
    }
           
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<Materia> cbMateria;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tAlumnos;
    // End of variables declaration//GEN-END:variables
}
