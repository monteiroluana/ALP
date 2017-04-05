/*
Criar um programa para identificar o valor a ser pago por um plano de saúde dada a
idade do conveniado, considerando que todos pagam R$ 100 mais um adicional
conforme a seguinte tabela:
1) crianças com menos de 10 anos pagam R$80;
2) conveniados com idade entre 10 e 30 anos pagam R$50;
3) conveniados com idade entre 40 e 60 anos pagam R$ 95; e
4) conveniados com mais de 60 anos pagam R$130. 
 */
package Lista2;
//@Monteiro

import javax.swing.JOptionPane;

public class Exercicio07 {

    public static void main(String[] args) {

        /*Entrada*/
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));

        /*Processamento (testando a idade)*/
        int conv;
        if (idade < 10) {
            conv = 1;
        } else if (idade >= 10 && idade < 30) {
            conv = 2;
        } else if (idade >= 40 && idade < 60) {
            conv = 3;
        } else {
            conv = 4;
        }

        /*testando os tipos e dando a saída correnpondente*/
        switch (conv) {
            case 1:
                JOptionPane.showMessageDialog(null, "R$: " + (100 + 80));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "R$: " + (100 + 50));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "R$: " + (100 + 95));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "R$: " + (100 + 130));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Entrada Inválida");
                break;
        }

    }
}
