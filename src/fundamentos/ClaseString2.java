package src.fundamentos;

public class ClaseString2 {
    public static void main(String[] args) {
        
        String frase = "Hoy es un estupendo dia para aprender a programar en Java";//Esta frase tiene 57 caracteres, contando desde 0 y contando los espacios
        
        System.out.println("Mi frase tiene " + frase.length() + " letras.");
        
        String frase_resumen = frase.substring(29, 57);
        System.out.println(frase_resumen);
    }
}
/* Metodos utilizado */
// length(); substring(x,y);