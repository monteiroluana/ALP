/*
Escreva um programa para ler a quantidade de alunos existentes em uma turma. 
Depois disso, o programa deve ler as notas de cada um destes alunos, calcular e 
mostrar na tela a média aritmética destas notas. Utilize o laço WHILE. 
 */
package Lista3;
//@Monteiro

import javax.swing.JOptionPane;

public class Exercicio09 {

    public static void main(String[] args) {
        int qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos "));
        double nota, soma = 0, media;

        int i = 1;
        while (i <= qtdAlunos) {
            nota = Double.parseDouble(JOptionPane.showInputDialog("Nota do Aluno " + i));
            if (nota <= 10) {
                soma = soma + nota;
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "Nota inválida");
            }
        }
        media = soma / qtdAlunos;
        JOptionPane.showMessageDialog(null, "Média Aritmética das notas: " + media);

    }
}
