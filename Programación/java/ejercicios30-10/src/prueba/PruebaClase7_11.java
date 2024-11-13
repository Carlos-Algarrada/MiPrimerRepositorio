package prueba;

import javax.swing.*;
import java.util.Random;
import java.util.RandomAccess;

public class PruebaClase7_11 {
    public static void main(String[] args) {
        /* Realiza un programa que pinte una table de turron con un bocado realizado de forma aleatoria.
        El ancho y el alto de la tableta se pide por teclado. El bocado se da alrededor del turron,
        obviamente no se puede dar un bocado en medio de la tableta*/

        int anchura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho de la tableta de turrón"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura de la tableta de turrón"));

        int [][] tableta = new int[altura][anchura];

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        int random = 0;
        System.out.println("");
        boolean numero = false;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                if (j == 0 || j == anchura - 1) {
                    numero = true;
                }else{
                    numero = false;
                }
                if ((int) (Math.random() *anchura +1) == 1 && random == 0 && numero == true ) {
                   random = +1;
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }

            System.out.println("");
        }
        int numeroaleatrorio2 = 0;
        boolean n =false;
        while (n == false) {
            if (numeroaleatrorio2 != 1 && numeroaleatrorio2 != 5){
                n = true;
            }else{
                numeroaleatrorio2 = ((int) (Math.random() * anchura + 1));
            }
        }

        System.out.println(numeroaleatrorio2);
    }
}
