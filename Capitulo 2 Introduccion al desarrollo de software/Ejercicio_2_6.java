package ejercicio_2.pkg6;

import java.util.Scanner;

public class Ejercicio_26 {

    public static void main(String[] args) {
        int n, sum = 0;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese un número (Valores disponibles desde el 0 al 1000)");
        do {
            n = lectura.nextInt();
            if (n < 0 || n > 1000) {
                System.out.println("Error: Intente de nuevo con un número correcto.");
            }
        } while (n < 0 || n > 1000);
        do {
            sum += (n % 10);
            n /= 10;
        } while (n >= 1);
        System.out.println("La suma de dígitos es: " + sum);
    }
}
