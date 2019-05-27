package ejercicio_2.pkg11;

import java.util.Scanner;

public class Ejercicio_211 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de años: ");
        int years = lectura.nextInt();
        long tiempo = (years * 365 * 24 * 60 * 60);
        long birth = tiempo / 7;
        long death = tiempo / 13;
        long inmi = tiempo / 45;
        long población = 312032486 + birth + inmi - death;
        System.out.println("Población en " + years + " años: " + población);
    }
}
