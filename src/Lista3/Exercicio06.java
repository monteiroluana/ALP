/*
Faça um programa para ler e escrever dados de uma turma de 5 alunos. O programa deve pedir dados 
como nome, idade e sexo. O programa deve imprimir os dados do aluno mais velho. ​Use o laço DO-WHILE
​ 
 */
package Lista3;
//@Monteiro

import javax.swing.JOptionPane;

public class Exercicio06 {

    public static void main(String[] args) {

        int idade[] = new int[5];
        String nome[] = new String[5];
        String sexo[] = new String[5];
        int i = 0;
       
        do {

            nome[i] = JOptionPane.showInputDialog("Nome: ");
            idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
            sexo[i] = JOptionPane.showInputDialog("Sexo  F/M: ");
            
            /*Deixando tudo maiusculo*/
            sexo[i] = sexo[i].toUpperCase();

            i++;
        } while (i < 5);

        /*Verificando qual é a maior idade que está armazenada no array*/
        if (idade[0] > idade[1] && idade[0] > idade[2] && idade[0] > idade[3] && idade[0] > idade[4]) {
            JOptionPane.showMessageDialog(null, "Nome: " + nome[0] + "\n Idade: " + idade[0] + "\n Sexo: " + sexo[0]);

        } else if (idade[1] > idade[0] && idade[1] > idade[2] && idade[1] > idade[3] && idade[1] > idade[4]) {
            JOptionPane.showMessageDialog(null, "Nome: " + nome[1] + "\n Idade: " + idade[1] + "\n Sexo: " + sexo[1]);

        } else if (idade[2] > idade[0] && idade[2] > idade[1] && idade[2] > idade[3] && idade[2] > idade[4]) {
            JOptionPane.showMessageDialog(null, "Nome: " + nome[2] + "\n Idade: " + idade[2] + "\n Sexo: " + sexo[2]);

        } else if (idade[3] > idade[0] && idade[3] > idade[1] && idade[3] > idade[2] && idade[3] > idade[4]) {
            JOptionPane.showMessageDialog(null, "Nome: " + nome[3] + "\n Idade: " + idade[3] + "\n Sexo: " + sexo[3]);

        } else if (idade[4] > idade[0] && idade[4] > idade[1] && idade[4] > idade[2] && idade[4] > idade[3]) {
            JOptionPane.showMessageDialog(null, "Nome: " + nome[4] + "\n Idade: " + idade[4] + "\n Sexo: " + sexo[4]);
        }

    }
}
