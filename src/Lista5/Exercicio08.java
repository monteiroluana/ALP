/*
Dado um​vetor de números inteiros e um número inteiro, fazer um programa que verifique se o número
está presente no vetor.  
 */
package Lista5;
//@Monteiro

import java.util.Scanner;

public class Exercicio08 {

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

    static void verificandoNum(int[] vetor, int num) {
        boolean presente = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == num) {
                presente = true;
            } else {
                presente = false;
            }
        }
        System.out.println("O número [" + num + "] está no vetor? :" + presente);
    }

    public static void main(String[] args) {
        System.out.println("TAMANHO DO VETOR");
        int size = sizeVetor();
        int[] vetor = createVetor(size);
        vetor = populaVetor(vetor);

        System.out.print("\nNúmero para pesquisar no vetor: ");
        int numero = console.nextInt();
        verificandoNum(vetor, numero);

    }
}
