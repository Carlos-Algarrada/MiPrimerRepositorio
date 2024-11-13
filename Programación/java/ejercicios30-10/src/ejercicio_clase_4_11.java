/* se pide al usuario el número de mes y el programa
da el nombre del mes que corresponde a ese numero */

import java.util.Scanner;

public class ejercicio_clase_4_11 {
    public static void main(String[] args) {
        /*int op = 0;
        switch (op) {
            case 0:
                Sentencias;
                break;
            case 1:
                Sentencias;
                break;
            default:*/
        System.out.println("Dime el numero de un mes del año");
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        switch (mes) {
            case 1:
                System.out.println("enero");
                break;
            case 2:
                System.out.println("febrero");
                break;
            case 3:
                System.out.println("marzo");
                break;
            case 4:
                System.out.println("abril");
                break;
            case 5:
                System.out.println("mayo");
                break;
            case 6:
                System.out.println("junio");
                break;
            case 7:
                System.out.println("julio");
                break;
            case 8:
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("septiembre");
                break;
            case 10:
                System.out.println("octubre");
                break;
            case 11:
                System.out.println("noviembre");
                break;
            case 12:
                System.out.println("diciembre");
                break;
            default:
                System.out.println("El numero de mes no es correcto");
                break;
        }
    }
}
