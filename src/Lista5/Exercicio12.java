/*
Dados dois​vetores A e B de mesma dimensão, fazer um programa que verifica a soma e a média de cada 
vetor, e imprime a maior soma e a menor média
 */
package Lista5;
//@Monteiro

import java.util.Scanner;

public class Exercicio12 {

    static Scanner console = new Scanner(System.in);

    static int sizeVetor() {
        System.out.print("Size: ");
        int t = console.nextInt();
        return t;
    }

    static double[] createVetor(int line) {
        double[] vetor = new double[line];
        return vetor;
    }

    static double[] populaVetor(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Vetor[%d]: ", i);
            vetor[i] = console.nextInt();
        }
        return vetor;
    }

    static void maiorSoma(double[] vetorA, double[] vetorB) {
        double somaA = 0;
        double somaB = 0;

        for (int i = 0; i < vetorA.length; i++) {
            somaA = somaA + vetorA[i];
        }

        for (int i = 0; i < vetorB.length; i++) {
            somaB = somaB + vetorB[i];
        }

        if (somaA > somaB) {
            System.out.println("VetorA possui a maior soma: " + somaA);
        } else {
            System.out.println("VetorB possui a maior soma: " + somaB);
        }

    }

    static void menorMedia(double[] vetorA, double[] vetorB) {
        double somaA = 0, mediaA;
        double somaB = 0, mediaB;

        for (int i = 0; i < vetorA.length; i++) {
            somaA = somaA + vetorA[i];
        }

        for (int i = 0; i < vetorB.length; i++) {
            somaB = somaB + vetorB[i];
        }

        mediaA = somaA / vetorA.length;
        mediaB = somaB / vetorB.length;

        if (mediaA < mediaB) {
            System.out.println("O vetorA possui a menor média: " + mediaA);
        } else {
            System.out.println("O vetorB possui a menor média: " + mediaB);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("TAMANHO VETOR(A)/VETOR(B) ");
        int tamanho = sizeVetor();
        
        double []vetorA=createVetor(tamanho);
        double []vetorB=createVetor(tamanho);
        
        vetorA=populaVetor(vetorA);
        vetorB=populaVetor(vetorB);
        maiorSoma(vetorA, vetorB);
        menorMedia(vetorA, vetorB);
    }
}
