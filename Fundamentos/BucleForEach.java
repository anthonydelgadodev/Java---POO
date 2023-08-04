/* Bucle For Each */


/* El uso de Java ForEach nos permite recorrer la lista de elementos de una forma mas compacta y el código se reduce.  */

public class BucleForEach {
    public static void main(String[] args) {
        
        //Declario normal
        /*String [] paises = new String[8];

        paises [0] = "España";
        paises [1] = "Mexico";
        paises [2] = "Colombia";
        paises [3] = "Peru";
        paises [4] = "Chile";
        paises [5] = "Argentina";
        paises [6] = "Ecuador";
        paises [7] = "Venezuela";*/

        //Declaracion simplifacada
        String [] paises = {"España" , "Mexico", "Colombia", "Peru", "Chile", "Argentina", "Ecuador", "Venezuela"};

        //Bucle for normal
        /*for (int i = 0; i < paises.length; i++) {
            System.out.println("Pais " + (i+1) + " " + paises[i]);
        }*/

        //Bucle for mejorado o bucle for-each
        for (String elemento : paises) {
            System.out.println(elemento);
        }
    }
}