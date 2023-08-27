package src.poo;

public class Uso_Coche {
    public static void main(String[] args) {

        Coche micoche = new Coche(); //Instanciar una clase.

        micoche.establece_color("amarillo");//metodo establece_color

        System.out.println(micoche.datos_generales());

        System.out.println(micoche.dime_color());

        micoche.configura_asientos("si");
        System.out.println(micoche.dime_asientos());

        /* 
        System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");
        System.out.println("Este coche tiene " + Renault.largo + " mm.");
        System.out.println("Este coche tiene " + Renault.ancho + " mm.");
        System.out.println("Este coche tiene un motor del año " + Renault.motor);
        System.out.println("Este coche tiene un peso de " + Renault.peso + " kg."); 
        */  
    }
}
