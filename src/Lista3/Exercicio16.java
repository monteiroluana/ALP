/*
Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida do usuário.

Para cada valor lido, mostre uma mensagem em português dizendo se este valor lido é par (PAR), 
ímpar(ÍMPAR), positivo (POSITIVO) ou negativo (NEGATIVO). 
No caso do valor ser igual a zero (0), seu programa deverá imprimir apenas NULO.  ​

Utilize o laço DO-WHILE. 
 */
package Lista3;
//@Monteiro

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Quantas vezes esse processo será realizado? : ");
        int N = console.nextInt();
        int i = 0, numero;

        do {
            System.out.print("Numero: ");
            numero = console.nextInt();

            if (numero == 0) {
                System.out.println("NULO");
            } else if (numero % 2 == 0) {
                if (numero > 0) {
                    System.out.println("(" + numero + ") é PAR e POSITIVO");
                } else {
                    System.out.println("(" + numero + ") é PAR e NEGATIVO");
                }
            } else if (numero % 2 != 0) {
                if (numero > 0) {
                    System.out.println("(" + numero + ") é IMPAR e POSITIVO");
                } else {
                    System.out.println("(" + numero + ") é IMPAR e NEGATIVO");
                }
            }
            i++;
        } while (i < N);
    }
}
