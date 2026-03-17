package matrices;

import java.util.*;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Filas: "); int m = scanner.nextInt();
        System.out.print("Cols: "); int n = scanner.nextInt();
        
        int[][] mat = new int[m][n];
        Random rd = new Random();

        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++) mat[i][j] = rd.nextInt(10);

        System.out.println("Antes del intercambio:");
        imprimir(mat);

        if(m >= 2) {
            int[] temp = mat[0];
            mat[0] = mat[1];
            mat[1] = temp;
            System.out.println("\nDespués de intercambiar fila 1 y 2:");
            imprimir(mat);
        } else {
            System.out.println("Se necesitan al menos 2 filas.");
        }
        scanner.close();
    }

    private static void imprimir(int[][] mat) {
        for(int[] f : mat) {
            for(int v : f) System.out.print(v + " ");
            System.out.println();
        }
        
    }
   
}