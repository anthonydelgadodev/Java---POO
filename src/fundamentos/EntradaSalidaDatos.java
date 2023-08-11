/* Entra y Salida de datos (Input Data output) */

/* Clase Scanner */
/*   Scanner   */
/* nextLine()   nextInt()   nextDouble() */

// nextLine() : Nos permitira introducir texto
// nextInt() : Nos permitira introducir numero enteros
// nextDouble () : Nos permitira introducir numeros decimales

/* Clase JOptionPane */
/* JOptionPane */
/* showInputDialog() */ //Metodo estatico, para usarlo se escribiria asi: JOptionPane.showInputDialog()


package src.fundamentos;

import java.util.*;//Importo con * todas las clases
public class EntradaSalidaDatos {
        public static void main(String[] args) {

                Scanner entrada = new Scanner(System.in);

                System.out.println("Introduce tu nombre");

                String nombreUsuario = entrada.nextLine();
                System.out.println();

                System.out.println("Introduce tu edad");

                int edad = entrada.nextInt();
                System.out.println();

                System.out.println("Hola " + nombreUsuario + ". El año que viene tendras " + (edad + 1) + " años");
        }
}

/* Constructor */
// Es un metodo especial que tiene como caracteristica que tiene como nombre el mismo de la clase.