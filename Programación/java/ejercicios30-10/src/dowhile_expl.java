import java.util.Scanner;

/* bucle do while que se termina cuando
se introduce un numero impar*/
public class dowhile_expl {
    public static void main(String[] args) {
        int numero;

        do {
            System.out.println("Dime un número");
            Scanner sc = new Scanner(System.in);
            numero = sc.nextInt();
            if (numero % 2 == 0) {
                System.out.println(numero);
            }else {
                System.out.println("No muestro numeros impares");
            }
        }
        while (numero % 2 == 0);

    }
}
