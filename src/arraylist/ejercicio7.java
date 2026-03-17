package arraylist;

import java.util.*;

public class ejercicio7 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 20; i++) lista.add(i * 2);

        System.out.println("Original: " + lista);
        Scanner scanner = new Scanner(System.in);

        // Inserción
        System.out.print("Número a insertar: ");
        int nuevo = scanner.nextInt();
        int pos = 0;
        while (pos < lista.size() && lista.get(pos) < nuevo) pos++;
        lista.add(pos, nuevo);
        System.out.println("Tras insertar: " + lista);

        // Borrado
        System.out.print("Número a borrar: ");
        int borrar = scanner.nextInt();
        lista.remove(Integer.valueOf(borrar));
        System.out.println("Final: " + lista);
        scanner.close();
    }
}
