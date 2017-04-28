/*
Escreva um programa capaz de ler o saldo inicial de uma conta bancária e um número indeterminado de operações de depósito e saque. 
O usuário deve digitar “1” para realizar um depósito, “2” para realizar um saque. 
Após digitar o código da operação, o usuário deve digitar o valor. As operações devem continuar sendo realizadas até que o usuário digite o código de operação “3”. 
Ao digitar “3”, o programa deve ser encerrado e o saldo final da conta deve ser impresso 
com as seguintes mensagens: CONTA ZERADA (caso o saldo final seja 0), 
CONTA ESTOURADA (se o saldo for negativo) ou                 
CONTA PREFERENCIAL (se o saldo for positivo). 
Utilize o laço DO-WHILE. 
 */
package Lista3;
//@Monteiro

import javax.swing.JOptionPane;

public class Exercicio20 {

    public static void main(String[] args) {

        double deposito, saque, valorAtual = 0;

        double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog("Informe seu saldo"));
        int acao = Integer.parseInt(JOptionPane.showInputDialog("(1)  Novo Depósito\n(2)  Saque"));

        do {

            if (acao == 1) {
                deposito = Double.parseDouble(JOptionPane.showInputDialog("Deposite em sua conta"));
                valorAtual = saldoInicial + deposito;
            } else if (acao == 2) {
                saque = Double.parseDouble(JOptionPane.showInputDialog("Valor do saque"));
                valorAtual = saldoInicial - saque;
            }

            acao = Integer.parseInt(JOptionPane.showInputDialog("(1)  Novo Depósito\n(2)  Saque\n(3)  Encerrar"));
        } while (acao == 1 || acao == 2);

        if (valorAtual == 0) {
            JOptionPane.showMessageDialog(null, "Saldo atual R$" + valorAtual + "\n CONTA ZERADA");
        } else if (valorAtual < 0) {
            JOptionPane.showMessageDialog(null, "Saldo atual R$"+ valorAtual + "\n CONTA ESTOURADA");
        }
        else if (valorAtual>0){
        JOptionPane.showMessageDialog(null, "Saldo atual R$"+ valorAtual + "\n CONTA PREFERÊNCIAL");
        }

    }
}
