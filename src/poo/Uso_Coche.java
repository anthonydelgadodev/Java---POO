package src.poo;

public class Uso_Coche {
    public static void main(String[] args) {

        Coche Renault = new Coche();

        System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");
        System.out.println("Este coche tiene " + Renault.largo + " mm.");
        System.out.println("Este coche tiene " + Renault.ancho + " mm.");
        System.out.println("Este coche tiene un motor del año " + Renault.motor);
        System.out.println("Este coche tiene un peso de " + Renault.peso + " kg.");  
    }
}
