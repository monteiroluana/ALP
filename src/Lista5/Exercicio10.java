/*
Dado um​vetor de números reais e um número real, fazer um programa que multiplique os elementos de                  
posição ímpar do vetor pelo número real dado e imprima o resultado
 */
package Lista5;
//@Monteiro

import java.util.Scanner;

public class Exercicio10 {

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

    static void multiplicaElementos(double[] vetor, double num) {
        double mult;
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 != 0) {
                mult = vetor[i] * num;
                System.out.println(vetor[i]+" * "+ num+" = "+ mult);
                mult=0;
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("TAMANHO DO VETOR");
        int linha = sizeVetor();
        
        double[]vetor=createVetor(linha);
        vetor=populaVetor(vetor);
        
        System.out.print("\nNÚMERO: ");
        double num = console.nextDouble();
        
        multiplicaElementos(vetor, num);
    }
}
