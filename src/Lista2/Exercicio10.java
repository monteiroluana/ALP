/*
. Crie um programa que simule uma calculadora simples capaz de realizar as operações
básicas. O programa deve receber 3 dados: dois números e um caractere. Este caractere
poderá ser '+', '-', ‘*' ou '/' , e representarão a operação matemática que você deseja
realizar entre os números.
 */
package Lista2;
//@Monteiro

import javax.swing.JOptionPane;

public class Exercicio10 {

    public static void main(String[] args) {
        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o 1º número"));
        String operador = JOptionPane.showInputDialog("Escolha um operador ( +  -  *  / )");
        double Num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o 2º número"));
    
    switch (operador){
        case "+": double soma = Num1+Num2; JOptionPane.showMessageDialog(null,soma);break;
        case "-": double subtracao = Num1+Num2; JOptionPane.showMessageDialog(null,subtracao);break;
        case "*": double multiplicacao = Num1+Num2; JOptionPane.showMessageDialog(null,multiplicacao);break;
        case "/": double divisao = Num1+Num2; JOptionPane.showMessageDialog(null,divisao);break;
        default:JOptionPane.showMessageDialog(null,"Operador inválido");
    }
    
    }
    
}
