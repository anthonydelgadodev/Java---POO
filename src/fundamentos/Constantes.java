/* Constantes en Java */

/* ¿Que es una constante? */
// Es un espacio en la memoria del ordenador donde se almacenara un valor que no podra cambiar durante la ejecucion del programa.

/* ¿Por que hay que utilizar constantes?  */
// Porque a la hora de crear un programa a veces surge la necesidad de guardar datos temporales que necesitaras utilizar en el futuro en ese mismo programa. Estos datos deben ser fijos.

/* ¿Como se crea una constante en Java? */
// Utilizando la palara clav final y a cotinuacion especificando el tipo de dato que almacenara en su interior + el nombre de la constante=valor
// Ej: final double a_pulgadas=2,54;

/* Recuerda */
// El vaor de una constante no podra cambiar.


package src.fundamentos;

public class Constantes {

    public static void main(String[] args) {

        final double pulgadas = 2.54;
        // Al utilizar la palabra "final" conviertes la variable a constante, la cual no es posible cambiarle el valor.

        int cm = 6;

        double resultado = cm / pulgadas;

        System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");
    }
}