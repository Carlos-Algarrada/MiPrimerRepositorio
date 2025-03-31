package files_github.src.pruebavueltaclase;

import java.util.ArrayList;
import java.util.List;

public class Superheroe {

    private String nombre;
    private String descripcion;
    private Boolean capa;

    public Superheroe(String nombre){
        this.descripcion = "";
        this.nombre= "";
        this.capa= false;
    }
    public String getNombre() {
            return nombre;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean isCapa(){
        return capa;
    }

    public void setCapa(Boolean capa) {
        this.capa = capa;
    }

    @Override
    public java.lang.String toString() {
        return "Superheroe{" + "nombre='" + nombre + '\'' + ", descripcion='" + descripcion + '\'' + ", capa=" + capa + '}';
    }
}
class dimension {
    private double alto;
    private double ancho;
    private double profundidad;

    public dimension() {
        this.alto = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }

    public dimension(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public double getVolumen() {
        return alto * ancho * profundidad;
    }
    @Override
    public String toString(){
        return "Dimension{" + "alto=" + alto + ", ancho=" + ancho + ", profundidad=" + profundidad + ", volumen=" + getVolumen() + '}';
    }
}
class figura {
    private String codigo;
    private double precio;
    private dimension dimensiones;
    private Superheroe superheroe;

    public figura(String codigo, double precio, dimension dimensiones, Superheroe superheroe) {
        this.codigo = codigo;
        this.precio = precio;
        this.dimensiones = dimensiones;
        this.superheroe = superheroe;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public dimension getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(dimension dimensiones) {
        this.dimensiones = dimensiones;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }
    public void subirPrecio(double cantidad) {
        this.precio += cantidad;
    }
    @Override
    public String toString(){
        return "Figura{" + "codigo='" + codigo + '\'' + ", precio=" + precio + ", dimensiones=" + dimensiones + ", superheroe=" + superheroe + '}';
    }
}
class coleccion {
    private String nombreColeccion;
    private List<figura> listaFiguras;

    public coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public List<figura> getListaFiguras() {
        return listaFiguras;
    }
    public void añadirFigura(figura fig) {
        this.listaFiguras.add(fig);
    }

    public void subirPrecio(double cantidad, String id) {
        for (files_github.src.pruebavueltaclase.figura figura : listaFiguras) {
            if (figura.getCodigo().equals(id)) {
                figura.subirPrecio(cantidad);
                break;
            }
        }
    }

    public String conCapa() {
        StringBuilder sb = new StringBuilder();
        for (files_github.src.pruebavueltaclase.figura figura : listaFiguras) {
            if (figura.getSuperheroe().isCapa()) {
                sb.append(figura).append("\n");
            }
        }
        return sb.toString();
    }

    public figura masValioso() {
        figura masCara = null;
        for (files_github.src.pruebavueltaclase.figura figura : listaFiguras) {
            if (masCara == null || figura.getPrecio() > masCara.getPrecio()) {
                masCara = figura;
            }
        }
        return masCara;
    }
    public double getValorColeccion() {
        double total = 0;
        for (files_github.src.pruebavueltaclase.figura figura : listaFiguras) {
            total += figura.getPrecio();
        }
        return total;
    }
    public double getVolumenColeccion() {
        double volumenTotal = 0;
        for (files_github.src.pruebavueltaclase.figura figura : listaFiguras) {
            volumenTotal += figura.getDimensiones().getVolumen();
        }
        return volumenTotal + 200;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Coleccion: " + nombreColeccion + "\n");
        for (files_github.src.pruebavueltaclase.figura figura : listaFiguras) {
            sb.append(figura).append("\n");
        }
        return sb.toString();
    }
}
