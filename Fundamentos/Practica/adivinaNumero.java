package Practica;

import java.util.*;
public class adivinaNumero {
    
    public static void main(String[] args) {
        
        int aleatorio = (int)( Math.random() * 100);
        
        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int intentos = 0;

        while (numero != aleatorio) {

            intentos++;
            System.out.println("Introduce un numero");

            numero = entrada.nextInt();

            if (aleatorio < numero) { 
                System.out.println("Mas bajo");
                continue;
            }
            System.out.println("Alto");
        }
        System.out.println("Correcto. Lo has consegido en " + intentos + " intentos.");            
    }
}