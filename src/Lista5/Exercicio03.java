/*
Dado um vetor​ de números inteiros, fazer um programa que imprima o maior elemento do vetor
 */
package Lista5;
//@Monteiro

import java.util.Scanner;

public class Exercicio03 {

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

    static void maiorElemento(int[] vetor) {
        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println("MAIOR ELEMENTO: " + maior);
    }

    public static void main(String[] args) {
        System.out.println("TAMANHO DO VETOR");
        int linha = sizeVetor();
        int[] vetor = createVetor(linha);
        vetor = populaVetor(vetor);
        maiorElemento(vetor);
    }
}
