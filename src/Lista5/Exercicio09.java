/*
Dados dois vetores A e B de mesma dimensão, fazer um programa que calcule e imprima o produto de
cada elemento de A pelo correspondente elemento de B. O resultado deve ser armazenado em um vetor
C.

 */
package Lista5;
//@Monteiro

import java.util.Scanner;

public class Exercicio09 {

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

    static int[] produtoVetores(int[] vA, int[] vB, int[] vC) {
        for (int i = 0; i < vA.length; i++) {
            vC[i] = vA[i] * vB[i];
        }
        return vC;
    }

    static void imprimir(int[] vC) {
        for (int i = 0; i < vC.length; i++) {
            System.out.printf("Vetor[%d]: %d\n", i, vC[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("TAMANHO DOS VETORES");
        int tamanho = sizeVetor();

        System.out.println("\nVetor A");
        int[] vetorA = createVetor(tamanho);
        vetorA = populaVetor(vetorA);

        System.out.println("\nVetor B");
        int[] vetorB = createVetor(tamanho);
        vetorB = populaVetor(vetorB);

        System.out.println("\nVetor C");
        int[] vetorC = createVetor(tamanho);
        vetorC = produtoVetores(vetorA, vetorB, vetorC);

        imprimir(vetorC);
    }
}
