/*
Fazer um algoritmo que lê um número e verifica se ele é negativo. Se for negativo, 
imprimir na tela a mensagem "Numero negativo".
 */
package exercicios;
//@Monteiro

import javax.swing.JOptionPane;

public class Exercicio11 {

    public static void main(String[] args) {

        /*Entrada*/
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Insira um número"));

        /*Saida*/
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Número Negativo");
        } else {
            JOptionPane.showMessageDialog(null, "Número Positivo");
        }

    }

}
