/*
Dados dois​ vetores A e B de mesma dimensão, fazer um programa que monte o vetor C, o qual deve ser 
composto, ​alternadamente​, por um elemento do vetor A e outro do vetor B. Imprimir o vetor C
 */
package Lista5;
//@Monteiro

import java.util.Scanner;

public class Exercicio14 {

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
        int a = 0, b = 0;
        for (int i = 0; i < vetorC.length; i++) {
            if (i % 2 == 0) {
                vetorC[i] = vetorA[a];
                a++;
            } else {
                vetorC[i] = vetorB[b];
                b++;
            }
        }
        return vetorC;
    }

    static void printVetorC(int[] vetorC) {
        System.out.println("\nVETOR(C)");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.printf("vetorC[%d]: %d\n",i,vetorC[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("TAMANHO VETOR(A)/VETOR(B)");
        int tamanho = sizeVetor();

        System.out.println("\nVETOR(A)");
        int[] vetorA = createVetor(tamanho);
        vetorA = populaVetor(vetorA);

        System.out.println("\nVETOR(B)");
        int[] vetorB = createVetor(tamanho);
        vetorB = populaVetor(vetorB);

        int[] vetorC = createVetor(tamanho * 2);
        vetorC=populaVetorC(vetorA, vetorB, vetorC);
        printVetorC(vetorC);
    }
}
