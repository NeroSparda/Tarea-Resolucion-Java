package ejercicio_2.pkg21;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio_221 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        DecimalFormat salida = new DecimalFormat("#.00");
        System.out.println("Ingrese la cantidad a invertir: ");
        double inversión = lectura.nextDouble();
        System.out.println("Ingrese el interés anual en %: ");
        double interés = lectura.nextDouble();
        interés /= 1200;
        System.out.println("Ingrese la cantidad de años: ");
        double años = lectura.nextDouble();
        double acumulado = inversión * Math.pow(1 + interés, años * 12);
        System.out.println("La cantidad acumulada es: $" + salida.format(acumulado));
    }
}
