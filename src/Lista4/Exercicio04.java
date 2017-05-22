/*
Fazer um programa que lê um número inteiro positivo N e imprime a divisão do produto dos n primeiros
números positivos pela soma dos n primeiros números positivos.
Em outras palavras, você deve dividir o fatorial pela somatoria do número. Obrigatório utilizar as
funções elaboradas nos exercícios 2 e 3.

 */
package Lista4;
//@Monteiro

import java.util.Scanner;

public class Exercicio04 {

    static int entradaDeDados() {
        Scanner console = new Scanner(System.in);
        System.out.print("Número: ");
        int n = console.nextInt();
        return n;
    }

    static int fatorial(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }
        return fatorial;
    }

    static int somatoria(int n) {
        int soma = 0;
        for (int i = 0; i <= n; i++) {
            soma = soma + i;
        }
        return soma;
    }

    static int divisao(int n1, int n2) {
        int resultado = n1 / n2;
        return resultado;
    }

    public static void main(String[] args) {
        int numero = entradaDeDados();
        int n1F = fatorial(numero);
        int n2S = somatoria(numero);
        int resultDivisao = divisao(n1F, n2S);

        System.out.println("Resultado = " + resultDivisao);
    }
}
