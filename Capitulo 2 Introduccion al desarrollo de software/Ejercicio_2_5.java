package ejercicio_2.pkg5;

import java.util.Scanner;

public class Ejercicio_25 {

    public static void main(String[] args) {
        double sueldo, grati;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el sueldo y el % de gratificación: ");
        sueldo = lectura.nextDouble();
        grati = lectura.nextDouble();
        grati /= 100;
        System.out.println("La gratificación es de S/. "
                + (sueldo * grati) + " y el total de S/. " + (sueldo + (sueldo * grati)));
    }
}
