import java.util.Scanner;

public class Buscaeltesoro {
    public static void main(String[] args) {
        //Minijuego: Busca el tesoro

        //Se coloca una mina y un tesoro de forma aleatoria en un cuadrante
        // de 4 filas por 5 columnas. el usuario intentará averiguar dónde esta el tesoro
        final int VACIO = 0;
        final int MINA = 1;
        final int TESORO = 2;
        final int INTENTO = 3;

        int x, y;
        int [][] cuadrante= new int[5][4];
        Scanner entrada =  new Scanner(System.in);
        for (x= 0 ; x<5; x++){
            for (y= 0 ; y<4; y++){
                cuadrante[x][y] = VACIO;
            }
        }
        //coloca la mina
        int minaX = (int) (Math.random()*5);
        int minaY = (int) (Math.random()*4);
        cuadrante[minaX][minaY] = MINA;

        //coloca el tesoro
        int tesoroX, tesoroY;

        do {  //ejecuta el bloque de codigo al menos una vez y luego evalúa
            // la condición para decidir si debes repetir el bucle
            tesoroX = (int) (Math.random()*5);
            tesoroY = (int) (Math.random()*4);
        }while((minaX == tesoroX) && (minaY == tesoroY)); //Si el tesoroX y el tesoroY
        // generados no coinciden con minaX y mina Y, el bucle se detiene.
        cuadrante[tesoroX][tesoroY] = TESORO;

        System.out.println("¡BUSCA EL TESORO!");
        Boolean salir = false;
        String c;
        do{
            //Pinta el cuadrante con bordes y encabezado de columnas
            System.out.println( " |--|--|--|--|");
        }

    }
}
