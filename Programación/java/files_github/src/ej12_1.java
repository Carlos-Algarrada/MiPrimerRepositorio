package files_github.src;

import java.util.Scanner;

public class ej12_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // dm, um, c, d, u

        //unidades
        int u = n % 10;
        n = n / 10;

        // decenas
        int d = n % 10;
        n = n / 10;

        //Centenas
        int m = n % 10;
        n = n / 10;
        //unidades de millar
        int s = n % 10;
        n = n / 10;

        //decenas de millar
        int t = n % 10;
        n = n / 10;
        System.out.println(u + " " + d + " " + m + " " + s + " " + t);
    }
}
