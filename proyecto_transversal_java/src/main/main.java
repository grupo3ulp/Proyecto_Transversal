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
        Alumno alu1 = new Alumno("32569789", "nombre", "apellido", LocalDate.now(), true);
//        dataAlumno.createAlumno(alu1); consultar por q salta error si usamos 2 metodos a la vez
//        metodo readAlumno:
//        System.out.println(dataAlumno.readAlumno(2));
//        metodo readAllAlumno:     
//        dataAlumno.readAllAlumno().forEach(System.out::println);
//        Prueba DataMAteria ===============================================================================================================

        Materia mat1 = new Materia("Lengua", 2, true);

        DataMateria dataMateria = new DataMateria();
//        dataMateria.createMateria(mat1);
    }
}
