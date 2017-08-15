/*
Dado um ​vetor​ de números inteiros e um número inteiro, fazer um programa que multiplique 
todos os elementos do vetor pelo número real dado e imprima o resultado. 
 */
package Lista5;
//@Monteiro

import java.util.Scanner;

public class Exercicio07 {

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

    static int[] multElementos(int[] vetor, int num) {
        int[] mult = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            mult[i] = vetor[i] * num;
        }
        return mult;
    }

    static void imprimirVetor(int[] mult) {
        for (int i = 0; i < mult.length; i++) {
            System.out.printf("Vetor[%d]: %d\n", i, mult[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("NÚMERO ");
        int num = sizeVetor();
        System.out.println("");
        
        System.out.println("TAMANHO DO VETOR");
        int tamanho = sizeVetor();
        int[] vetor = createVetor(tamanho);
        vetor = populaVetor(vetor);

        int[] mult = createVetor(tamanho);
        mult = multElementos(vetor, num);
        imprimirVetor(mult);
    }
}
