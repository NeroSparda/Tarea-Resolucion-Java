package ejercicio_2.pkg19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio_219 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        DecimalFormat salidaDouble = new DecimalFormat("#.0");
        System.out.println("Digite las coordenadas del primer vértice: ");
        double x1 = lectura.nextDouble();
        double x2 = lectura.nextDouble();
        System.out.println("Digite las coordenadas del segundo vértice: ");
        double y1 = lectura.nextDouble();
        double y2 = lectura.nextDouble();
        System.out.println("Digite las coordenadas del tercer vértice: ");
        double z1 = lectura.nextDouble();
        double z2 = lectura.nextDouble();
        double s1 = Math.pow(Math.pow(y1 - x1, 2) + Math.pow(y2 - x2, 2), 0.5);
        double s2 = Math.pow(Math.pow(z1 - x1, 2) + Math.pow(z2 - x2, 2), 0.5);
        double s3 = Math.pow(Math.pow(y1 - z1, 2) + Math.pow(y2 - z2, 2), 0.5);
        double sp = (s1 + s2 + s3) / 2;
        double área = Math.pow(sp * (sp - s1) * (sp - s2) * (sp - s3), 0.5);
        System.out.println("El área del triángulo es: " + salidaDouble.format(área));
    }
}
