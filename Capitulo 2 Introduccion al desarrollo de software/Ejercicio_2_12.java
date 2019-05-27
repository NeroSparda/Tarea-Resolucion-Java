package ejercicio_2.pkg12;

import java.util.Scanner;

public class Ejercicio_212 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese la velocidad y aceleración: ");
        double v = lectura.nextDouble();
        v *= v;
        double a = lectura.nextDouble();
        double min = v / (2 * a);
        System.out.println("La distancia mínima que necesita recorrer el avión"
                + "para despegar es de: " + min + " metros.");
    }
}
