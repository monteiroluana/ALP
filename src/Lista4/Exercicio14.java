/*
Faça uma função que receba dois números inteiros: um valor A e um valor N. Imprimir a soma dos N
números a partir de A (inclusive). Se N for negativo ou ZERO, a função deve retornar -1.
Exemplo: se A for 3 e N for 2, o resultado deverá ser 7, pois é a soma de 3 + 4.

 */
package Lista4;
//@Monteiro

import java.util.Scanner;

public class Exercicio14 {

    static int entradaA() {
        Scanner console = new Scanner(System.in);
        System.out.print("A: ");
        int a = console.nextInt();
        return a;
    }

    static int entradaN() {
        Scanner console = new Scanner(System.in);
        System.out.print("N: ");
        int n = console.nextInt();
        return n;
    }

    static int soma(int a, int n) {
        int resultado = 0;

        if (n <= 0) {
            resultado = -1;
        } else {
            for (int i = n; i <= (n + a); i++) {
                resultado = n + i;
                System.out.println(resultado);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {

        int A = entradaA();
        int N =entradaN() ;

        int resultado = soma(A, N);
        System.out.println(resultado);
    }
}
