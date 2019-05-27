package ejercicio_2.pkg14;

import java.util.Scanner;

public class Ejercicio_214 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el peso en libras: ");
        double peso = lectura.nextDouble();
        System.out.println("Ingrese la altura en pulgadas: ");
        double altura = lectura.nextDouble();
        peso *= 0.45359237;
        altura *= 0.0254;
        double BMI = peso / (altura * altura);
        System.out.println("El Índice de Masa Corportal es: " + BMI);
    }
}
