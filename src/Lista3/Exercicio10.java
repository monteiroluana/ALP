/*
Faça um programa que calcule e imprima o resultado da soma abaixo (
lembre-se de que tanto as divisões quanto o resultado devem ser decimais). ​
Utilize o laço que lhe for mais conveniente. ..S = 1 + 1/2 + 1/3 + 1/4 +... + 1/20 

 */
package Lista3;
//@Monteiro

public class Exercicio10 {

    public static void main(String[] args) {

        double s = 1.0;
        for (int i = 2; i <= 20; i++) {

            s = s + (1d / i);
        }
        System.out.printf("Resultado: %.2f", s);
    }
}
