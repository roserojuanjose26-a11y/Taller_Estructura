package arreglos;

public class ejercicio2 {
    public static void main(String[] args) {
        int[] pares = new int[100];

        // 1. Llenado del arreglo (Lógica de negocio)
        for (int i = 0; i < 100; i++) {
            pares[i] = (i + 1) * 2;
        }

        // 2. Impresión en una sola línea
        System.out.println("--- Impresión en una línea ---");
        for (int n : pares) System.out.print(n + " ");

        // 3. Impresión en 10 líneas (10 números por línea)
        System.out.println("\n\n--- Impresión en 10 líneas ---");
        for (int i = 0; i < pares.length; i++) {
            if (i % 10 == 0) System.out.print("\nLínea " + ((i/10) + 1) + ": ");
            System.out.print(pares[i] + " ");
        }
    }
}