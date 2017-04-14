/*
Crie um programa para validar CPF (o usuário informa os onze dígitos do documento
e ele informa se o número informado é válido ou não). Um CPF é composto de 11
dígitos, em que os dois últimos são os dígitos verificadores. Para ser válido, o primeiro
e o segundo dígitos do CPF informado devem ser iguais a determinados valores, como
descrito abaixo
 */
package Lista2;
//@Monteiro

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("CPF: ");
        String cpf = console.nextLine();

        /*
        1)Ele simplesmente "corta" uma String, desde um índice definido até o outro. Ex:
            String nome = "1234567890";
            System.out.println(nome.substring(0,7));
        Nesse exemplo ele vai pegar os primeiros 7 caracteres, ou seja "1234567".
        
        2)Fazendo a conversão de String para Int
         */
        int n1 = Integer.parseInt(cpf.substring(0, 1));
        int n2 = Integer.parseInt(cpf.substring(1, 2));
        int n3 = Integer.parseInt(cpf.substring(2, 3));
        int n4 = Integer.parseInt(cpf.substring(3, 4));
        int n5 = Integer.parseInt(cpf.substring(4, 5));
        int n6 = Integer.parseInt(cpf.substring(5, 6));
        int n7 = Integer.parseInt(cpf.substring(6, 7));
        int n8 = Integer.parseInt(cpf.substring(7, 8));
        int n9 = Integer.parseInt(cpf.substring(8, 9));
        int n10 = Integer.parseInt(cpf.substring(9, 10));
        int n11 = Integer.parseInt(cpf.substring(10, 11));
        
        /*Passo 1*/
        int mult1 = n1 * 10;
        int mult2 = n2 * 9;
        int mult3 = n3 * 8;
        int mult4 = n4 * 7;
        int mult5 = n5 * 6;
        int mult6 = n6 * 5;
        int mult7 = n7 * 4;
        int mult8 = n8 * 3;
        int mult9 = n9 * 2;

        /*Passo 2 Some os resultados das multiplicações anteriores*/
        int soma1 = mult1 + mult2 + mult3 + mult4 + mult5 + mult6 + mult7 + mult8 + mult9;

        /*Passo 3 Encontre o resto da divisão da soma anterior por 11 */
        int restoSoma1 = soma1 % 11;

        /*Passo 4 Subtraia o resto obtido no passo anterior de 11.*/
        int resto1 = 11 -restoSoma1;

        /*Passo 5 Se o resultado da subtração for menor que 10, compare-o com o 10° dígito do CPF; se
        não for, compare-o com zero. Se a comparação for diferente, o CPF é inválido e os
        passos seguintes podem ser ignorados.*/
        if (resto1 < 10 && resto1 == n10 || resto1 == 0) {

            /*Passo 6 - esse passo só será executado se o passo 5 for verdadeiro*/
            int p6Mult1 = n1 * 11;
            int p6Mult2 = n2 * 10;
            int p6Mult3 = n3 * 9;
            int p6Mult4 = n4 * 8;
            int p6Mult5 = n5 * 7;
            int p6Mult6 = n6 * 6;
            int p6Mult7 = n7 * 5;
            int p6Mult8 = n8 * 4;
            int p6Mult9 = n9 * 3;
            int p6Mult10 = n10 * 2;


            /*Passo 7 Some os resultados das multiplicações anteriores do passo anterior */
            int soma2 = p6Mult1 + p6Mult2 + p6Mult3 + p6Mult4 + p6Mult5 + p6Mult6 + p6Mult7 + p6Mult8 + p6Mult9 + p6Mult10;


            /*Passo 8  Encontre o resto da divisão da soma do passo anterior por 11 */
            int restosoma2 = soma2 / 11;


            /*Passo 9 Subtraia o resto obtido no passo anterior de 11 */
            int resto2 = 11 - restosoma2;


            /*Passo 10 Se o resultado da subtração for menor que 10, compare-o com o 11° dígito do CPF; se
            não for, compare-o com zero. Se a comparação for diferente, o CPF é inválido. Se não
            for, o CPF é válido*/
            if (resto2 < 10 && resto2 == n11 || resto2 == 0) {
                System.out.println("CPF válido!");
            } else {
                System.out.println("CPF inválido!");
            }

        } else {
            System.out.println("CPF inválido");
        }
    }
}
