/*
Faça um programa para imprimir os números pares entre 100 e 1, em ordem decrescente, 
ou seja, o laço deve iniciar em 100 e encerrar em 1. ​Use o laço FOR.
 */
package Lista3;
//@Monteiro

public class Exercicio05 {

    public static void main(String[] args) {
        for (int i = 100; i > 1; i--) {

            if (i % 2 == 0) {

                System.out.println(i);
            }

        }

    }

}
