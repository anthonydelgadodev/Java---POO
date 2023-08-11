/* Matrices (Arrays, Arreglos) */


/* ¿Que es? */
// Es un estructura de datos que contiene una coleccion de valores del mismo tipo.

/* Para que? */
// Para almacenar valores que normalmente tiene alguna relacion entre si


/* Sintaxis */
/*  Declaracion: int[] mi_matriz = new int[10]; */
// int[] : Tipo de la matriz
// mi_matriz : Nombre de la matriz
// int[10] : N° de valores que almacena la matriz

// Pos 0 : 15
// Pos 1 : 25
// Pos 2 : 8
// Pos 3 : -7
// Pos 4 : 92

/* Int [] mi_matriz = new int [5];  */

// mi_matriz [0] = 15; 
// mi_matriz [1] = 25; 
// mi_matriz [2] = 8; 
// mi_matriz [3] = -7; 
// mi_matriz [4] = 92; 


/* Declaracion simplifacada alternativa */
// Int [] mi_matriz = { 15, 25, 8, -7, 92 };



package src.fundamentos;

public class Matrices {
    public static void main(String[] args) {
        
        int [] mi_matriz = new int [5];
        
        mi_matriz [0] = 5;
        mi_matriz [1] = 38;
        mi_matriz [2] = 15;
        mi_matriz [3] = 92;
        mi_matriz [4] = 71;

        // int [] mi_matriz = {5, 38, -15, 95, 85, 65, 25, 14, 78, 85, 65, 12, 45, 78, 95, 23};
        // Usamos un bucle for para recorrer el arreglo e imprimir cada valor
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor del indice " + i + " = " + mi_matriz[i]);
        }   
    }
}

/* Forma simplificada de la matriz

public class Matrices {
    public static void main(String[] args) {
        
        // int [] mi_matriz = {5, 38, -15, 95, 85, 65, 25, 14, 78, 85, 65, 12, 45, 78, 95, 23};

        for (int i = 0; i < mi_matriz.length; i++) {
            System.out.println("Valor del indice " + i + " = " + mi_matriz[i]);
        }   
    }
}
 */