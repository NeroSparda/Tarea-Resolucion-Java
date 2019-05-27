package ejercicio_2.pkg20;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio_220 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        DecimalFormat salida = new DecimalFormat("#.00000");
        System.out.println("Ingrese el balance en la cuenta y el interés anual en %: ");
        double balance = lectura.nextDouble();
        double interés = lectura.nextDouble();
        double total = balance * (interés / 1200);
        System.out.println("El interés del siguiente mes es: " + salida.format(total));
    }
}
