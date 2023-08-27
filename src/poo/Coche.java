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
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;


    //Un metodo constructor siempre debe tener el mismo nombre de la clase
    public Coche() {

        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1995;
        peso_plataforma = 500;
    }

    public String datos_generales(){ //Metodo Getter
        return "La plataforma del vehiculo tiene " + ruedas + " ruedas. " + "Mide " + largo/1000 + 
        " metros con un ancho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kg";
    }

    public void establece_color(String color_coche){ //Metodo Setter
        color = color_coche;
    }

    public String dime_color(){  //Metodo Getter
        return "El color del coche es " + color;
    }

    public void configura_asientos(String asientos_cuero){//Metodo Setter
        if (asientos_cuero == "si"){
            this.asientos_cuero = true;
        }else {
            this.asientos_cuero = false;
        }
    }
    public String dime_asientos(){//Metodo Getter
        if(asientos_cuero == true){
            return "El coche tiene asientos de cuero";
        }else {
            return "El coce tiene asientos de serie";
        }
    }
}

