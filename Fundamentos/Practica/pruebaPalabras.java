package Practica;
import javax.swing.*;
import java.util.*;

public class pruebaPalabras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String palabraPrincipal = JOptionPane.showInputDialog("Introduce la palabraPrincipal principal");
        String palabraPrincipalSecundaria = JOptionPane.showInputDialog("Introduce la palabraPrincipal secundaria");

        int ultimaLetra = palabraPrincipal.length();
        int ultimaLetra2 = palabraPrincipalSecundaria.length();

        System.out.println("La palabraPrincipal principal " + palabraPrincipal + " tiene " + palabraPrincipal.length() + " letras");
        System.out.println("La primera letra de la palabraPrincipal " + palabraPrincipal + " es " + palabraPrincipal.charAt(0));
        System.out.println("La ultima letra de la palabraPrincipal " + palabraPrincipal + " es " + palabraPrincipal.charAt(ultimaLetra - 1));

        System.out.println();

        System.out.println("La palabraPrincipal secundaria " + palabraPrincipalSecundaria + " tiene " + palabraPrincipalSecundaria.length() + " letras");
        System.out.println("La primera letra de la palabraPrincipal " + palabraPrincipalSecundaria + " es " + palabraPrincipalSecundaria.charAt(0));
        System.out.println("La ultima letra de la palabraPrincipal " + palabraPrincipalSecundaria + " es " + palabraPrincipalSecundaria.charAt(ultimaLetra2 - 1));
    }
}
