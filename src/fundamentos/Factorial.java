package src.fundamentos;

import javax.swing.*;

public class Factorial {
    
    public static void main(String[] args) {
        
        // Inicialización de la variable para almacenar el resultado del factorial.
        int resultado = 1;
        
        // Solicitar al usuario que ingrese un número utilizando una ventana de diálogo.
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        
        // Inicio del bucle for para calcular el factorial.
        // La variable 'i' se inicializa con el valor del número ingresado por el usuario.
        // El bucle se ejecutará mientras 'i' sea mayor que 0.
        for (int i = numero; i > 0; i--) {

            // Multiplicación acumulada del resultado con el valor actual de 'i'.
            resultado = resultado * i;
        }
        
        // Fin del bucle for. Se ha calculado el factorial del número ingresado.
        
        // Mostrar el resultado del factorial en la consola.
        System.out.println("El factorial de " + numero + " es " + resultado);
    }
}
