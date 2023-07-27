/* Flujo de control */


/* Flujo de ejecucion */
// Public static void main (String args[]) {
// Linea codigo 1
// Linea codigo 2
// Linea codigo 3
// Linea codigo 4
// Linea codigo 5
//}



/* Condicionales */

// Condicional if
 // if(condicion){ 
      // codigo a ejecutar si la condicion es verdad (true);
 // } else


import java.util.*;
public class FlujoDeControl {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu edad");

        int edad = entrada.nextInt();

        if (edad < 18) {
            System.out.println("Eres un adolecente");
        }
        else if (edad < 50) {
            System.out.println("Eres un adulto");
        }
        else {
            System.out.println("Estas viejito, ve a descansar");
        }       
    }
}
