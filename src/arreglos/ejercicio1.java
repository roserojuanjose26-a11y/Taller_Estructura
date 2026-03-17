package arreglos;

public class ejercicio1 {
    public static void main(String[] args) {
        // Inicialización directa de los 10 primeros números primos
        int[] primos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        System.out.println("--- Punto 1: Arreglo de Números Primos ---");
        for (int p : primos) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}