package files_github.src.ejerciciospoo.biblioteca;

public class revista extends publicacion{
    private int numero;
    public revista(String isbn, String titulo, int anio, int numero) {
        super(isbn, titulo, anio);
        this.numero = numero;
    }
}
