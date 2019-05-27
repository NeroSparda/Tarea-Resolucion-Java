package ejercicio_2.pkg17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio_217 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        DecimalFormat salida = new DecimalFormat("#.00000");
        double twind, rep1 = 0, tamb, rep2 = 0, vwind;
        System.out.println("Ingrese una temperatura entre -58°F y 41°F");
        do {
            if (rep1 > 0) {
                System.out.println("Error: Ingrese un valor adecuado");
            }
            tamb = lectura.nextDouble();
            if (tamb < -58 || tamb > 41) {
                rep1++;
            }
        } while (tamb < -58 || tamb > 41);
        System.out.println("Ingrese una velocidad mayor o igual que 2 millas por hora");
        do {
            if (rep2 > 0) {
                System.out.println("Error: Ingrese un valor adecuado");
            }
            vwind = lectura.nextDouble();
            if (vwind < 2) {
                rep2++;
            }
        } while (vwind < 2);
        twind = 35.74 + 0.6215 * tamb - 35.75 * Math.pow(vwind, 0.16) + 0.4275 * tamb * Math.pow(vwind, 0.16);
        System.out.println("La temperatura percibida es de: " + salida.format(twind));
    }
}
