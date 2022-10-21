package main;

import entidades.Alumno;
import java.time.LocalDate;
import persistencia.Conexion;
import persistencia.DataAlumno;

public class main {

    public static void main(String[] args) {

        Alumno alu1 = new Alumno("32569789", "nombre", "apellido", LocalDate.now(), true);

        DataAlumno dataAlumno = new DataAlumno();

        dataAlumno.guardarAlumno(alu1);

    }
}
