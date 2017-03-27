/*
 Fazer um algoritmo que leia dois números L e R. O programa deve verificar a 
maior área entre um quadrado de lado L e um círculo de raio R. 
Imprimir na tela qual o maior: "Quadrado" ou "Circulo". 
 */
package exercicios;
//@Monteiro

import javax.swing.JOptionPane;

public class Exercicio12 {

    public static void main(String[] args) {

        /*Entrada*/
        double L = Double.parseDouble(JOptionPane.showInputDialog("Insira L"));
        double R = Double.parseDouble(JOptionPane.showInputDialog("Insira R"));

        /*Processamento (1)*/
        double Quadrado = L * L;
        double Circulo = 2 * 3.14 * R;

        /*Processamento (2)*/
        if (Quadrado > Circulo) {
            JOptionPane.showMessageDialog(null, "Quadrado");
        } else if (Quadrado < Circulo){
            JOptionPane.showMessageDialog(null, "Circulo");
        }
    }
}
