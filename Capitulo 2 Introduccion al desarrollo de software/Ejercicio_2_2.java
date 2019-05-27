package ejercicio_2.pkg2;

import java.util.Scanner;

public class Ejercicio_22 {

    public static void main(String[] args) {
        double r, h, áreab, vol;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el radio y altura de un cilindro: ");
        r = lectura.nextDouble();
        h = lectura.nextDouble();
        áreab = Math.PI * (r * r);
        vol = áreab * h;
        System.out.println("Área: " + áreab);
        System.out.println("Volumen: " + vol);
    }
}
