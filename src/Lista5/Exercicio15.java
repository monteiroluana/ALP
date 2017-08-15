/*
Dado um ​vetor​ de números inteiros, fazer um programa que imprima o vetor em ordem crescente
 */
package Lista5;
//@Monteiro

import java.util.Scanner;

public class Exercicio15 {

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

//    static int ordemCrescente(int[] vetor) {
//        int menor = vetor[0];
//
//        for (int i = 0; i <= vetor.length; i++) {
//            if (vetor[i] < menor) {
//
//                menor = vetor[i];
//
//            }
//        }
//        System.out.println("menor: "+menor);
//        return menor;
//    }
//
//    static void printVetor(int[] vetor) {
//        for (int i = 0; i <= vetor.length; i++) {
//            System.out.printf("Matriz[%d]: %d ", i, vetor[i]);
//        }
//        
//    }

    public static void main(String[] args) {
        System.out.println("TAMANHO VETOR");
        int tamanho = sizeVetor();

        System.out.println("\nVETOR");
        int[] vetor = createVetor(tamanho);
        vetor = populaVetor(vetor);
//        ordemCrescente(vetor);
//        printVetor(vetor);
    }
}
