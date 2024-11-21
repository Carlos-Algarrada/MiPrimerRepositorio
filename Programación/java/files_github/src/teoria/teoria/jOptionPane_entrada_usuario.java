package files_github.src.teoria.teoria;

import javax.swing.*;

public class jOptionPane_entrada_usuario {
    public static void main(String[] args) {
        String [] paises = new String [4];
        for (int i = 0; i < paises.length; i++) {
            paises[i] = JOptionPane.showInputDialog("Introduce el nombre del pais" + (i+1) + ":");

        }
        for (String pais : paises) {
            System.out.println(pais);
        }
        int [] numeros = new int [4];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        }
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
