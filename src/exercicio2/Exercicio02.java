/*
Crie um programa que exibe se um dia é dia útil, fim de semana ou dia inválido dado
o número referente ao dia. Considere que domingo é o dia 1 e sábado é o dia 7. 
 */
package exercicio2;
//@Monteiro

import javax.swing.JOptionPane;
public class Exercicio02 {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia"));
        
        switch(dia){
            case 1: JOptionPane.showMessageDialog(null, "Fim de semana");break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:JOptionPane.showMessageDialog(null, "Dia útil");break;
            case 7:JOptionPane.showMessageDialog(null, "Fim de semana");break;
            default:JOptionPane.showMessageDialog(null, "Dia inválido ");
        }
    }
}
