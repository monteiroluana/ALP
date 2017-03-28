/*
27_03_2017
Dada a altura e o peso de uma pessoa,
determinar seu grau de obesidade. O grau de
obesidade é determinado pelo índice da massa
corpórea (Massa = Peso / Altura2 ) através da
tabela abaixo:
 */
package alp_2;
//@Monteiro

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        /*Entradas*/
        Scanner console = new Scanner(System.in);
        System.out.print("Peso: ");
        double peso = console.nextDouble();
        System.out.print("Altura: ");
        double altura = console.nextDouble();

        /*Processamento/ Saída*/
        double massa = peso / (altura * altura);

        if (massa < 26) {
            System.out.println("Normal");
        } else if (massa >= 26 && massa < 30) {
            System.out.println("Obeso");
        } else if (massa >= 30) {
            System.out.println("Obeso Mórbido ");
        }
    }

}
