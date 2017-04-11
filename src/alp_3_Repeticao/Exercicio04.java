/*
Use o laço while para ler 06 valores do usuário. Ao final do laço, imprimir:
1. Soma de todos os valores digitados que foram positivos;
2. Quantidade de valores digitados que foram positivos.
3. Média (decimal) de todos os valores digitados que foram positivos
 */
package alp_3_Repeticao;
//@Monteiro

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        int valor, soma = 0, positivo = 0;
        double media=0;
        Scanner console = new Scanner(System.in);

        for (int i = 1; i <=6; i++) {
            System.out.print("Insira o valor "+i+" :");
            valor = console.nextInt();
            if (valor > 0) {
                soma = soma + valor;
                positivo++;
                /*Convertendo para double*/
                media = (double) soma/positivo;
            }
        }
        System.out.println("Soma dos valores positivos = "+soma);
        System.out.println(positivo+" dos valores digitados foram posit1ivos!");
        System.out.printf("Média dos valores positivos: %.2f",media);
    }
}
