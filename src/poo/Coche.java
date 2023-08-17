package src.poo;

public class Coche {
    /* 
    int ruedas;
    int largo;
    int ancho;
    int motor;
    int peso;
    */

    /* Encapsular con la variable con "private" */
    /* Caracteristicas comunes (no cambian) */
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;

    /* Caracteristicas que pueden cambiar */
    String color;
    int peso_total;
    boolean asientos_cuero;


    //Un metodo constructor siempre debe tener el mismo nombre de la clase
    public Coche() {

        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1995;
        peso_plataforma = 500;
    }

    public String dime_largo(){ //Metodo Getter
        return "El largo del coche es " + largo;
    }

    public void establece_color(){ //Metodo Setter

        color = "Azul";
    }

    public String dime_color(){  //Metodo Getter
        return "El color del coche es " + color;
    }
}

