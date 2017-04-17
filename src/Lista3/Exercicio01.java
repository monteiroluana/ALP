/*
Faça um programa que mostre todos os números inteiros de 1 a 50. ​Use o laço WHILE. 
 */
package Lista3;
//@Monteiro

public class Exercicio01 {

    public static void main(String[] args) {
        int i = 0;
        while (i <= 50) {

            if (i % 2 != 0) {
                System.out.println(i);

            }
            i++;
        }
    }
}
