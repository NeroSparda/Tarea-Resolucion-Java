package ejercicio_2.pkg8;

import java.util.Scanner;

public class Ejercicio_28 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el GMT correspondiente: ");
        int GMT = lectura.nextInt();
        long miliSeg = System.currentTimeMillis();
        long totSeg = miliSeg / 1000;
        long seg = totSeg % 60;
        long totMin = totSeg / 60;
        long min = totMin % 60;
        long totHoras = totMin / 60;
        long horas = totHoras % 24;
        horas += GMT;
        if (horas < 0) {
            horas += 12;
        }
        if (horas > 23) {
            horas -= 12;
        }
        System.out.println("Hora actual: " + horas + ":" + min + ":" + seg);
    }
}
