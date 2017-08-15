/*
Faça um programa que leia uma matriz "mat" de tamanho 4x4, e imprima na tela a
soma dos elementos abaixo da diagonal principal da matriz.
 */
package alp_5_Matrizes;
//@Monteiro

import java.util.Scanner;

public class Exercicio04 {

    static int[][] mat() {
        int[][] matriz = new int[4][4];
        return matriz;
    }

    static int[][] populaMatriz(int[][] matriz) {
        Scanner console = new Scanner(System.in);
        System.out.println("Popula Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Matriz[%d][%d]: ", i, j);
                matriz[i][j] = console.nextInt();
            }
        }
        return matriz;
    }

    static int somaElementos(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (i == j) {
                    soma = soma + matriz[i][j];
                }
            }
        }

        return soma;
    }

    static void printSoma(int soma) {
        System.out.println("Soma dos elementos da diagona da matriz = " + soma);

    }
     public static void main(String[] args) {
        int[][] matriz = mat();
        matriz = populaMatriz(matriz);
        int somaElementos = somaElementos(matriz);
        printSoma(somaElementos);
    }
    
}
