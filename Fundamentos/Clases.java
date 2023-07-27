/* Clases en Java */

/* Clase en Java */
// Propias y Predefinidas
// String, Math, Array, Thread.

/* Clase Math */

/* La clase Math contiene un muestrario de metodos que nos permiten realizar calculos matematicos. */
// Math.sqrt(n): raiz cuadrada de un numero
// Math.pow(base, exponente): potencia de un numero. Base y exponente son doubles.
// Math.sin(ángulo). Math.cos(ángulo). Math.tan(ángulo). Math.atan(ángulo)
// Math.roud(decimal): redondeo de un numero
// Math.PI: constante de clase con el numero PI

public class Clases {

    public static void main(String[] args) {

        double raiz = Math.sqrt(25.5); // Devuelve un double y la variable en la que se guarda debe ser tambie double.
        System.out.println( "La raiz es " + raiz);
        System.out.println();

        double base = 5.0;
        double exponente = 3.0;
        double resultado = Math.pow(base, exponente);// Devuelve un double y la variable en la que se guarda debe ser tambien double.   
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado);
        System.out.println();

        double num1 = 5.85;
        int resultado2 = (int) Math.round(num1); // (tipo de dato) Refundiciones, cambiar de un tipo de dato a otro. Se hace cuando se necesita ese tipo de dato obligatoriamente.
        System.out.println("El resultado es " + resultado2);
        System.out.println();
    }
}