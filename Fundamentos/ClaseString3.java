public class ClaseString3 {
    public static void main(String[] args) {
        
        String alumno1 = "David";
        String alumno2 = "David";
        String alumno3 = "david";

        System.out.println(alumno1.equals(alumno2));//"equals" al momento de comparar la cadena de caracteres tiene en cuenta mayusculas y minusculas.
        System.out.println(alumno1.equalsIgnoreCase(alumno3));//"equalsIgnoreCase" al momento de comparar la cadena de caracteres no tiene en cuenta mayusculas y minusculas.
    }
}
/* Metodos utilizados en el codigo */
// equals; equalsIgnoreCase;