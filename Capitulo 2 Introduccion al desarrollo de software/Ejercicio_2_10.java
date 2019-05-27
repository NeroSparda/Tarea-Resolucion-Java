package ejercicio_2.pkg10;

import java.util.Scanner;

public class Ejercicio_210 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de agua en kg: ");
        double agua = lectura.nextDouble();
        System.out.println("Ingrese la temperatura inicial deseada: ");
        double ti = lectura.nextDouble();
        System.out.println("Ingrese la temperatura final deseada: ");
        double tf = lectura.nextDouble();
        double Q = agua * (tf - ti) * 4184;
        System.out.println("La energía requerida es de " + Q);
    }
}
