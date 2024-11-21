package files_github.src.teoria.teoria;

import java.util.Scanner;

public class Clases {
    public class persona {
        private String nombre;
        private String apellido;
        private int edad;
        public persona(String nombre, String apellido, int edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;

        }
        public static void mian(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Apellido: ");
            String apellido = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();

        }
    }
}
