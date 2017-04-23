/*
Faça um programa que leia um número natural N e calcule a soma abaixo 
(lembre-se de que tanto as divisões quanto o resultado devem ser decimais). ​
Utilize o laço que lhe for mais conveniente. ..S = 1 − 1/2 + 1/3 − 1/4 + 1/5 −... + 1/N 
 */
package Lista3;
//@Monteiro

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Insira um número natural: ");
        int N = console.nextInt();

        double s = 1.0, soma = 0, subtracao = 0;

        for (int i = 2; i <= N; i++) {

            
            /*Com base no teste de mesa
            1 - 1/2 + 1/3 - 1/4 `+ 1/5
            1 - 0,5 + 0,3 - 0,25 + 0,2
            
            soma = 0,5 + 0,25
            subtração = 0,3 - 0,2
            */
            if (i % 2 == 0) {
                soma = soma + (1d / i);

            } else {
                subtracao = subtracao - (1d / i);
            }


        }

        s = s - soma - subtracao;
        System.out.printf("Resultado: %.2f\n",s);
    }
}
