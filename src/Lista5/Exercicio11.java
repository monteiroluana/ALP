/*
Dado um ​vetor de números reais, fazer um programa que imprima os números maiores do que a média               
dos elementos que estão nas posições pares do vetor.
 */
package Lista5;
//@Monteiro

import java.util.Scanner;

public class Exercicio11 {
    
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
    
    static double mediaPosicaoPar(double[] vetor) {
        double soma = 0;
        int x = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                soma = soma + vetor[i];
                x++;
            }
        }
        double media = soma / x;
        return media;
    }
    
    static void numerosMaioresQueAMedia(double[] vetor, double media) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.println(vetor[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("TAMANHO DO VETOR");
        int linha = sizeVetor();
        double[] vetor = createVetor(linha);
        vetor = populaVetor(vetor);
        double media = mediaPosicaoPar(vetor);//Media dos elementos na posição par do vetor
        numerosMaioresQueAMedia(vetor, media);//numero maior que a media
    }
}
