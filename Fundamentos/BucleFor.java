/* Bucle For */


/* Sintaxis 
     for (incio bucle, condicion, contador bucle) {
       Linea1
       Linea2
       Linea3
       Linea4
     }
*/

import javax.swing.JOptionPane;

public class BucleFor {

    public static void main(String[] args) {
        
        boolean arroba = false;

        String mail = JOptionPane.showInputDialog("Introduce tu email");
         
        for (int i = 0; i < mail.length(); i++) {

             if (mail.charAt(i) == '@' ) {
                arroba = true;
            }
        }
        if (arroba == true) {
            System.out.println("El email es correcto");
            return;
        }
        System.out.println("El email no es correcto");
    }
}

