/*
Leia 3 números decimais A, B e C e efetue o cálculo das raízes da equação de Bhaskara.  
Se não for possível calcular as raízes, ou seja, caso haja uma divisão por 0 ou
raiz de numeronegativo, mostre a mensagem correspondente “​Impossivel calcular​”. 

 */
package exercicios;
//@Monteiro

import javax.swing.JOptionPane;

public class Exercicio15 {

    public static void main(String[] args) {

        /* SUGESTÂO DE ENTRADAS
            A:9
            B:12
            C:4
         */
        /*Entradas*/
        double NumA = Double.parseDouble(JOptionPane.showInputDialog("Insira A"));
        double NumB = Double.parseDouble(JOptionPane.showInputDialog("Insira B"));
        double NumC = Double.parseDouble(JOptionPane.showInputDialog("Insira C"));

        /*processamento (1)*/
        double Delta = Math.sqrt(Math.pow(NumA, NumB) - (4 * (NumA * NumC)));
        double CalcPositivo = (-NumB + Delta) / (2 * NumA);
        double CalcNegativo = (-NumB - Delta) / (2 * NumA);

        /*processamento (2)*/
        if (Delta <= 0) {
            JOptionPane.showMessageDialog(null, "Impossivel Calcular");
        } else {
            JOptionPane.showMessageDialog(null, "x1 = " + CalcPositivo);
            JOptionPane.showMessageDialog(null, "x2 = " + CalcNegativo);

        }

    }

}
