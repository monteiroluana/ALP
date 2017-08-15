/*
Dado um vetor de números reais, fazer um programa que some todos os elementos do vetor e imprima o
resultado.

 */
package Lista5;
//@Monteiro

import java.util.Scanner;

public class Exercicio02 {
    
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
    
    static int somaElementos(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        return soma;
    }
    
    public static void main(String[] args) {
        System.out.println("TAMANHO DO VETOR");
        int linha = sizeVetor();
        int[] vetor = createVetor(linha);
        vetor = populaVetor(vetor);
        int soma = somaElementos(vetor);
        System.out.println("Soma dos elementos: " + soma);
    }
}
