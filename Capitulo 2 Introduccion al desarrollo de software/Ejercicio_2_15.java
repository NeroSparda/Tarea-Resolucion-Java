package ejercicio_2.pkg15;

import java.util.Scanner;

public class Ejercicio_215 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas del primero punto: ");
        double x1 = lectura.nextDouble();
        double y1 = lectura.nextDouble();
        System.out.println("Ingrese las coordenadas del segundo punto: ");
        double x2 = lectura.nextDouble();
        double y2 = lectura.nextDouble();
        double d = (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        d = Math.pow(d, 0.5);
        System.out.println("La distancia entre a y b es: " + d);
    }
}
