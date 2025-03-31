package files_github.src.pruebavueltaclase;

public class main{
    public static void main(String[] args) {
        Superheroe superman = new Superheroe("Superman");
        superman.setDescripcion("Héroe con capa roja y super fuerza");
        superman.setCapa(true);

        dimension dim1 = new dimension(30, 15, 10);

        figura figura1 = new figura("F001", 50.0, dim1, superman);

        Superheroe batman = new Superheroe("Batman");
        batman.setDescripcion("Héroe sin superpoderes pero muy ingenioso");
        batman.setCapa(true);

        dimension dim2 = new dimension(25, 10, 8);
        figura figura2 = new figura("F002", 40.0, dim2, batman);

        // Crear una colección
        coleccion coleccion = new coleccion("Héroes DC");
        coleccion.añadirFigura(figura1);
        coleccion.añadirFigura(figura2);


        System.out.println(coleccion);


        coleccion.subirPrecio(10, "F001");
        System.out.println("\nDespués de subir el precio de la figura F001:");
        System.out.println(coleccion);


        System.out.println("\nFiguras con capa:");
        System.out.println(coleccion.conCapa());


        System.out.println("\nFigura más valiosa:");
        System.out.println(coleccion.masValioso());


        System.out.println("\nValor total de la colección: " + coleccion.getValorColeccion());

        System.out.println("\nVolumen total de la colección: " + coleccion.getVolumenColeccion());
    }
}
