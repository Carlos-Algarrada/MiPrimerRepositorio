
import java.io.File;
import java.io.IOException;

public class ejemplo2 {
    public static void main(String[] args) {
        
        /* ¿Cómo convertir system.out en mi objeto Printwriter?
        
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
        

    }
    
}
