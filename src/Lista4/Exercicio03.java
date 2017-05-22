/*
Fazer uma função chamada fatorial que tem como parâmetro de entrada um número inteiro positivo n
e fornece como saída o fatorial desse número.
Exemplo:​ se N for 5, a função deve retornar 120, que é a multiplicação de 1 * 2 * 3 * 4 * 5

 */
package Lista4;
//@Monteiro

import java.util.Scanner;

public class Exercicio03 {

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

    public static void main(String[] args) {
        int num = entradaDeDados();
        int fatorial = fatorial(num);
        System.out.println(num+"! é igual a "+fatorial);
    }
}
