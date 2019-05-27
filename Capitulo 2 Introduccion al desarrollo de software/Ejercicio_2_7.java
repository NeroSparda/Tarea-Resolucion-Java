package ejercicio_2.pkg7;

import java.util.Scanner;

public class Ejercicio_27 {

    public static void main(String[] args) {
        int min, días, años;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese los minutos a transformar: ");
        min = lectura.nextInt();
        días = (min / (60 * 24));
        años = días / 365;
        días = (días % 365);
        System.out.println(min + " minutos son " + años + " años y " + días + " días");
    }

}
