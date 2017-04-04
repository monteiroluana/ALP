/*
Crie um programa que verifica se um número inteiro informado pelo usuário é
divisível por 3.
 */
package exercicio2;
//@Monteiro

import javax.swing.JOptionPane;

public class Exercicio01 {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));

        int resto = numero % 3;
        System.out.println(resto);
        switch (resto) {
            case 0:
                JOptionPane.showMessageDialog(null, "Divisivel por 3");
                break;
            default:
                JOptionPane.showMessageDialog(null, "O número não é divisivel por 3");
                

        }
    }
}
