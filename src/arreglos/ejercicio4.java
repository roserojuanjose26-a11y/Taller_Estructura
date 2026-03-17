package arreglos;

import java.util.Random;

public class ejercicio4 {
    public static void main(String[] args) {
        int[] datos = new int[25];
        Random rd = new Random();

        for (int i = 0; i < 25; i++) {
            datos[i] = rd.nextInt(101) - 50; // Rango [-50, 50]
        }

        int min = datos[0], max = datos[0];
        for (int d : datos) {
            System.out.print(d + " ");
            if (d < min) min = d;
            if (d > max) max = d;
        }

        System.out.println("\n\nMenor: " + min + " | Mayor: " + max);
    }
}