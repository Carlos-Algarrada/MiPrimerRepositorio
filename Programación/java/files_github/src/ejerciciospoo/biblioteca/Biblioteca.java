package files_github.src.ejerciciospoo.biblioteca;

public class Biblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("123456", "La Ruta Prohibida", 2007);
        Libro libro2 = new Libro("112233", "Los Otros", 2016);
        Libro libro3 = new Libro("456789", "La rosa del mundo", 1995);
        revista revista1 = new revista("444555", "Año Cero", 2019, 344);
        revista revista2 = new revista("002244", "National Geographic", 2003, 255);
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(revista1);
        System.out.println(revista2);
        libro2.presta();
        if (libro2.estaPrestado()) {
            System.out.println("El libro está prestado");
        }
        libro2.presta();
        libro2.devuelve();
        if (libro2.estaPrestado()) {
            System.out.println("El libro está prestado");
        }
        libro3.presta();
        System.out.println(libro2);
        System.out.println(libro3);
    }
}
