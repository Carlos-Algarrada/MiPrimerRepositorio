package files_github.src.ejerciciospoo.ejericicio17.chatgpt;
/*Implementa las clases Piramide y Rectangulo. Sobre una pirámide se debe saber su altura y sobre un rectángulo se debe saber tanto la base como la altura. Cada una de las clases debe tener un atributo de clase (static) que lleve la cuenta de las pirámides y de los rectángulos creados respectivamente. El siguiente código que va dentro del main genera la salida que se indica.*/
class Piramide {
    private int altura; // Altura de la pirámide
    private static int piramidesCreadas = 0; // Contador estático para saber cuántas pirámides se han creado

    // Constructor: inicializa la altura de la pirámide y aumenta el contador
    public Piramide(int altura) {
        this.altura = altura;
        piramidesCreadas++; // Incrementa el número de pirámides creadas
    }

    // Método estático para obtener el número total de pirámides creadas
    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }

    // Método toString para representar la pirámide como un triángulo de asteriscos
    @Override
    public String toString() {
        StringBuilder piramide = new StringBuilder(); // Usamos StringBuilder para construir el dibujo
        for (int i = 1; i <= altura; i++) { // Iteramos por cada nivel de la pirámide
            // Agregamos espacios en blanco a la izquierda para centrar la pirámide
            for (int j = 0; j < altura - i; j++) {
                piramide.append(" ");
            }
            // Agregamos los asteriscos para el nivel actual
            for (int j = 0; j < 2 * i - 1; j++) {
                piramide.append("*");
            }
            piramide.append("\n"); // Añadimos un salto de línea para pasar al siguiente nivel
        }
        return piramide.toString(); // Devolvemos el dibujo completo como una cadena
    }
}

class Rectangulo {
    private int base; // Base del rectángulo (ancho)
    private int altura; // Altura del rectángulo
    private static int rectangulosCreados = 0; // Contador estático para saber cuántos rectángulos se han creado

    // Constructor: inicializa la base y altura del rectángulo y aumenta el contador
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        rectangulosCreados++; // Incrementa el número de rectángulos creados
    }

    // Método estático para obtener el número total de rectángulos creados
    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }

    // Método toString para representar el rectángulo como un conjunto de asteriscos
    @Override
    public String toString() {
        StringBuilder rectangulo = new StringBuilder(); // Usamos StringBuilder para construir el dibujo
        for (int i = 0; i < altura; i++) { // Iteramos por cada fila del rectángulo
            for (int j = 0; j < base; j++) { // Agregamos asteriscos en la fila actual
                rectangulo.append("*");
            }
            rectangulo.append("\n"); // Añadimos un salto de línea para pasar a la siguiente fila
        }
        return rectangulo.toString(); // Devolvemos el dibujo completo como una cadena
    }
}

public class Main {
    public static void main(String[] args) {
        // Creamos una pirámide con altura 4
        Piramide p = new Piramide(16);

        // Creamos dos rectángulos: uno de 4x3 y otro de 6x2
        Rectangulo r1 = new Rectangulo(4, 3);
        Rectangulo r2 = new Rectangulo(6, 2);

        // Imprimimos las representaciones visuales de los objetos
        System.out.println(p);   // Representación de la pirámide
        System.out.println(r1);  // Representación del primer rectángulo
        System.out.println(r2);  // Representación del segundo rectángulo

        // Imprimimos el número de pirámides y rectángulos creados
        System.out.println("Pirámides creadas: " + Piramide.getPiramidesCreadas());
        System.out.println("Rectángulos creados: " + Rectangulo.getRectangulosCreados());
    }
}


