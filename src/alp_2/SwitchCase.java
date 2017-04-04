/*
03/04/17
Primeira aula com Switch Case
 */
package alp_2;
//@Monteiro

import java.util.Scanner;


public class SwitchCase {

    public static void main(String[] args) {

        Scanner console = new Scanner (System.in);
        System.out.println("Entrada");
        char grade = console.next().charAt(0);
        
        /*Testando o valor da variavel grade*/
        switch (grade) {
            /*Caso o valor for A:*/
            case 'A':
                System.out.println("Excelente!");
                break;/*Para o teste, assim ele não precisa testar os outros caso este seja verdadeiro*/
            case 'B':
            case 'C':
                System.out.println("Bem feito!");
                break;
            case 'D':
                System.out.println("Vacê passou!");
            case 'E':
                System.out.println("Melhor tentar novamente!");
                break;
            default:/*se o valor fornecido não for nenhum dos que estão acima, vai mostrar essa mensagem*/
                System.out.println("Conceito inválido");
        }

    }
}
