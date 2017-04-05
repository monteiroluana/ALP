/*
Fazer um algoritmo que leia dois números e imprime a divisão do maior pelo menor. 
 */
package Lista1;
//@Monteiro

import javax.swing.JOptionPane;

public class Exercicio14 {

    public static void main(String[] args) {

        /*Entradas*/
        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("1º Número"));
        double Num2 = Double.parseDouble(JOptionPane.showInputDialog("2º Número"));

        /*Processamento*/
        double resultado;

        if (Num1 > Num2) {
            resultado = Num1 / Num2;
            JOptionPane.showMessageDialog(null, resultado);
        } else if (Num2 > Num1) {
            resultado = Num2 / Num1;
            JOptionPane.showMessageDialog(null, resultado);
        }

    }
}
