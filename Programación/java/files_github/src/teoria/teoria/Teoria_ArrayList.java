package files_github.src.teoria.teoria;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
public class Teoria_ArrayList {
    public static void main(String[] args) {
        // Un ArrayList es lo que conociamos en python como LISTA
        //Un ArrayList es una estructura de datos en Java que
        // permite almacenar elementos de forma dinámica.

        //Ventaja sobre ARray: No necesito definir su tamaño de antemano.

        ArrayList<String> nombres = new ArrayList<>();

        //AGREGAR ELEMENTOS AL ARRAYLIST:
        nombres.add("Ester");
        nombres.add("Juan");
        nombres.add("Miguel");

        System.out.println("Lista de nombres" + nombres);
        String[] n = {"Miguel", "Juan"};
        System.out.println(Arrays.toString(n));

        //Acceder a un elemento
        System.out.println("Primer nombre: " + nombres.get(0));
        System.out.println("Segundo nombre: " + nombres.get(1));

        //Cambiar un elemento: (Set: establezco algo get: Cambio información

        nombres.set(1 , "Carmen");
        System.out.println("Lista actualizada: " + nombres);

        /*
         * add(): Metodo para agregar items
         * get(): Permite acceder a un elemnto a un elemnto por index
         * set(): Cambia un elemento en una posición especifica.
         * */
    }
}
