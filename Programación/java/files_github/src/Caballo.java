package files_github.src;

public class Caballo {
    private String nombre;
    private String color;
    private int edad;
    private int carrerasGanadas;

    Caballo(String n, String c, int e, int cg){
        this.nombre = n;
        this.color = c;
        this.edad = e;
        this.carrerasGanadas = cg;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void cabalga(){
        System.out.println("Tocoto Tocoto Tocoto");
    }
    public void relincha() {
        System.out.println("YIJAAAAAAAAAAAAAAAAAAAAAAA");
    }
}
