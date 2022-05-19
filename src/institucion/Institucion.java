/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion;

import controlador.*;
import java.sql.SQLException;
import java.time.LocalDate;
import modelo.*;
import modelo.Alumno;
import modelo.Conexion;
import modelo.Materia;

/**
 *
 * @author Caro_Z
 */
public class Institucion {
    private static Conexion conexion;
    private static AlumnoData ad;
    private static MateriaData md;
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
       conexion = new Conexion();
        ad = new AlumnoData(conexion);
        Alumno a= new Alumno(1,"Sosa","Juan",LocalDate.of(1980, 8, 23),true);
        Alumno a2= new Alumno(2,"Pepe","Jose",LocalDate.of(1990, 9, 01),true);
//        ad.agregarAlumno(a);
//        ad.agregarAlumno(a2);
//        System.out.println(" "+ ad.buscarAlumno(1));
//        System.out.println(" "+ ad.listarAlumnos());
//        
        md= new MateriaData(conexion);
        
        Materia m= new Materia(1,"Matematicas",2,true);
        Materia m1= new Materia(2,"Algoritmos",1,true);
        
//        md.agregarMateria(m);
//        md.agregarMateria(m1);
        
//        System.out.println(" "+ m);
//        System.out.println(" "+ md.listarMaterias());
      
        Inscripcion in= new Inscripcion(a2, m1,7.7);
        InscripcionData id= new InscripcionData(conexion);
               // ok id.inscribir(in);
         // ok   System.out.println(" "+ ad.buscarAlumno(4)); 
      // ok  System.out.println("" + md.buscarMateria(4));
       // ok System.out.println("materias"+ md.listarMaterias());
      
       
    // ok System.out.println(" materias inscrp id 7 " + id.obtenerInscripcionesPorAlumno(7));
  // ok System.out.println("" + id.listarAlumnosNoInscriptos(8));
   // ok  id.registrarNota(8, 1, 1);
     //ok    System.out.print(""+id.listarAlumnosInscriptos(7) ) ;
  // Ok      System.out.println("q"+ id.listarAlumnosPorMateria(8));
    // ok   id.eliminarInscripcion(1,1);
       // ok  System.out.println(""+ id.listarMateriasPorAlumno(7));
      //ok  System.out.println("" +id.listarMateriasNoInscriptas(2)); 
       // OK System.out.println(" "+  id.listarInscripciones());
    // ok    System.out.println("" +id.listarMateriasInscriptas(7) ); 
        System.out.println("" + id.notaAltaMateria(1));
    }
    
}
