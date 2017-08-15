/*
Dada uma ​matriz de tamanho N x M, de números inteiros, fazer um programa que preenche e imprime
cada elemento da matriz com o número 21, se a linha for ímpar, e com 10 se a linha for par 
 */
package Lista5;
//@Monteiro

import java.util.Scanner;

public class Exercicio23 {

    static Scanner console = new Scanner(System.in);

    /*MATRIZ*/
    static int sizeMatriz() {
        System.out.print("Size: ");
        int t = console.nextInt();
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

                if (i % 2 == 0) {
                    matriz[i][j] = 10;//Posicao par
                } else {
                    matriz[i][j] = 21;//Posição impar
                }

            }
        }
        return matriz;
    }

    static void printMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Matriz[%d][%d]: %d\n", i, j, matriz[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("LINHA");
        int l = sizeMatriz();
        System.out.println("COLUNA");
        int c = sizeMatriz();

        int[][] matriz = createMatriz(l, c);
        matriz = populaMatriz(matriz);
        printMatriz(matriz);
    }

}
