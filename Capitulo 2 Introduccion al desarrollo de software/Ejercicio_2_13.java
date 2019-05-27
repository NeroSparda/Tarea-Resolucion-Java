package ejercicio_2.pkg13;

import java.util.Scanner;

public class Ejercicio_213 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el depósito mensual: ");
        double dep = lectura.nextDouble();
        double ahorro = 0;
        for (int i = 1; i <= 6; i++) {
            ahorro += dep;
            ahorro *= 1.00417;
        }
        System.out.println("El ahorro al final del sexto mes es: " + ahorro);
    }
}
