import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean continuar = true;

            System.out.println("=== Calculadora Simple ===");

            while (continuar) {
                System.out.println("\nSeleccione una operación:");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Salir");
                System.out.print("Ingrese su elección: ");

                int opcion = scanner.nextInt();

                if (opcion == 5) {
                    System.out.println("Saliendo de la calculadora...");
                    continuar = false;
                    break;
                }

                System.out.print("Ingrese el primer número: ");
                double numero1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double numero2 = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + (numero1 + numero2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (numero1 - numero2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (numero1 * numero2));
                        break;
                    case 4:
                        if (numero2 != 0) {
                            System.out.println("Resultado: " + (numero1 / numero2));
                        } else {
                            System.out.println("Error: División por cero no permitida.");
                        }
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        break;
                }
            }

            scanner.close();
        }
}