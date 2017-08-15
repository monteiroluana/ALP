/*
 Dado um vetor​ de números inteiros, fazer um programa que imprima a média dos elementos do vetor.
 */
package Lista5;
//@Monteiro

import java.util.Scanner;

public class Exercicio05 {

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

    static void mediaElementos(int[] vetor, int l) {
        int media, soma = 0;
        int t = vetor.length;
        System.out.println(t);
        for (int i = 0; i < t; i++) {
            soma = soma + vetor[i];
        }
        media = soma / t;
        System.out.println("Média dos elementos da Matriz: " + media);

    }

    public static void main(String[] args) {
        System.out.println("TAMANHO DO VETOR");
        int linha = sizeVetor();
        int vetor[] = createVetor(linha);
        vetor = populaVetor(vetor);
        mediaElementos(vetor, linha);

    }

}
