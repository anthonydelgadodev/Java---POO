/* Variables en Java */


/* ¿Que es una variables? */
// Es una espacio en la memoria del ordenador donde se almancenara un valor que podra cambiar durante la ejecucion del programa.

/* ¿Porque hay que utilizar variables?  */
// Porque a la hora de crear un programa surge la necesidad de guardar datos temporales que necesitaras utilizar en el futuro en ese mismo programa.

/* ¿Como se crea una variable en Java */
// Especificando el tipo de dato que almancenara en su interior + el nombre de la variable.
// Ej: int salario;

/* ¿Que es iniciar una variable? */
// Es darle un valor. Nombre_variable=valor. Ej: salario=2000; Java no permite utilizar variables que no se hayan iniciado.


package src.fundamentos;

public class Variables {

    public static void main(String[] args) {

        Short año = 2023; // Declaracion de variable en una sola linea.

        byte edad; // Declaracion de variable en dos lineas.
        edad = 18;

        System.out.println("Año: " + año + ", Edad: " + edad);
    }
}