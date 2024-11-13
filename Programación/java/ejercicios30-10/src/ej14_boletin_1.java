import java.util.Scanner;

public class ej14_boletin_1 {
    public static void main(String[] args) {
        System.out.println("Dime tú nota");
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();
        switch (nota) {
            case 0,1,2,3,4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 9,10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Nota Invalida");
                break;

        }
    }
}
