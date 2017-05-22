/*
Fazer uma função que tem como parâmetro de entrada três números inteiros a, b, c e devolve (retorna)
menor​ dentre os três números.

 */
package Lista4;
//@Monteiro

import java.util.Scanner;

public class Exercicio01 {

    static int entradaDeDados() {
        Scanner console = new Scanner(System.in);
        System.out.print("Número: ");
        int numero = console.nextInt();

        return numero;
    }

    static int menorNumero(int a, int b, int c) {
        int menor;
        if (a < b && a < c) {
            menor = a;
        } else if (b < a && b < c) {
            menor = b;
        } else {
            menor = c;
        }
        return menor;
    }

    public static void main(String[] args) {
        int a = entradaDeDados();
        int b = entradaDeDados();
        int c = entradaDeDados();
        int menorNumero = menorNumero(a, b, c);
        System.out.println(menorNumero+" é o menor número");
    }
}
