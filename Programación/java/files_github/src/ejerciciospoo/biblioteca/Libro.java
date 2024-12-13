package files_github.src.ejerciciospoo.biblioteca;

public class Libro extends publicacion implements Prestable {
    private boolean prestado = false;
    public Libro(String isbn, String titulo, int anio) {
        super(isbn, titulo, anio);
    }
    @Override
    public void presta(){
        if(this.prestado){
            System.out.println("El libro esta prestado");
        } else {
            this.prestado = true;
            System.out.println("Libro entregado...");
        }
    }
    @Override
    public void devuelve(){
        this.prestado = false;
    }
    @Override
    public boolean estaPrestado(){
        return this.prestado;
    }

}
