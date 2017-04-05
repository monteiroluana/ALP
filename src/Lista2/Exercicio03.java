/*
Crie um programa para informar quais e quantas notas são necessárias para entregar o
mínimo de cédulas para um determinado valor informado pelo usuário, Considere
notas de R$ 100, R$ 50, R$ 10 e R$ 5 e R$ 1. Seu programa deve mostrar apenas as notas
utilizadas. Por exemplo, ao solicitar R$18, o programa deve informar apenas a seguinte
informação (note que não foram exibidas informações sobre as demais cédulas):
1 nota(s) de R$ 10.
1 nota(s) de R$ 5.
3 nota(s) de R$ 1. 
 */
package Lista2;
//@Monteiro

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Valor: ");
        int valor = Integer.parseInt(console.nextLine());
        /*int centena, dezena, unidade;
        centena = valor / 100;
        dezena = (valor % 100) / 10;
        unidade = ((valor % 100) % 10) / 1;*/

        int nt100, nt50, nt10, nt5, nt1, rst100 = 0, rst50 = 0, rst10 = 0, rst5 = 0, rst1=0;

        /*Verificando onde o 1º número se enquadra melhor (teste descrescente)*/
        if (valor / 100 >= 1) {
            nt100 = valor / 100;
            rst100 = valor % 100;
            System.out.println(nt100 + " Notas de 100");
        } else if (valor / 50 >= 1) {
            nt50 = valor / 50;
            rst50 = valor % 50;
            System.out.println(nt50 + " Notas de 50");
        } else if (valor / 10 >= 1) {
            nt10 = valor / 10;
            rst10 = valor % 10;
            System.out.println(nt10 + " Notas de 10");
        } else if (valor / 5 >= 1) {
            nt5 = valor / 5;
            rst5 = valor % 5;
            System.out.println(nt5 + " Notas de 5");
        } else if (valor / 1 >= 1) {
            nt1 = valor / 1;
            rst1 = valor % 1;
            System.out.println(nt1 + " Notas de 1");
        }

        /*Agora o protagonista será o valor que está dentro da variavel Resto*/
        
        /*Se o resto de 100*/
        if (rst100 / 50 >= 1) {
            nt50 = rst100 / 50;
            rst50 = rst100 % 50;
            System.out.println(nt50 + " Notas de 50");
        } else if (rst100 >= 10 && rst10 < 50) {
            nt10 = rst100 / 10;
            System.out.println(nt10 + " Notas de 10");
        } else if (rst100 > 5 && rst100 < 10) {
            nt5 = rst100 / 5;
            System.out.println(nt5 + " Notas de 5");
        } else if (rst100 >= 1 && rst100 <= 5) {
            nt1 = rst100 / 1;
            System.out.println(nt1 + " Notas de 1");
        }

        /*Se o resto de 50*/
        if (rst50 / 10 >= 1) {
            nt10 = rst50 / 10;
            rst10 = rst50 % 10;
            System.out.println(nt10 + " Notas de 10");
        } else if (rst50 > 5 && rst50 < 10) {
            nt5 = rst50 / 5;
            rst50 = rst50 % 5;
            System.out.println(nt5 + " Notas de 5");
        }
        if (rst50 >= 1 && rst50 <= 5) {
            nt1 = rst50 / 1;
            System.out.println(nt1 + " Notas de 1");
        }

        /*Se o resto de 10*/
        if (rst10 >= 5 && rst10 < 10) {
            nt5 = rst10 / 5;
            rst5 = rst10 % 5;
            System.out.println(nt5 + " Notas de 5");
        } else if (rst10 >= 1 && rst10 < 5) {
            nt1 = rst10 / 1;
            System.out.println(nt1 + " Notas de 1");
        }

        /*Se o resto de 5*/
        if (rst5 >= 1 && rst5 < 5) {
            nt1 = rst5 / 1;
            System.out.println(nt1 + " Notas de 1");

        }
    }
}
