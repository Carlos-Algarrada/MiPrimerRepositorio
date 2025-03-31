package files_github.src.ejemplo1;

public class superheroe {
    private String Nombre;
    private String Descripcion;
    private Boolean Capa;

    public superheroe(String nombre){
        this.Nombre=nombre;
        this.Descripcion="";
        this.Capa=false;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Boolean getCapa() {
        return Capa;
    }

    public void setCapa(Boolean capa) {
        Capa = capa;
    }

    public String toString() {
        return "superheroe{" + "Nombre='" + Nombre + '\'' + ", Descripcion='" + Descripcion + '\'' + ", Capa=" + Capa + '}';
    }
}
