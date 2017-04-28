/*
8. A seguinte sequência de números 0, 1, 1, 2, 3, 5, 8, 13, 21... é conhecida como série de Fibonacci. 
Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. 
Escreva um algoritmo que leia um inteiro N (onde N < 46) e mostre os N primeiros números dessa série.​

Utilize o laço que lhe for mais conveniente. 
 */
package Lista3;
//@Monteiro

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("N: ");
        int N = console.nextInt();

        int num1 = 1;
        int num2 = 0;

        if (N < 46) {

            System.out.println(num2);
            System.out.println(num1);

            for (int i = 0; i <=46; i++) {
                num1 = num1 + num2;
                num2 = num1 - num2;
                System.out.println(num1);
            }
        }
    }
}
