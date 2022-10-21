package main;

import entidades.Alumno;
import entidades.Materia;
import java.time.LocalDate;
import persistencia.Conexion;
import persistencia.DataAlumno;
import persistencia.DataMateria;

public class main {

    public static void main(String[] args) {

        Alumno alu1 = new Alumno("32569789", "nombre", "apellido", LocalDate.now(), true);

        DataAlumno dataAlumno = new DataAlumno();

        dataAlumno.guardarAlumno(alu1);
        
        Materia mat1 = new Materia("Lengua", 2, true);
        
        DataMateria dataMateria = new DataMateria();
        
        dataMateria.guardarMateria(mat1);
        
    }
}
