/*
Faça um programa que leia um número N do usuário, some todos os números inteiros 
de 1 a N, e mostre o resultado obtido. ​Use o laço WHILE
 */
package Lista3;
//@Monteiro

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Número: ");
        int N = console.nextInt();

        int i = 1, soma = 0;
        while (i <= N) {
            soma = soma + i;

            System.out.print(i + " + ");

            i++;
        }
        System.out.println("");
        System.out.println("Resultado: " + soma);
    }

}
