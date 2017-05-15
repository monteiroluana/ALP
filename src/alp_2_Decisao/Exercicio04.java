/*
27_03_2017
Calcular a conta de consumo de energia elétrica
de um consumidor, dado o kWh consumido
 */
package alp_2_Decisao;
//@Monteiro

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        /*Entrada*/
        Scanner console = new Scanner(System.in);
        System.out.print("kWh: ");
        double kWh = console.nextDouble();

        /*Processamento/ Saída*/
        double a = 0.20;
        double b = 0.25;
        double c = 0.30;
        double vMin = 11.90;
        double conta;

        if (kWh < 150) {
            conta = (kWh * a)+vMin;
            System.out.printf("consumo de energia elétrica = R$%.2f",conta);
        } else if (kWh >= 150 && kWh < 500) {
            conta = (kWh * b)+vMin;
            System.out.printf("consumo de energia elétrica = R$%.2f",conta);
        } else if (kWh >= 500) {
            conta = (kWh * c)+vMin;
            System.out.printf("consumo de energia elétrica = R$%.2f",conta);
        }

    }

}
