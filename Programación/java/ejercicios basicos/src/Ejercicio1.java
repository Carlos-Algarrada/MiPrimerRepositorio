public class Ejercicio1 {
    int x = 144;
    int y = 999;
    int suma = x + y;
    int resta = x - y;
    int multiplicacion = x * y;
    int division = y / x;

    public static void main(String[] args) {
        Ejercicio1 ejercicio = new Ejercicio1();
        System.out.println("La suma de las dos es: " + ejercicio.suma + 
                           ", la resta de las dos es: " + ejercicio.resta + 
                           ", la multiplicación de los dos es: " + ejercicio.multiplicacion + 
                           ", la división de los dos es: " + ejercicio.division);
    }
}