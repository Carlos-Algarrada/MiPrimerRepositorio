
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class ejemplo_fichero {
    public static void main(String[] args) {
        /*File fichero = new File("files_github/src/Almacenamiento_de_datos/fichero.txt");
        System.out.println("Nombre del fichero: " + fichero.getName());
        System.out.println("Ruta del fichero: " + fichero.getPath());
        System.out.println("Ruta absoluta del fichero: " + fichero.getAbsolutePath());
        System.out.println("¿Existe el fichero?: " + fichero.exists());
        System.out.println("¿Es un directorio?: " + fichero.isDirectory());
        System.out.println("¿Es un fichero?: " + fichero.isFile());
        System.out.println("¿Tamaño del fichero?: " + fichero.length());
        */
        // Crear un fichero
        try {
            File fichero = new File("fichero.txt");
            if (fichero.createNewFile()) {
                System.out.println("Fichero creado");
            } else {
                System.out.println("Fichero no creado");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        File fichero2 = new File("fichero2.txt");
        if (fichero2.exists()) {
            System.out.println("Fichero2 existe");
        } else {
            System.out.println("Fichero2 no existe");
        }
        FileReader fr = null;
        if (fichero2.exists()) {
            System.out.println("Fichero2 existe");
        } else {
            System.out.println("Fichero2 no existe");                 
        }
        BufferedReader br = null;
        try {
            fr = new FileReader("fichero.txt");
            br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }

}
