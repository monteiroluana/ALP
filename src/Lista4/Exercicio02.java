/*
Fazer uma função chamada somatoria que tem como parâmetro de entrada um número inteiro positivo
N e fornece como saída a soma de todos os números inteiros positivos menores ou iguais a N.
Exemplo: ​se N for 3, a função deve retornar 6, que é a soma de 1 + 2 + 3.

 */
package Lista4;
//@Monteiro

import java.util.Scanner;

public class Exercicio02 {

    static int entradaDeDados() {
        Scanner console = new Scanner(System.in);
        System.out.print("N: ");
        int n = console.nextInt();
        return n;
    }

    static int somatoria(int n) {
        int soma = 0;
        for (int i = 0; i <= n; i++) {
            soma = soma + i;
        }
        return soma;
    }

    public static void main(String[] args) {
        int numero = entradaDeDados();
        int soma = somatoria(numero);
        System.out.println(soma);
    }
}
