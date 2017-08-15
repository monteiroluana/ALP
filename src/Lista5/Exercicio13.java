/*
Dados dois​vetores A e B de mesma dimensão, fazer um programa que monte o vetor C, o qual deve ser              
composto pelos elementos do vetor A e depois pelos elementos do vetor B. Imprimir o vetor C. 
 */
package Lista5;
//@Monteiro

import java.util.Scanner;

public class Exercicio13 {

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

    static int[] populaVetorC(int[] vetorA, int[] vetorB, int[] vetorC) {
        int tamanho = vetorA.length + vetorB.length;
        int i, j = 0;
        for (i = 0; i < tamanho; i++) {
            if (i < vetorA.length) {
                vetorC[i] = vetorA[i];

            } else {
                vetorC[i] = vetorB[j];
                j++;
            }
        }
        return vetorC;
    }

    static void printVetorC(int[] vetorC) {
        for (int i = 0; i < vetorC.length; i++) {
            System.out.printf("vetorC[%d]: %d\n", i, vetorC[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("TAMANHO VETOR(A)/VETOR(B)");
        int tamanho = sizeVetor();
        int[] vetorA = createVetor(tamanho);
        int[] vetorB = createVetor(tamanho);
        System.out.println("MATRIZ(A)");
        vetorA = populaVetor(vetorA);
        System.out.println("MATRIZ(B)");
        vetorB = populaVetor(vetorB);

        int[] vetorC = new int[tamanho * 2];
        System.out.println("MATRIZ(C)");
        vetorC = populaVetorC(vetorA, vetorB, vetorC);
        printVetorC(vetorC);

    }
}
