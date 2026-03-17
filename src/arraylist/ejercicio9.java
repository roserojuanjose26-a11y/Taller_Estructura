package arraylist;

import java.util.*;

public class Punto9 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 20; i++) lista.add(rd.nextInt(100) + 1);

        Collections.sort(lista);
        System.out.println("Menor a Mayor: " + lista);
        
        Collections.reverse(lista);
        System.out.println("Mayor a Menor: " + lista);

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int n : lista) {
            if (n % 2 == 0) pares.add(n);
            else impares.add(n);
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}