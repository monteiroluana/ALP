/*
Criar um programa para identificar o valor a ser pago por um plano de saúde dada a
idade do conveniado, considerando que todos pagam R$ 100 mais um adicional
conforme a seguinte tabela:
1) crianças com menos de 10 anos pagam R$80;
2) conveniados com idade entre 10 e 30 anos pagam R$50;
3) conveniados com idade entre 40 e 60 anos pagam R$ 95; e
4) conveniados com mais de 60 anos pagam R$130. 
 */
package exercicio2;
//@Monteiro

import javax.swing.JOptionPane;

public class Exercicio07 {

    public static void main(String[] args) {
        
        String texto = "(1) Crianças com menos de 10 anos\n";
        texto +="(2) Idade entre 10 e 30 anos\n";
        texto +="(3) Idade entre 40 e 60 anos\n";
        texto +="(4) Mais de 60 anos\n";
        int conv = Integer.parseInt(JOptionPane.showInputDialog(texto));
        
        switch (conv){
            case 1: JOptionPane.showMessageDialog(null,"R$: "+ (100+80) );break;
            case 2:JOptionPane.showMessageDialog(null,"R$: "+ (100+50) );break;
            case 3:JOptionPane.showMessageDialog(null,"R$: "+ (100+95) );break;
            case 4:JOptionPane.showMessageDialog(null,"R$: "+ (100+130) );break;
            default: JOptionPane.showMessageDialog(null,"Entrada Inválida" );break;
        }

    }
}
