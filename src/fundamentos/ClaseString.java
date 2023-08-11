/* MANIPULACION DE CADENAS */
    /* Clase String */


// String no es un tipo primitivo


/* ¿Como almancenar una cadena de caracteres? */
// String mi_nombre="Anthony"; donde mi_nombre es un objeto (instacia, ejemplar) de la clase String


/* Metodos (mas usado) de la clase String para manipulacion de cadenas de texto: */
// length() : devuelve la longitud de una cadena de caracteres
// charAt(n): devuelve la posicion de una caracter dentro deuna cadena. (Las posiciones empiezan a contar de 0)
// substring(x,y) : devuelve una subcadena dentro de la cadena, siendo X el caracter a partir del cual se extrae e Y el n° de caracteres que se quieren extraer.
// equals(cadena): devuelve true si dos cadenas que se comparan son iguales y false si no lo son. Distingue mayusculas y minusculas
// equalsIgnoreCase(cadena): igual que el anterior pero sin tener en cuenta mayusculas y minusculas.


package src.fundamentos;

public class ClaseString {
    
    public static void main(String[] args) {
        
        String nombre = "Anthony";

        System.out.println("Mi nombres es " + nombre);

        System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
        
        System.out.println("La primera letra del nombre " + nombre + " es " + nombre.charAt(0));
        
        int ultima_letra = nombre.length();//Aquí, se obtiene la longitud del nombre (número de caracteres) y se almacena en la variable ultima_letra. Esto se hace restando 1 al valor de la longitud, ya que los índices en Java comienzan en 0 y necesitamos el índice de la última letra.
        System.out.println("La ultima letra del nombre " + nombre + " es " + nombre.charAt(ultima_letra-1));//Accede al último carácter del nombre almacenado en la variable "nombre" y devuelve ese carácter.
    }
}
/* Metodos utilizados en el codigo */
//length(); charAt(n); 