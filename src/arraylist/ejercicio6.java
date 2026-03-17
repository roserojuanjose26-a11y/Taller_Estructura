package arraylist;

import java.util.*;

public class ejercicio6 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random rd = new Random();
        int num;

        // Leer hasta encontrar el 10
        do {
            num = rd.nextInt(21) - 10; // Rango -10 a 10
            lista.add(num);
        } while (num != 10);

        int suma = 0;
        for (int n : lista) suma += n;
        double media = (double) suma / lista.size();

        System.out.println("Lista: " + lista);
        System.out.println("Suma: " + suma + " | Media: " + media);
    }
}