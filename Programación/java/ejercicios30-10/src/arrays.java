public class arrays {
    public static void main(String[] args) {
       /* System.out.println("3 numeros aleatorios entre 50 y 60");

        for (int i =1; i<3; i++) {
            System.out.println((int)(Math.random() *11) + 50 + " ");

        }
        System.out.println("");
        System.out.println("Genera al azar un piedra papale o tijera: ");

        switch ((int) (Math.random() * 3)) {
            case 0:
                System.out.println("piedra");
                break;
            case 1:
                System.out.println("tijera");
                break;
            case 2:
                System.out.println("Papel");
                break;
        }
        System.out.println("");
        System.out.println("Muestra un día de la semana al azar: ");
        int dia = (int)(Math.random() * 7) +1;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }*/
    /*ARRAYS de una dimensión*/
       /* int[] n;
        n = new int[4];
        n[0] = 23;
        n[1] = -34;
        n[2] = -50;
        n[3] = 60;
        int[] i = {1, 5, 7 ,8 ,9};

        char[] caracter = new char[9];
        caracter[0] = 'A';*/
    /* Programa que genera una bandera de colores aleatorios empleando un
    array de cadena caracteres para almacenar colores*/
       /* System.out.println("");
        System.out.println("Vamos a elegir una bandera");
        String[] color = {"rojo", "amarillo", "verde", "blanco", "azul", "negro"};

        for (int f = 1; f<4; f++ ){
            int colore = ((int)(Math.random()*6)+1);
            switch (colore){
                case 1:
                    System.out.println(color[0]);
                    break;
                case 2:
                    System.out.println(color[1]);
                    break;
                case 3:
                    System.out.println(color[2]);
                    break;
                case 4:
                    System.out.println(color[3]);
                    break;
                case 5 :
                    System.out.println(color[4]);
                    break;
                case 6:
                    System.out.println(color[5]);
                    break;
            }
        }/*
        System.out.println("");
        /*Ahora lo vamos a hacer de otra forma diferente*/
        /*System.out.println("Dime un numero para la franja");
        Scanner sc = new Scanner(System.in);
        int franjas = sc.nextInt();

        System.out.println("-------------");
        for (int p = 0; p< franjas; p++){
            System.out.println(color[(int)(Math.random() *color.length)]);
            System.out.println("-------------");
        }/*
        /*array bidimensional*/
        System.out.println("");
        //array de 3 filas por 2 columnas
        int[][] a = new int[3][2];
        a[0][0] = 20;
        a[1][0] = 67;
        a[1][1] = 33;
        a[2][0] = 7;
        int fila, columna;
        for (fila = 0; fila < 3; fila++) {
            System.out.println("Fila:" + fila);
            for (columna = 0; columna < 2; columna++) {
                System.out.println("%05d \n" + a[fila][columna]);
            }
        }
        System.out.println();

    }
}
