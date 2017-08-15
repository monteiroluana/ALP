/*
Dado um vetor de números inteiros, fazer um programa que imprime todos os elementos do vetor
 */
package Lista5;
//@Monteiro

import java.util.Scanner;

public class Exercicio01 {

    static Scanner console = new Scanner(System.in);

    static int sizeVetor() {
        System.out.print("Size: ");
        int t = console.nextInt();
        return t;
    }

    static int[] createVetor(int line) {
        int[] vetor = new int[line];
        return vetor;
    }

    static int[] populaVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Vetor[%d]: ", i);
            vetor[i] = console.nextInt();
        }
        return vetor;
    }

    static void imprimirElementos(int[] vetor) {
        System.out.println("Imprimindo a matriz");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Matriz[%d]: %d\n", i,vetor[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("TAMANHO DO VETOR");
        int linha = sizeVetor();
        int vetor[] = createVetor(linha);
        imprimirElementos(vetor);
    }
}
