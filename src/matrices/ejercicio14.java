package matrices;

public class ejercicio14 {
    public static void main(String[] args) {
        int[][] original = {{1, 2, 3}, {4, 5, 6}}; // 2x3
        int m = original.length;
        int n = original[0].length;
        int[][] trans = new int[n][m];

        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++) trans[j][i] = original[i][j];

        System.out.println("Original:");
        imprimir(original);
        System.out.println("Transpuesta:");
        imprimir(trans);
    }

    private static void imprimir(int[][] mat) {
        for(int[] fila : mat) {
            for(int v : fila) System.out.print(v + " ");
            System.out.println();
        }
    }
}