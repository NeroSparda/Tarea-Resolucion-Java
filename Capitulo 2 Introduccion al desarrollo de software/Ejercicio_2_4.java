package ejercicio_2.pkg4;

import java.util.Scanner;

public class Ejercicio_24 {

    public static void main(String[] args) {
        double libras, kg;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese un peso en libras: ");
        libras = lectura.nextDouble();
        kg = libras * 0.454;
        System.out.println(libras + " libras son " + kg + " kilogramos.");
    }
}
