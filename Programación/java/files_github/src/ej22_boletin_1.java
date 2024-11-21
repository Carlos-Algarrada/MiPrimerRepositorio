package files_github.src;

import java.util.Scanner;

public class ej22_boletin_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entre 0 y 99: ");
        int numero = scanner.nextInt();
        scanner.close();

        String resultado = convertirNumeroALetras(numero);
        System.out.println("El número en letras es: " + resultado);
    }
    public static String convertirNumeroALetras(int numero) {
        if (numero < 0 || numero > 99) {
            return "Número fuera de rango";
        }

        if (numero <= 19) {
            return convertirUnidad(numero);
        } else if (numero <= 99) {
            int decena = numero / 10;
            int unidad = numero % 10;

            String decenaTexto = convertirDecena(decena);
            String unidadTexto = convertirUnidad(unidad);

            return unidad == 0 ? decenaTexto : decenaTexto + " y " + unidadTexto;
        }
        return "";
    }

    public static String convertirUnidad(int numero) {
        switch (numero) {
            case 0: return "cero";
            case 1: return "uno";
            case 2: return "dos";
            case 3: return "tres";
            case 4: return "cuatro";
            case 5: return "cinco";
            case 6: return "seis";
            case 7: return "siete";
            case 8: return "ocho";
            case 9: return "nueve";
            case 10: return "diez";
            case 11: return "once";
            case 12: return "doce";
            case 13: return "trece";
            case 14: return "catorce";
            case 15: return "quince";
            case 16: return "dieciséis";
            case 17: return "diecisiete";
            case 18: return "dieciocho";
            case 19: return "diecinueve";
            default: return "";
        }
    }

    public static String convertirDecena(int decena) {
        switch (decena) {
            case 2: return "veinte";
            case 3: return "treinta";
            case 4: return "cuarenta";
            case 5: return "cincuenta";
            case 6: return "sesenta";
            case 7: return "setenta";
            case 8: return "ochenta";
            case 9: return "noventa";
            default: return "";
        }
    }
}
