/*
 Faça um programa que leia um número natural N e calcule a soma abaixo 
(lembre-se de que tanto as divisões quanto o resultado devem ser decimais). ​
Utilize o laço que lhe for mais conveniente. ..
S = 1 + (1*2)/(1*3) + (1*2*3)/(1*3*5) + (1*2*3*4)/(1*3*5*7) + ... + 
 */
package Lista3;
//@Monteiro

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        double s, soma = 0;
        double dividendo = 1d, j = 1d;
        double divisor = 1d, l = 1d;

        /*ENTRADA*/
        Scanner console = new Scanner(System.in);
        System.out.print("N: ");
        int n = console.nextInt();

        /*PROCESSAMENTO*/
        while (j <= n && l <= n) {
            /*(1*2)/(1*3)*/
            dividendo = dividendo * j;
            divisor = divisor * l;

            /*(1*2)/(1*3) + (1*2*3)/(1*3*5)*/
            s = (dividendo / divisor);
            soma = soma + s;

            /*Acrescimo*/
            j++;
            l += 2;
        }
    }

}
