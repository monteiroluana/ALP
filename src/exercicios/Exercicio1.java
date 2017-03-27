/*Fazer um algoritmo que leia dois números e imprima na tela o produto 
(multiplicação) dos dois números*/
package exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        int num1, num2, produto;

        Scanner console = new Scanner(System.in);

        //ENTRADAS
        System.out.println("Insira dois números para descobrir o produto");
        System.out.print("Coeficiente : ");
        num1 = console.nextInt();
        System.out.print("Operando : ");
        num2 = console.nextInt();
        
        //PROCESSAMENTO
        produto = num1 * num2;
        
        //SAIDA
        System.out.println("Produto: " + produto);

    }

}
