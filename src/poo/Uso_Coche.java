package src.poo;
import javax.swing.*;

public class Uso_Coche {
    public static void main(String[] args) {

        Coche micoche = new Coche(); //Instanciar una clase.

        micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));//metodo establece_color

        System.out.println(micoche.datos_generales());

        System.out.println(micoche.dime_color());

        micoche.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        System.out.println(micoche.dime_asientos());

        micoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
        System.out.println(micoche.dime_climatizador());

        System.out.println(micoche.dime_pesoCoche());

        System.out.println("El precio final del coche es: " + micoche.precio_coche());

        /* 
        System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");
        System.out.println("Este coche tiene " + Renault.largo + " mm.");
        System.out.println("Este coche tiene " + Renault.ancho + " mm.");
        System.out.println("Este coche tiene un motor del año " + Renault.motor);
        System.out.println("Este coche tiene un peso de " + Renault.peso + " kg."); 
        */  
    }
}
