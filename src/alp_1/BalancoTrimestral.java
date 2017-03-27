//  13/03/2017
package alp_1;

/*
1)
Na empresa onde trabalhamos, há tabelas com o quanto foi gasto em cada mês. Para
fechar o balanço do primeiro trimestre, precisamos somar o gasto total. Sabendo
que em janeiro, foram gastos 15000 reais, em Fevereiro, 23000 reais e em Março,
17000 reais, faça um programa que calcule e imprima o gasto total no trimestre

2)
Adicione códico (sem alterar em linhas que já existem) na classe anterior para
imprimir a média mensal de gastos, criando uma variável @mediaMensal junto com 
uma mensagem. para isso, concatene a String com o valor usando
"Valor da média mensal = " + mediaMensal.
*/

public class BalancoTrimestral {
    public static void main(String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        int mediaMensal = gastosTrimestre / 3;
        
        System.out.println(gastosTrimestre);
        System.out.println("Valor da média mensal= "+ mediaMensal);
    }
    
}
