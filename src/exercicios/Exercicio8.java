/*
Fazer um algoritmo que leia quatro números e imprime a média aritmética​ dos quatro números
 */
package exercicios;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        int num1, num2, num3, num4, media;
        
        Scanner console = new Scanner(System.in);
        
        //ENTRADAS:
        System.out.print("Insira Num1: ");
        num1 = console.nextInt();
        System.out.print("Insira Num2: ");
        num2 = console.nextInt();
        System.out.print("Insira Num3: ");
        num3 = console.nextInt();
        System.out.print("Insira Num4: ");
        num4 = console.nextInt();

        //PROCESSAMENTO:
        media = (num1 + num2 + num3 + num4) / 4;
        System.out.println("Média Aritimética: " + media);
    }

}
