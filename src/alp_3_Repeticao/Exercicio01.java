/*
Faça um programa que mostre os números pares entre 1 e 100, inclusive. Use o laço
while.
 */
package alp_3_Repeticao;
//@Monteiro

public class Exercicio01 {

    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {

            if (i % 2 == 0) {
                System.out.println(i);

            }
            i++;
        }
    }
}
