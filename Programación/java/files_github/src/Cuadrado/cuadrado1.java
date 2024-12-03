package files_github.src.Cuadrado;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * The type Cuadrado 1.
 */
public class cuadrado1 {
    /**
     * The Sc.
     */
    Scanner sc = new Scanner(System.in);
    /**
     * The Lado.
     */
    public int lado = sc.nextInt();

    /**
     * Pinta.
     */
    public void pinta(){
        for(int i=1;i<=lado;i++){
            System.out.println("");
            for(int j=1;j<=lado;j++){
                if(i==1){
                    System.out.print("*  ");
                }
                if(i>1 && i<lado){
                    if(j==1 || j==lado){
                        System.out.print("*  ");
                    }
                    else {
                        System.out.print("   ");
                    }
                }
                if(i==lado){
                    System.out.print("*  ");
                }
            }
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println("Dime el numero de lados de tu cuadrado");
        cuadrado1 c1 = new cuadrado1();
        c1.pinta();
    }
}
