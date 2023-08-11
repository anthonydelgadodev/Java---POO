/* Bucle while */

/* Sintaxis: 
     While (condicion) {
       Linea1
       Linea2
       Linea3
       Linea4
     }  
*/


package src.fundamentos;

import javax.swing.*;

public class BucleWhile {

    public static void main(String[] args) {

        String clave = "Anthony";

        String pass = "";

        while (clave.equals(pass) == false) {

            pass = JOptionPane.showInputDialog("Introduce la contraseña");

            if (clave.equals(pass) == false) {

                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Contraseña correcta. Acceso permitido");
    }
}
