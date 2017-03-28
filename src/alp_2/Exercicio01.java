/*
27_03_2017
Dado um número, verificar se ele é maior que 100. Se for, o 
algoritmo deve somar 150 a esse número. No final, imprimir o resultado da soma.
*/
package alp_2;
//@Monteiro

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        /*Entrada*/

        Scanner console = new Scanner(System.in);
        System.out.print("Número: ");
        int num = console.nextInt();

        /*Processamento*/
        int soma;
        if (num > 100) {
            soma = num + 150;
            System.out.println(soma);
        } else {
            System.out.println("Número dado é menor que 100");
        }
    }
}
