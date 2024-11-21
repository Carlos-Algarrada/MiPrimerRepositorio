package files_github.src;

import java.util.Scanner;


public class ejercicio11 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        num = scanner.nextInt();

        if (num < 10)
            System.out.println("Tiene 1 cifra");
        else{
            if (num < 100)
                System.out.println("Tiene 2 cifra");
            else{
                if (num < 1000)
                    System.out.println("Tiene 3 cifra");

            }
        }
    }
}
