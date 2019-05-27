package ejercicio_2.pkg3;

import java.util.Scanner;

public class Ejercicio_23 {

    public static void main(String[] args) {
        double pies, metros;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese una distancia en pies: ");
        pies = lectura.nextDouble();
        metros = pies * 0.305;
        System.out.println(pies + " pies son " + metros + " metros.");
    }
}
