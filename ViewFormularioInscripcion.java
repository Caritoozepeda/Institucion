 
package vistas;

import controlador.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;


public class ViewFormularioInscripcion extends javax.swing.JInternalFrame {
    
    private ArrayList<Alumno> listaAlumnos;
    private AlumnoData alumnoData;
    private ArrayList<Inscripcion> listaInscripcion;
    private InscripcionData inscripcionData;
    private List<Materia> listaMaterias;
    private MateriaData materiaData;
    private Conexion conexion;
    private DefaultTableModel modelo;
   
public ViewFormularioInscripcion() {
        initComponents();
        this.setSize(600, 650);
        
      
        conexion =new Conexion();
        alumnoData= new AlumnoData(conexion);
        listaAlumnos= (ArrayList<Alumno>) alumnoData.listarAlumnosActivos();
        
        cargaAlumnos();
        modelo= new DefaultTableModel();
        armaCabeceraTabla();
        
        inscripcionData = new InscripcionData(conexion);                  
       listaInscripcion = (ArrayList)inscripcionData.listarInscripciones();
       
       materiaData = new MateriaData(conexion);
       listaMaterias =(ArrayList)materiaData.listarMateriasActivas();
         
}

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tMaterias = new javax.swing.JTable();
        btInscribir = new javax.swing.JButton();
        btAnular = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        rbInscriptas = new javax.swing.JRadioButton();
        rbNoInscriptas = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORMULARIO DE INSCRIPCION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 30, 384, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ALUMNO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 120, 102, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LISTADO DE MATERIAS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 180, 230, 22);

        cbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnosActionPerformed(evt);
            }
        });
        getContentPane().add(cbAlumnos);
        cbAlumnos.setBounds(210, 120, 235, 20);

        tMaterias.setBackground(new java.awt.Color(204, 204, 255));
        tMaterias.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));
        tMaterias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "AÑO"
            }
        ));
        tMaterias.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tMaterias);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 270, 528, 130);

        btInscribir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btInscribir.setText("Inscribir");
        btInscribir.setEnabled(false);
        btInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInscribirActionPerformed(evt);
            }
        });
        getContentPane().add(btInscribir);
        btInscribir.setBounds(90, 430, 84, 36);

        btAnular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btAnular.setText("Anular Inscripción");
        btAnular.setEnabled(false);
        btAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnularActionPerformed(evt);
            }
        });
        getContentPane().add(btAnular);
        btAnular.setBounds(270, 430, 143, 36);

        btSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btSalir);
        btSalir.setBounds(500, 430, 75, 36);

        rbInscriptas.setBackground(new java.awt.Color(153, 153, 153));
        rbInscriptas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbInscriptas.setForeground(new java.awt.Color(0, 0, 153));
        rbInscriptas.setText("Inscriptas");
        rbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbInscriptasActionPerformed(evt);
            }
        });
        getContentPane().add(rbInscriptas);
        rbInscriptas.setBounds(110, 220, 90, 23);

        rbNoInscriptas.setBackground(new java.awt.Color(153, 153, 153));
        rbNoInscriptas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbNoInscriptas.setForeground(new java.awt.Color(0, 0, 153));
        rbNoInscriptas.setSelected(true);
        rbNoInscriptas.setText("No Inscriptas");
        rbNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoInscriptasActionPerformed(evt);
            }
        });
        getContentPane().add(rbNoInscriptas);
        rbNoInscriptas.setBounds(410, 220, 100, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_form_institucion.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-20, 0, 770, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAlumnosActionPerformed

    private void rbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbInscriptasActionPerformed
        // TODO add your handling code here:
        rbNoInscriptas.setSelected(false);
        cargaDatosInscriptas();
        btAnular.setEnabled(true);
        btInscribir.setEnabled(false);                                                      
    }//GEN-LAST:event_rbInscriptasActionPerformed

    private void rbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoInscriptasActionPerformed
        // TODO add your handling code here:
        rbInscriptas.setSelected(false);
        cargaDatosNoInscriptas();
        btAnular.setEnabled(false);
        btInscribir.setEnabled(true);
        
    }//GEN-LAST:event_rbNoInscriptasActionPerformed

    private void btInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInscribirActionPerformed
        // TODO add your handling code here:
         int filaSeleccionada= tMaterias.getSelectedRow();
    
        if(filaSeleccionada!=-1){
                
            Alumno a=(Alumno) cbAlumnos.getSelectedItem();
            
            
            int id_materia=(Integer)modelo.getValueAt(filaSeleccionada,0);
            String nombre=(String)modelo.getValueAt(filaSeleccionada,1);
            int anio=(Integer)modelo.getValueAt(filaSeleccionada, 2);
            
            Materia m=new Materia(id_materia,nombre,anio,true);
            
            Inscripcion c=new Inscripcion(a,m,0);
            
            
            inscripcionData.inscribir(c);
            
            borraFilasTabla();
       
        }else{
            JOptionPane.showMessageDialog(this, " Debe seleccionar una materia");
        }
    }//GEN-LAST:event_btInscribirActionPerformed

    private void btAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnularActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada=tMaterias.getSelectedRow();
        if(filaSeleccionada!=-1){
                    
            Alumno a=(Alumno)cbAlumnos.getSelectedItem();
                        
            int id_materia=(Integer)modelo.getValueAt(filaSeleccionada,0);
                       
            inscripcionData.eliminarInscripcion(a.getId_alumno(), id_materia);
            
            borraFilasTabla();
        }else{
            JOptionPane.showMessageDialog(this, " Debe seleccionar una materia");
        }
    }//GEN-LAST:event_btAnularActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void cargaAlumnos(){
    //Carga las materias al ComboBox
   
         for(Alumno item:listaAlumnos){
            
            cbAlumnos.addItem(item);
           
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
    private void cargaDatosInscriptas(){
    
        borraFilasTabla();
           //Llenar filas con las materias en las que esta incripto un alumno
           
        Alumno seleccionado= (Alumno)cbAlumnos.getSelectedItem();
        
        ArrayList<Materia> lista = (ArrayList)inscripcionData.listarMateriasPorAlumno(seleccionado.getId_alumno());
        
        for(Materia m:lista){
        
            modelo.addRow(new Object[]{m.getId_materia(),m.getNombre(),m.getAnio()});
        }
    }
    private void cargaDatosNoInscriptas(){
    
      borraFilasTabla();
          //Llenar filas
        
        Alumno seleccionado=(Alumno)cbAlumnos.getSelectedItem();
       
        ArrayList<Materia> lista  = (ArrayList)inscripcionData.listarMateriasNoInscriptasPorAlumno(seleccionado.getId_alumno());
        
        for(Materia m:lista){
        
            modelo.addRow(new Object[]{m.getId_materia(),m.getNombre(),m.getAnio()});
                
        }
        
        
    }
   
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnular;
    private javax.swing.JButton btInscribir;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbInscriptas;
    private javax.swing.JRadioButton rbNoInscriptas;
    private javax.swing.JTable tMaterias;
    // End of variables declaration//GEN-END:variables
}
