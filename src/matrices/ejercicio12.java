package matrices;

import java.util.Random;

public class ejercicio12 {
    public static void main(String[] args) {
        int n = 5; // Tamaño n x n
        int[][] matriz = new int[n][n];
        Random rd = new Random();
        int sumaOpuesta = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                matriz[i][j] = rd.nextInt(101) - 50;
                // Lógica diagonal opuesta
                if (j == (n - 1) - i) sumaOpuesta += matriz[i][j];
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nSumatoria diagonal opuesta: " + sumaOpuesta);
    }
}