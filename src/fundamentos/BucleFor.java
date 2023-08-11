/* Bucle For */


/* Sintaxis 
     for (incio bucle, condicion, contador bucle) {
       Linea1
       Linea2
       Linea3
       Linea4
     }
*/


package src.fundamentos;

import javax.swing.JOptionPane;
public class BucleFor {

    public static void main(String[] args) {
        
        int arroba = 0;
        boolean punto = false;

        String mail = JOptionPane.showInputDialog("Introduce tu email");
         
        for (int i = 0; i < mail.length(); i++) {

             if (mail.charAt(i) == '@' ) {
                arroba++;
            }
            if (mail.charAt(i) == '.' ) {
                punto = true;
            }
        }
        if (arroba == 1 && punto == true) {
            System.out.println("El email es correcto");
            return;
        }
        System.out.println("El email no es correcto");
    }
}