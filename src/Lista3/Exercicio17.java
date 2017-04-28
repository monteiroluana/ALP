/*
 Ler um número inteiro N e calcular e imprimir todos os seus divisores. 
Exemplo: para o número 6, temos os seguintes divisores 1, 2, 3, 6. ​
Utilize o laço que lhe for mais conveniente
 */
package Lista3;
//@Monteiro

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("N: ");
        int n = console.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);

            }

        }
    }
}
