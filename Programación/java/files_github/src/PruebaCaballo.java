package files_github.src;

public class PruebaCaballo {
    public static void main(String[] args) {
        Caballo a = new Caballo("PEPE", "Negro", 6, 100);
        Caballo b = new Caballo("Maria", "Blanco", 5, 120);
        System.out.println("Hola me llamo " + a.getNombre());
    }
}
