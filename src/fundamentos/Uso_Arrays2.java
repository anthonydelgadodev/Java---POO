package src.fundamentos;

public class Uso_Arrays2 {
    public static void main(String[] args) {
        
        int [] matriz_aleatorios = new int [150];

        for (int i = 0; i < matriz_aleatorios.length; i++){

            matriz_aleatorios[i] = (int)Math.round(Math.random()*100);
        }

        for (int numeros : matriz_aleatorios) {

            System.out.print(numeros + " ");
        }
    }
}

/* matriz_aleatorios[i] = (int)Math.round(Math.random()*100); 

esta línea de código asigna a cada posición i del array matriz_aleatorios un número entero aleatorio entre 0 y 100 
(ambos inclusive). La generación de números aleatorios se realiza utilizando la función Math.random() y se redondea 
al número entero más cercano usando Math.round(). Luego, se guarda este valor en la posición i del array.
El proceso se repite para cada posición i hasta que se llenan todas las 150 posiciones del array con números 
aleatorios.
*/