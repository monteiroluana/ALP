/*
 Fazer um algoritmo que leia três números e imprime o maior deles. 
 */
package exercicios;
//@Monteiro

import javax.swing.JOptionPane;

public class Exercicio13 {

    public static void main(String[] args) {

        /*Entradas*/
        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o 1º Número"));
        double Num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o 2º Número"));
        double Num3 = Double.parseDouble(JOptionPane.showInputDialog("Insira o 3º Número"));

        /*Processamento/ Saída*/
        if (Num1 > Num2 && Num1 > Num3) {
            JOptionPane.showMessageDialog(null, "O maior número é " + Num1);
        } else if (Num2 > Num1 && Num2 > Num3) {
            JOptionPane.showMessageDialog(null, "O maior número é " + Num2);
        } else if (Num3 > Num1 && Num3 > Num2) {
            JOptionPane.showMessageDialog(null, "O maior número é " + Num3);
        }
    }
}
