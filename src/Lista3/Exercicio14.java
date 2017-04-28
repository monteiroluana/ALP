/*
Faça um programa que leia um número natural N e calcule a soma abaixo (lembre-se de 
que tanto as divisões quanto o resultado devem ser decimais). ​
Utilize o laço que lhe for mais conveniente

S = 1+ 2/3 + 4/5 + 6/7 +. + 2N (2N+1) 

 */
package Lista3;
//@Monteiro

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        /*ENTRADA*/
        Scanner console = new Scanner(System.in);
        System.out.print("N: ");
        int N = console.nextInt();

        /*PPROCESSAMENTO*/
        double dividendo = 1d, divisor = 1d;
        double s = 0d;

        while (dividendo <= N && divisor <= N) {
            s = s + (dividendo / divisor);
                        
            dividendo++;
            divisor+=2;
        }
        System.out.printf("Resultado: %.2f\n",s);
    }
}
