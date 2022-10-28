package PT.main;

import PT.Control.DataAlumno;
import PT.Control.DataInscripcion;

public class main {

    public static void main(String[] args) {
        
// ------------------------------------------------------------
        // ------ PRUEBA DATA ALUMNO ----------
        //DataAlumno dataAlumno = new DataAlumno();
        
        // CREAR ALUMNO
//        LocalDate date = LocalDate.of(2021, 12, 28);
//        Alumno alu1 = new Alumno("11111111", "Luis", "Silva", date, true);
//        dataAlumno.createAlumno(alu1); consultar por q salta error si usamos 2 metodos a la vez

        // LEER ALUMNO
 //     System.out.println(dataAlumno.readAlumno(2));

        // LEER TODOS LOS ALUMNOS (devuelve ArrayList):     
//        dataAlumno.readAllAlumno().forEach(System.out::println);

        // ACTUALIZAR ALUMNO
        // - Actualizar todo
//       dataAlumno.updateAlumno(3, alu1, 1);
        // - Actualizar DNI
//        dataAlumno.updateAlumno(3, alu1, 2);
        // - Actualizar Nombre 
//        dataAlumno.updateAlumno(3, alu1, 3);
        // - Actualizar Apellido 
//        dataAlumno.updateAlumno(3, alu1, 4);
        // - Actualizar Fecha de nacimiento
//        dataAlumno.updateAlumno(3, alu1, 5);
        // - Actualizar Estado
//        dataAlumno.updateAlumno(3, alu1, 6);
        
        // BORRAR ALUMNO
         // dataAlumno.deleteAlumno(1);

// ------------------------------------------------------------
        // ------ PRUEBA DATA MATERIA ----------
//       Materia mat1 = new Materia("Lengua", 2, true);  
        //DataMateria dataMateria = new DataMateria();
//       dataMateria.createMateria(mat1);

        // LEER MATERIA
//        System.out.println(dataMateria.readMateria(2));

        // LEER TODAS LAS MATERIAS (Devuelve ArrayList)  
//       dataMateria.readAllMateria().forEach(System.out::println);

        // ACTUALIZAR MATERIA
        // - Actualizar todo
//    dataMateria.updateMateria(3, mat1, 1);
        // - Actualizar nombre
//     dataMateria.updateMateria(3, mat1, 2);
        // - Actualizar año
//      dataMateria.updateMateria(3, mat1, 3);
        // - Actualizar estado
//        dataMateria.updateMateria(3, mat1, 4);

        // BORRAR MATERIA
          //dataMateria.deleteMateria(3);
          
// ------------------------------------------------------------
        // ------ PRUEBA DATA INSCRIPCIÓN ---------- 

        // BUSCAR INSCRIPCIÓN (usando id_inscripción)
            //DataInscripcion inscripcion = new DataInscripcion();
//          inscripcion.obtenerInscripcion(2);
//          System.out.println(inscripcion.obtenerInscripcion(2));        
          
        // ACTUALIZAR NOTA (usando id_inscripción)
//          inscripcion.actualizarNota(3);
          
        // OBTENER MATERIAS (usando id_alumno)
        //inscripcion.obtenerMateriasInscriptas(2).forEach(System.out::println);
          
        // OBTENER MATERIAS NO INSCRIPTAS(usando id_alumno)
//          inscripcion.obtenerMateriasNoInscriptas(2).forEach(System.out::println);

        // OBTENER ALUMNOS INSCRIPTOS
            //inscripcion.obtenerAlumnosInscriptos(3).forEach(System.out::println);
            
          
    }
}
