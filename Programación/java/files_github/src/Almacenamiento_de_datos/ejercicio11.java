/*
 * **Ejercicio 11: Listar archivos en un directorio**  
 Crea un programa que muestre todos los archivos y carpetas dentro del directorio actual, indicando si cada uno es un archivo o un directorio.
 */
import java.io.File;

public class ejercicio11{
    public static void main(String[] args) {
        File directorio = new File("~/Escritor\n" + //
                        "io/Github/MiPrimerRepositorio/Programación/java/files_github/src/Almacenamiento_de_datos.txt");
        File[] archivos = directorio.listFiles();
        for (File archivo : archivos) {
            if (archivo.isDirectory()) {
                System.out.println(archivo.getName() + " es un directorio");
            } else {
                System.out.println(archivo.getName() + " es un archivo");
            }
        }
    }
}