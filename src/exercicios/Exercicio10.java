/*
 Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total 
de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor 
ganha 15% de comissão sobre suas vendas efetuadas, calcular e imprimir o total 
a receber no final do mês.
 */
package exercicios;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        float salarioFixo, valorVendas, comissao, salarioFinal;
        String vendedor;
        comissao = 0.15f;

        Scanner console = new Scanner(System.in);

        //ENTRADAS
        System.out.print("Nome do vendedor: ");
        vendedor = console.next();
        System.out.print("Salário Fixo: ");
        salarioFixo = console.nextFloat();
        System.out.print("Valor total das vendas do mês: ");
        valorVendas = console.nextFloat();
        
        //PROCESSAMENTO
        salarioFinal = valorVendas*comissao + salarioFixo;
        
        //SAIDA
        System.out.printf("O vendedor %s irá receber R$%.2f nesse mês\n", vendedor, salarioFinal);
    }

}
