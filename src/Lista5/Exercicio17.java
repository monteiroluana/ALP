/*
Dado um ​vetor de números reais e um número real, fazer um programa que multiplique todos os
elementos do vetor pelo número real dado e imprima o resultado. 
 */
package Lista5;
//@Monteiro

import java.util.Scanner;

public class Exercicio17 {

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

    static double[] multVetor(double[] vetor, double num) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vetor[i] * num;
        }
        return vetor;
    }

    static void printVetor(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor["+i+"]: "+vetor[i]);
        }

    }

    public static void main(String[] args) {
        System.out.println("TAMANHO DO VETOR");
        int linha = sizeVetor();

        System.out.print("NÚMERO: ");
        double num = console.nextDouble();

        double[] vetor = createVetor(linha);
        vetor = populaVetor(vetor);

        vetor = multVetor(vetor, num);
        System.out.println("\nMULTIPLICADO");
        printVetor(vetor);
    }
}
