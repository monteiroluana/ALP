/*
Faça um programa que leia a matriz "mat" de tamanho 2x3 e imprima na tela a soma de todos os elementos da matriz.
 */
package alp_5_Matrizes;
//@Monteiro

import java.util.Scanner;

public class Exercicio03 {

    static int[][] mat() {
        int[][] matriz = new int[2][3];
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
                soma = soma + matriz[i][j];
            }
        }

        return soma;
    }

    static void printSoma(int soma) {
        System.out.println("Soma dos elementos = " + soma);

    }

    public static void main(String[] args) {
        int[][] matriz = mat();
        matriz = populaMatriz(matriz);
        int somaElementos = somaElementos(matriz);
        printSoma(somaElementos);
    }

}
