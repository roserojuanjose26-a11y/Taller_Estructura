package matrices;

import java.util.Random;

public class ejercicio13 {
    public static void main(String[] args) {
        int n = 3;
        int[][] mt = new int[n][n];
        Random rd = new Random();

        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++) mt[i][j] = rd.nextInt(10);

        boolean esSimetrica = true;
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                if(mt[i][j] != mt[j][i]) esSimetrica = false;

        System.out.println("Es simétrica: " + esSimetrica);
        System.out.println("Esquinas: " + mt[0][0] + ", " + mt[0][n-1] + ", " + mt[n-1][0] + ", " + mt[n-1][n-1]);
    }
}