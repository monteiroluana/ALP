/*
 Faça um programa para somar duas matrizes.
 */
package alp_5_Matrizes;

import java.util.Scanner;

public class Exercicio01 {

    static Scanner console = new Scanner(System.in);

    static int sizeMatriz() {
        int t;
        System.out.print("Size: ");
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

    static int[][] somaMatrizes(int[][] matrizA, int[][] matrizB, int linha, int coluna) {
        System.out.println("SOMANDO AS MATRIZES A e B");
        int[][] soma = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < soma[i].length; j++) {
                soma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return soma;

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
        System.out.println("Linha");
        int linha = sizeMatriz();
        System.out.println("Coluna");
        int coluna = sizeMatriz();

        int[][] matrizA = createMatriz(linha, coluna);
        int[][] matrizB = createMatriz(linha, coluna);
        int[][] somaMatriz = createMatriz(linha, coluna);

        System.out.println("Populando Matriz A");
        matrizA = populaMatriz(matrizA);
        matrizB = populaMatriz(matrizB);

        
        somaMatriz = somaMatrizes(matrizA, matrizB, linha, coluna);
        printMatriz(somaMatriz);
    }
}
