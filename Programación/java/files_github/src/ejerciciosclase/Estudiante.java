package files_github.src.ejerciciosclase;

public class Estudiante {
    /**
     * Enunciado:
     * Implementa la clase Estudiante con los siguientes atributos y métodos:
     * Atributos: nombre (String), edad (int), matricula (String).
     * Métodos:
     * Un constructor que inicialice todos los atributos.
     * Método registrarEstudiante para agregar un nuevo estudiante a una lista de estudiantes.
     * Método mostrarInformacion para imprimir los detalles del estudiante.
     */
    private String nombre;
    private String apellido;
    private int edad;
    private String matricula;
    public Estudiante(String nombre, String apellido, int edad, String matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.matricula = matricula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
