/*
Criar um programa para identificar se um mês digitado pelo usuário é de alta ou baixa
temporada (considerar os seguintes meses como alta temporada: dezembro a fevereiro,
junho e julho).
 */
package Lista2;
//@Monteiro

import javax.swing.JOptionPane;

public class Exercicio05 {

    public static void main(String[] args) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mês (de 1 à 12)"));

        switch (mes) {
            /*dezembro, janeiro, fevereiro, junho e julho*/
            case 12:
            case 1:
            case 2:
            case 6:
            case 7:JOptionPane.showMessageDialog(null, "Alta Temporada");break;
            
            /*março, abril, maio, agosto, setembro, outubro, novembro*/
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 11:JOptionPane.showMessageDialog(null, "Baixa Temporada");break;
            default:JOptionPane.showMessageDialog(null, "Entrada Inválida");

        }
    }

}
