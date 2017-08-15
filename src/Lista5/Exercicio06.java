/*
Dado um ​vetor​ de números inteiros, fazer um programa que imprima o produto dos elementos do vetor. 
 */
package Lista5;
//@Monteiro

import java.util.Scanner;

public class Exercicio06 {

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
            System.out.printf("Vetor[%d]: \n", i);
            vetor[i] = console.nextInt();
        }
        return vetor;
    }

    static void produtoVetor(int[] vetor) {
        int produto = 1;
        for (int i = 0; i < vetor.length; i++) {
            produto = produto / vetor[i];
        }
        System.out.println("Produto: " + produto);
    }

    public static void main(String[] args) {
        System.out.print("TAMANHO DO VETOR ");
        int tamanhoVet = sizeVetor();
        int[] vetor = createVetor(tamanhoVet);
        vetor = populaVetor(vetor);
        produtoVetor(vetor);
    }
}
