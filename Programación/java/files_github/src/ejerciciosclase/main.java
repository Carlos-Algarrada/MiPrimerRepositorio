package files_github.src.ejerciciosclase;

import java.util.ArrayList;

public class main {
    static Estudiante a = new Estudiante( "carlos","Algarrada",24, "4565454" );


    public static void main(String[] args) {
        System.out.println("Alumno con nombre " + a.getNombre());
        System.out.println("Alumno con apellido " + a.getApellido());
        System.out.println("Alumno con edad " + a.getEdad());
        System.out.println("Alumno con matricula " + a.getMatricula());
    }
}
