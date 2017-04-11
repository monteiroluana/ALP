/*
Leia um valor inteiro N do usuário, onde N é maior ou igual a 2 e menor ou igual a
1000.
A seguir, usando o laço DO-WHILE, mostre a tabuada de N no seguinte formato:
1 x N = N 2 x N = 2N ... 10 x N = 10N

 */
package alp_3_Repeticao;
//@Monteiro

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int numero = console.nextInt();

        if (numero >= 2 && numero <= 1000) {

            int i = 1;
            do {

                System.out.println(i + " * " + numero + " = " + i* numero);
                i++;

            } while (i <= 10);

        } else {
            System.out.println("Numero inválido");
            
        }

    }
}
