package ejercicio_2.pkg9;

import java.util.Scanner;

public class Ejercicio_29 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese v0, v1 y tiempo: ");
        double v0 = lectura.nextDouble();
        double v1 = lectura.nextDouble();
        double t = lectura.nextDouble();
        double a = (v1 - v0) / t;
        System.out.println("La aceleración aproximada es: " + a);
    }
}
