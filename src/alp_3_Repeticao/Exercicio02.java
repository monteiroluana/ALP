/*
Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha,
inclusive o X, se for o caso. Use o laço for.
 */
package alp_3_Repeticao;
//@Monteiro

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int x = console.nextInt();
       
       
        for (int i = 0; i <= x; i++) {
            
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
    }
}
