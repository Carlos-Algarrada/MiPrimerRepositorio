package files_github.src.ejerciciospoo.biblioteca;

public class publicacion {
    private String isbn;
    private String titulo;
    private int anio;
    public publicacion(String isbn, String titulo, int anio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
    }
    public String toString() {
        return "ISBN: " + this.isbn + ", titulo: " + this.titulo + ", anio: " + this.anio;
    }
}
