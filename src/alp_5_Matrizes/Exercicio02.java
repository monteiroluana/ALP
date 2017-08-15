/*
 Faça um programa para caulcular a transposta de uma matriz.
 */
package alp_5_Matrizes;
//@Monteiro

import java.util.Scanner;

public class Exercicio02 {

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

    static int[][] transposta(int matriz[][], int[][] transposta) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        return transposta;
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
        int l = sizeMatriz();
        int c = sizeMatriz();
        int matriz[][] = createMatriz(l, c);
        int matrizTransposta[][] = createMatriz(c, l);
        matriz = populaMatriz(matriz);
        matrizTransposta = transposta(matriz, matrizTransposta);
        printMatriz(matrizTransposta);

    }

}
