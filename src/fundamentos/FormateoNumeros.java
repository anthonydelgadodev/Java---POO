package src.fundamentos;

import javax.swing.*;
public class FormateoNumeros {
    
    public static void main(String[] args) {

        String num1 = JOptionPane.showInputDialog("Introduce tu número");
        double num2 = Double.parseDouble(num1);//realiza la conversión de un valor de tipo String (representado por num1) a un valor de tipo double

        System.out.print("La raíz de " + num2 + " es ");
        System.out.printf("%.4f%n", Math.sqrt(num2));
    }
}
