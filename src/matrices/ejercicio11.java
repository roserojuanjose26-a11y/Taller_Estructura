package matrices;

import java.util.*;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        
        System.out.print("Filas (m): "); int m = scanner.nextInt();
        System.out.print("Columnas (n): "); int n = scanner.nextInt();
        
        int[][] matriz = new int[m][n];
        for(int i=0; i<m; i++) 
            for(int j=0; j<n; j++) matriz[i][j] = rd.nextInt(50);

        System.out.print("Número a buscar: ");
        int buscar = scanner.nextInt();
        
        boolean encontrado = false;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matriz[i][j] == buscar) {
                    System.out.println("Encontrado en posición: [" + i + "][" + j + "]");
                    encontrado = true;
                    break; 
                }
            }
            if(encontrado) break;
        }
        if(!encontrado) System.out.println("El número no se encuentra en la matriz.");
        scanner.close();
    }
    
}