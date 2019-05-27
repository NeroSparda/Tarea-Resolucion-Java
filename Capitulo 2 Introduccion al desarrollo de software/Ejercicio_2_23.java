package ejercicio_2.pkg23;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio_223 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        DecimalFormat salida = new DecimalFormat("#.00");
        System.out.println("Introduza la distancia a conducir: ");
        double distancia = lectura.nextDouble();
        System.out.println("Introduza la eficiencia (millas por galón): ");
        double eficiencia = lectura.nextDouble();
        System.out.println("Introduza el precio por galón: ");
        double precio = lectura.nextDouble();
        double gasto=distancia*precio/eficiencia;
        System.out.println("El costo de conducir es de: $" + salida.format(gasto));
    }
}
