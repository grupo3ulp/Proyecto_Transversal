package main;

import entidades.Alumno;
import entidades.Materia;
import java.time.LocalDate;
import persistencia.Conexion;
import persistencia.DataAlumno;
import persistencia.DataMateria;

public class main {
    
    public static void main(String[] args) {
//        prueba DataAlumno
        DataAlumno dataAlumno = new DataAlumno();
//        metodo createAlumno:
LocalDate date = LocalDate.of(2021, 12, 28);
        Alumno alu1 = new Alumno("11111111", "Luis", "Silva", date, true);
//        dataAlumno.createAlumno(alu1); consultar por q salta error si usamos 2 metodos a la vez
//        metodo readAlumno:
//        System.out.println(dataAlumno.readAlumno(2));
//        metodo readAllAlumno:     
//        dataAlumno.readAllAlumno().forEach(System.out::println);
//        metodo updateAlumno:
//        //      update all  
//        dataAlumno.updateAlumno(3, alu1, 1);
//        //      update dni  
//        dataAlumno.updateAlumno(3, alu1, 2);
//        //      update nombre  
//        dataAlumno.updateAlumno(3, alu1, 3);
//        //      update apellido
//        dataAlumno.updateAlumno(3, alu1, 4);
//        // update fecha
//        dataAlumno.updateAlumno(3, alu1, 5);
//        //      update estado
//        dataAlumno.updateAlumno(3, alu1, 6);
//        Prueba DataMAteria ===============================================================================================================

        Materia mat1 = new Materia("Lengua", 2, true);
        
        DataMateria dataMateria = new DataMateria();
//        dataMateria.createMateria(mat1);
    }
}
