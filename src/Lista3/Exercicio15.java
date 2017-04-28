/*
Faça um programa que leia um número inteiro N maior do que zero e calcule o fatorial desse número. 
Fatorial de N é representado por N! 

Utilize o laço que lhe for mais conveniente. 
 */
package Lista3;
//@Monteiro

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        int fatorial = 1;

        Scanner console = new Scanner(System.in);
        System.out.print("N: ");
        int N = console.nextInt();

        for (int i = N; i >= 1; i--) {
            fatorial = fatorial * i;
        }
        System.out.println(N+"!  é "+fatorial);
    }
}
