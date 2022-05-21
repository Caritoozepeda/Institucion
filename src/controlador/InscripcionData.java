/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Alumno;
import modelo.Conexion;
import modelo.Inscripcion;
import modelo.Materia;

/**
 *
 * @author Caro_Z
 */
public class InscripcionData {

    private Connection con = null;
    private String sql;
    private Conexion conexion;

    public InscripcionData(Conexion conexion) {
        this.conexion=conexion; //OK
        con = conexion.getConexion();
    }
// ok
    public List<Materia>listarMateriasPorAlumno(int id_alumno) {
       
            List<Materia> materias = new ArrayList<>();
            Materia mat;
            sql=" SELECT materia.id_materia, nombre, año, activo FROM inscripcion, materia WHERE inscripcion.id_materia = materia.id_materia AND inscripcion.id_alumno = ? ";
            try { 
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1,id_alumno);
            
            ResultSet rs = ps.executeQuery();
           while (rs.next()){
                
               mat = new Materia();
               mat.setId_materia(rs.getInt("id_materia"));
               mat.setNombre(rs.getString("nombre"));
               mat.setAnio(rs.getInt("año"));
                mat.setActivo(rs.getBoolean("activo"));
                 materias.add(mat);
                                         
            }
            JOptionPane.showMessageDialog(null, "Se generó el listado");
            ps.close();
                       
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se pudo generar el listado de materias.");
        } return materias;
    }
//OK
    public List<Alumno>listarAlumnosPorMateria(int id_materia) {
       
            List<Alumno> alumnos = new ArrayList<>();
            
            Alumno alum;
            sql=" SELECT alumno.id_alumno, apellido, nombre, fechaNac, activo FROM inscripcion, alumno WHERE inscripcion.id_alumno = alumno.id_alumno AND inscripcion.id_materia = ? ";
          try {   
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id_materia);
            
            ResultSet rs = ps.executeQuery();
           while (rs.next()){
                
               alum = new Alumno();
               alum.setId_alumno(rs.getInt("id_alumno"));
               alum.setApellido(rs.getString("apellido"));
               alum.setNombre(rs.getString("nombre"));
               alum.setFechaNac(rs.getDate("fechaNac").toLocalDate()); 
                alum.setActivo(rs.getBoolean("activo"));
               
               alumnos.add(alum);
                                       
            }
                      
            ps.close();
                       
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "No se pudo generar el listado.");
        }return alumnos;
    }
// OK
    public void inscribir(Inscripcion insc) {
        sql = "INSERT INTO inscripcion (id_alumno, id_materia, nota) VALUES (?, ?, ?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, insc.getAlumno().getId_alumno());
            ps.setInt(2, insc.getMateria().getId_materia());
            ps.setDouble(3, insc.getNota());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setId_inscripcion(rs.getInt(1));

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo ingresar la inscripción.");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error en la conexíon- (inscribir).");
        }

    }

   
   // OK 
    public void eliminarInscripcion(int id_alumno,int id_materia){
    
        try {
            
           sql = "DELETE FROM inscripcion WHERE id_alumno =? and id_materia = ?";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id_alumno);
            ps.setInt(2, id_materia);
           
            
            ps.executeUpdate();
            
             JOptionPane.showMessageDialog(null,"Se eliminó la inscripcion " );
            ps.close();
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al eliminar la inscripcion " + ex.getMessage());
        }
        
    
    }
