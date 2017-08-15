
package alp_5_Matrizes;
//@Monteiro

import java.util.Scanner;

public class Exemple {

    static Scanner console = new Scanner(System.in);

    static int sizeMatriz() {
        int t;
        System.out.print("Matriz size: ");
        t = console.nextInt();
        return t;
    }

    static int[][] createMatriz(int line, int colun) {
        System.out.println("Create Matriz");
        int[][] matriz = new int[line][colun];
        return matriz;
    }

    static int[][] populaMatriz(int[][] matriz) {
        System.out.println("Popula Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Matriz[%d][%d]: ", i, j);
                matriz[i][j] = console.nextInt();
            }
        }
        return matriz;
    }

    static void printMatriz(int matriz[][]) {
        System.out.println("Print Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Matriz[%d][%d]: %d\n", i, j, matriz[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        int linha = sizeMatriz();
        int coluna = sizeMatriz();
        int[][] matriz = createMatriz(linha, coluna);
        matriz = populaMatriz(matriz);
        printMatriz(matriz);
    }

}
