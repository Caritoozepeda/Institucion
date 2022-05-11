/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import modelo.Alumno;
import modelo.Conexion;
import modelo.Materia;

/**
 *
 * @author Caro_Z
 */
public class InscripcionData {
    
    private Connection con = null;
    private String sql;
    

    public InscripcionData(Conexion conexion) {

        con = conexion.getConexion();
    }
    
    public List listarMaterias(Alumno alumno){
        List <Materia> materias=new ArrayList<>();
        
      return materias ;  
    }
    public List listarAlumnos(Materia materia){
        List <Alumno> alumnos=new ArrayList<>();
        return alumnos;
    }
    
    public void inscribir(Alumno alumno, Materia materia){
        
    }
    
     public void desInscribir(Alumno alumno, Materia materia){
        
    }
    
    
    public void registrarNota(double nota,Alumno alumno, Materia materia){
        
    }
    
    
    
}
