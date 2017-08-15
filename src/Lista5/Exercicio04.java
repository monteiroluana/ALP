/*
Dado um vetor​ de números reais, fazer um programa que imprima o menor elemento do vetor.
 */
package Lista5;
//@Monteiro

import java.util.Scanner;

public class Exercicio04 {

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

    static void menorElemento(int[] vetor) {
        int menor = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
            System.out.println("MENOR ELEMENTO: " + menor);
    }

   

    public static void main(String[] args) {
        System.out.println("TAMANHO DO VETOR");
        int linha = sizeVetor();
        int[] vetor = createVetor(linha);
        vetor = populaVetor(vetor);
        menorElemento(vetor);

    }
}
