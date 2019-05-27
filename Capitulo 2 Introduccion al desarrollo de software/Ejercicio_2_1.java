package ejercicio_2.pkg1;

import java.util.Scanner;

public class Ejercicio_21 {

    public static void main(String[] args) {
        double celcius, faren;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese una temperatura en ° Celcios: ");
        celcius = lectura.nextDouble();
        faren = (9.0 / 5) * celcius + 32;
        System.out.println(celcius + "° Celcios son " + faren + "° Farenheit");
    }
}
