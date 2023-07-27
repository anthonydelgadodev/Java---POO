import javax.swing.*; //Los metodos de esta clase son estaticos "static"
public class EntradaSalidaDatos2 {

    public static void main(String[] args) {
        
    String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre");

    String edad = JOptionPane.showInputDialog("Introduce tu edad");
    int edadUsuario = Integer.parseInt(edad); //Convertirá la edad ingresada, que es un texto, a un valor numérico usando Integer.parseInt.

    edadUsuario++; //se usa el operador incremento para agregar un +1
    System.out.println("Hola " + nombreUsuario + ". El año que viene tendras " + edadUsuario + " años");

    }
}
