package arreglos;

import java.util.Random;

public class ejercicio5 {
    public static void main(String[] args) {
        int[] orig = new int[20];
        int[] inv = new int[20];
        Random rd = new Random();

        for (int i = 0; i < 20; i++) {
            orig[i] = rd.nextInt(900) + 100; // Números de 3 cifras
            inv[i] = invertir(orig[i]);
        }

        System.out.println("Original -> Invertido");
        for (int i = 0; i < 20; i++) {
            System.out.println(orig[i] + " \t -> " + inv[i]);
        }
    }

    private static int invertir(int n) {
        int res = 0;
        while (n != 0) {
            res = (res * 10) + (n % 10);
            n /= 10;
        }
        return res;
    }
}