// OK
    public void registrarNota(double nota, int id_alumno, int id_materia) {

       try {
            
            String sql = "UPDATE inscripcion SET nota = ? WHERE id_alumno =? and id_materia =?;";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1,nota);
            ps.setInt(2, id_alumno);
            ps.setInt(3, id_materia);
           
            
            ps.executeUpdate();
             JOptionPane.showMessageDialog(null,"Se registró la nota " );
            
            ps.close();
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al registrar la nota " + ex.getMessage());
        }
        
       
    }  
    //ok    
    public List<Inscripcion> listarAlumnosInscriptos (int id_alumno){
        List<Inscripcion> inscripciones= new ArrayList<>();
             Inscripcion ins;
             Alumno a;
              Materia m;
             sql = "SELECT * FROM inscripcion WHERE id_alumno = ? ";
           try {   
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id_alumno);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                ins = new Inscripcion();
                
                ins.setId_inscripcion(rs.getInt("id_inscripcion"));
             
                a= buscarAlumno(rs.getInt("id_alumno"));
                ins.setAlumno(a);
                
                 m=buscarMateria(rs.getInt("id_materia"));
                ins.setMateria(m);
                ins.setNota(rs.getInt("nota"));
               

                inscripciones.add(ins);
            }      
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener las inscripciones de los alumnos" + ex.getMessage());
        }
        
        
        return inscripciones;
    }   
    
    // ok
    public List<Alumno> listarAlumnosNoInscriptos(int id_materia) {
        List<Alumno> alumnos = new ArrayList<>();
     
         Alumno alum;
      sql=  "SELECT * FROM alumno WHERE id_alumno NOT IN (SELECT alumno.id_alumno FROM inscripcion, alumno, materia WHERE inscripcion.id_alumno = alumno.id_alumno AND inscripcion.id_materia = materia.id_materia AND alumno.activo =1 AND inscripcion.id_materia = ?)";
      
      try {
             
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_materia);
            ResultSet rs = ps.executeQuery();
           
            
            while(rs.next()){
                alum = new Alumno();
                
                alum.setId_alumno(rs.getInt("id_alumno"));
                alum.setApellido(rs.getString("apellido"));
                alum.setNombre(rs.getString("nombre"));
                alum.setFechaNac(rs.getDate("fechaNac").toLocalDate()); 
                alum.setActivo(rs.getBoolean("activo"));
                
                alumnos.add(alum);
            }      
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al obtener los alumnos No inscriptos " + ex.getMessage());
        }
        
        return alumnos;
    }
    //ok
     public List<Materia> listarMateriasInscriptas(int id_alumno){
         
    List<Materia> materias = new ArrayList<>();
            
         Materia materia;
             sql = "SELECT materia.id_materia, materia.nombre, año, activo FROM inscripcion,materia WHERE inscripcion.id_materia = materia.id_materia AND inscripcion.id_alumno = ?";
          try {   
              PreparedStatement ps = con.prepareStatement(sql);
          
            ps.setInt(1, id_alumno);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                materia = new Materia();
                materia.setId_materia(rs.getInt("id_materia"));
                materia.setNombre(rs.getString("nombre"));
                 materia.setAnio(rs.getInt("año"));
                materia.setActivo(rs.getBoolean("activo"));
                materias.add(materia);
            }      
            ps.close();
        } catch (SQLException ex) {
       JOptionPane.showMessageDialog(null, " Error al obtener el listado de materias cursadas.");
        }
       
        return materias;
      
    }
    
     //ok
    public List<Materia> listarMateriasNoInscriptas(int id_alumno){
            List<Materia> materias = new ArrayList<>();
             Materia materia;
        sql = "SELECT * FROM materia WHERE id_materia NOT IN (SELECT materia.id_materia FROM inscripcion, alumno, materia WHERE inscripcion.id_alumno = alumno.id_alumno AND inscripcion.id_materia = materia.id_materia AND materia.activo = 1 AND inscripcion.id_alumno = ?)";
        try {
             
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_alumno);
            ResultSet rs = ps.executeQuery();
           
            while(rs.next()){
                materia = new Materia();
                materia.setId_materia(rs.getInt("id_materia"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setActivo(rs.getBoolean("activo"));
                materias.add(materia);
            }      
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al obtener las materias  No inscriptas " + ex.getMessage());
        }
        
        
        return materias;
        }
   
     //OK   
    public List<Inscripcion> listarInscripciones(){
        List<Inscripcion> inscripciones = new ArrayList <>();
        
         try {
            String sql = "SELECT * FROM inscripcion ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            Inscripcion  inscrip;
            while(rs.next()){
                
                inscrip = new Inscripcion();
                inscrip.setId_inscripcion(rs.getInt("id_inscripcion"));
                
                Alumno a=buscarAlumno(rs.getInt("id_alumno"));
                inscrip.setAlumno(a);
                
                Materia m=buscarMateria(rs.getInt("id_materia"));
                inscrip.setMateria(m);
                inscrip.setNota(rs.getInt("nota"));
               

                inscripciones.add(inscrip);
            }      
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en llistar inscripciones.");
        }
               
        return inscripciones;
        
        
        
    }
    public double notaAltaMateria(int idM)  {
        
        String sq = "SELECT MAX(nota),materia.nombre,alumno.apellido,alumno.nombre FROM inscripcion ,alumno ,materia WHERE materia.nombre LIKE materia = ?;";
        double nota = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sq, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idM);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            nota=rs.getInt("nota");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion.");
        }
        return 0;
    }
    
    public double notaBajaMateria(int idM) {
        
        String sql = "SELECT MIN(nota),materia.nombre,alumno.apellido,alumno.nombre FROM inscripcion ,alumno ,materia WHERE materia.nombre LIKE materia = ?;";
        int nota;
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idM);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            nota=rs.getInt("nota");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion.");
        }
        return 0;
    }
    
     public Alumno buscarAlumno(int id){
    
        AlumnoData ad=new AlumnoData(conexion);
        
        return ad.buscarAlumno(id);
        
    }
    
    public Materia buscarMateria(int id){
    
        MateriaData md=new MateriaData(conexion);
        return md.buscarMateria(id);
    
    }
    //ok
   
    
    
    
    
}




