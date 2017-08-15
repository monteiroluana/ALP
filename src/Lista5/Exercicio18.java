/*
Fazer um programa que verifica se determinado número dado está dentro de um ​vetor também dado. 
Caso esteja, imprimir a posição em que o número foi encontrado. 
 */
package Lista5;
//@Monteiro

import java.util.Scanner;

public class Exercicio18 {

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

    static void printPosicao(int[] vetor, int num) {
        System.out.println("\nNÚMERO ENCONTRADO");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == num) {
                System.out.printf("Vetor[%d]\n",i);
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("TAMANHO VETOR");
        int tamanho = sizeVetor();
        int []vetor=createVetor(tamanho);
        
        System.out.print("NÚMERO: ");
        int num = console.nextInt();
        
        vetor=populaVetor(vetor);
        printPosicao(vetor, num);
        
    }
}
