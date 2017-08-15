/*
Fazer um programa que imprime os elementos que estão nas posições ímpares de um​vetor (começando 
na posição 1, que corresponde à posição 0 em Java). Por exemplo, para o vetor [6, 8, 2, 3, 7, 1, 5, 3, 9],
seriam impressos os números: 6, 2, 7, 5, 9. 
 */
package Lista5;
//@Monteiro

import java.util.Scanner;

public class Exercicio19 {

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

    static void printImpares(int[] vetor) {
        System.out.println("ELEMENTOS NA POSIÇÃO IMPAR");
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                System.out.print(vetor[i]+", ");
            }
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        System.out.println("TAMANHO VETOR");
        int tamanho = sizeVetor();
        int []vetor=createVetor(tamanho);
        vetor=populaVetor(vetor);
        printImpares(vetor);
    }
}
