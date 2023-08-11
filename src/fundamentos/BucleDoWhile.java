/* Bucle Do - while */

/* Sintaxis: 
     Do {
       Linea1
       Linea2
       Linea3
       Linea4
     }While (condicion);  
*/


package src.fundamentos;

import javax.swing.*;
public class BucleDoWhile {

    public static void main(String[] args) {

        String genero = "";

        do {
            genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");

        } while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));

        int pesoideal = 0;

        if (genero.equalsIgnoreCase("H")) {
            pesoideal = altura - 110;
        } else if (genero.equalsIgnoreCase("M")) {
            pesoideal = altura - 120;
        }
        System.out.println("Tu peso idel es " + pesoideal);
    }
}