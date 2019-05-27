package ejercicio_2.pkg16;

import java.util.Scanner;

public class Ejercicio_216 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese la medida del lado del hexágono: ");
        double lado = lectura.nextDouble();
        double área = (3 * Math.pow(3, 0.5)) / 2 * Math.pow(lado, 2);
        System.out.println("El área del hexágono es de: " + área);
    }
}
