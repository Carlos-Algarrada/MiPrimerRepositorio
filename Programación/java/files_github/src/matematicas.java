package files_github.src;

import java.util.ArrayList;

public class matematicas {
    /**
     * me cachis
     */
    public static boolean esPrimo(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Devuelve el verdadero si el número que se pasa como parametro es capicua y falso en caso contrario
     * @param x
     * @return
     * EL num capicua es aquel que se lee igual de izq a derecha
     */
    /*public static boolean esCapicua(int x) {
        if (x < 2) {

        }
    }*/
    public static int siguientePrimo(int x) {
        while (!esPrimo(x++)) {
            System.out.println(x);
        }
        return x;
    }
    public static double potencial(int x) {
        return Math.pow(x, 2);
    }
    public static int digitos(long x){
        if (x <0){
            x = -x;
        }
        if (x == 0){
            return 1;
        }else {
            int n = 0;
            while (x > 0) {
                x = x / 10;
                n++;
            }
            return n;
        }
    }
    public static  long voltea (long x){
        if (x<0){

        }
        ArrayList<Integer> digitos = new ArrayList<>();
        while (x > 0) {
            digitos.add((int) (x % 10));//añado el último digito al array
            x = x / 10; //reduzco el numero
        }
        long volteado= 0;
        for (int i = 0; i < digitos.size(); i++) {
            volteado = volteado *10 + digitos.get(i);
        }
        return volteado;
    }
    public static int digit(long x, int n){
        x= voltea(x);
        return n;
    }
    public static void main(String[] args) {
        int x = 7;
        System.out.println(++x);
        while (x<10){
            System.out.println(++x);
        }
        siguientePrimo(x);
    }

}
