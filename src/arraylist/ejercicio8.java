package arraylist;

import java.util.*;

public class ejercicio8 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 100; i++) lista.add(rd.nextInt(20) + 1);

        int[] frec = new int[21]; // Índice 1 al 20
        for (int n : lista) frec[n]++;

        System.out.println("Número\t| Frecuencia");
        int moda = 1;
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + "\t| " + frec[i]);
            if (frec[i] > frec[moda]) moda = i;
        }
        System.out.println("\nEl número que más se repite es: " + moda);
    }
}