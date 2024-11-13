import java.util.Scanner;

public class ejercicio12 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ej12();
    }
    public static void ej12() {
        String numeroDelReves = "";
        System.out.println("Ingrese un numero: ");
        char[] numeroElegido =sc.nextLine().toCharArray();
        for (int i = numeroElegido.length-1; i>= 0; i--) {
            numeroDelReves += numeroElegido[i];
        }
        System.out.println(numeroDelReves);
    }
}
