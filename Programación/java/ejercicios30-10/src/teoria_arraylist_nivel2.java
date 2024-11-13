import java.util.ArrayList;

public class teoria_arraylist_nivel2 {
    public static void main(String[] args) {
        //Realizar operaciones de:
        //Iteración y manipulación de elementos

        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Banana");
        frutas.add("Mango");
        frutas.add("Cereza");
        frutas.add("Aceituna");

        for (int i = 0; i < frutas.size(); i++) {
            System.out.println("Fruta " + (i+1) + ": " +frutas.get(i));
        }

        //iMPRIMIR USANDO UN FOR-EACH

        for (String fruta:frutas){
            System.out.println("Fruta:" + fruta);
        }
        frutas.remove("Mango");
        System.out.println(frutas);

        //Arraylist de enteros que se emplee lo siguiente
        //Buscar un elemento
        //Clonar o copiar el arraylist
        //Vaciar o limpiar los elementos del arraylist

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        //Buscar un numero Si existe
        int numerobuscado= 30;
        if (numeros.contains(numerobuscado)){
            System.out.println("El número " + numerobuscado +" está en la lista");
        }else{
            System.out.println("El numero" + numerobuscado + "no está en la lista");
        }
        // Clona el ArrayList

        ArrayList<Integer> copiaNumeros = (ArrayList<Integer>) numeros.clone();
    }
}
