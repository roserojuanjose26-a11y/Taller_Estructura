package arreglos;

import java.util.Scanner;
import java.util.Random;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Cantidad de números (n): ");
        int n = scanner.nextInt();

        int[] base = new int[n];
        long[] fact = new long[n];

        for (int i = 0; i < n; i++) {
            base[i] = rd.nextInt(15); // Rango pequeño para evitar desbordamiento
            fact[i] = calcularFactorial(base[i]);
        }

        System.out.println("\nNúmero | Factorial");
        for (int i = 0; i < n; i++) {
            System.out.println(base[i] + " \t| " + fact[i]);
        }
        scanner.close();
    }

    private static long calcularFactorial(int num) {
        long f = 1;
        for (int i = 1; i <= num; i++) f *= i;
        return f;
    }
}