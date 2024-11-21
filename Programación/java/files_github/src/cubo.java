package files_github.src;

public class cubo {
    /**
     * A que sí
     */
    int capacidad; // volumen max en litros
    int contenido; //Contenido actual en litros

    //Metodos


    //constructor
    cubo(int c) {
        this.capacidad = c;
    }
    int getCapacidad() {
        return this.capacidad;
    }
    int getContenido() {
        return this.contenido;
    }

    void setCapacidad(int c) {
        this.capacidad = c;
    }
    void setContenido(int c) {
        this.contenido = c;
    }
    void llena(){
        this.contenido = this.capacidad;
    }
    void vacio() {
        this.capacidad = 0;
    }
    void pinta() {
        for (int nivel = this.capacidad; nivel > 0; nivel++) {
            if (this.contenido >= nivel) {
                System.out.println("______________");
            }
        }
    }
    void vuelcaEn(cubo destino) {
        int libres = destino.getCapacidad() - destino.getContenido();

        if (libres > 0) {
            destino.setContenido(destino.getContenido() + this.contenido);
        }
    }
    public static void main(String[] args) {
        cubo cubito = new cubo (2);
        cubo cubazo = new cubo (7);

        cubito.pinta();
        cubazo.pinta();

        cubito.llena();
        cubito.pinta();
        cubito.vuelcaEn(cubazo);

        cubazo.pinta();

    }
}
