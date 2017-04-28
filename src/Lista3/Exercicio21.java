/*
Na matemática, um número perfeito é um número inteiro para o qual a soma de todos 
os seus divisores positivos próprios (excluindo ele mesmo) é igual ao próprio número. 
Por exemplo o número 6 é perfeito, pois 1+2+3 é igual a 6. 
Sua tarefa é escrever um programa que imprima se um determinado número é perfeito ou não. ​
Utilize o laço que lhe for mais conveniente
 */
package Lista3;
//@Monteiro

import javax.swing.JOptionPane;

public class Exercicio21 {

    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("N: "));
        int soma = 0;
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                soma = soma + i;
            }
        }

        if (soma == N) {
            JOptionPane.showMessageDialog(null, "(" + N + ")  é um número Perfeito!");

        } else {

            JOptionPane.showMessageDialog(null, "Não é um número Perfeito!");
        }
    }
}
