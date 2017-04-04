/*
Construir um programa para identificar quantos dias há em um mês, sabendo o mês e
o ano.
 */
package exercicio2;
//@Monteiro

import javax.swing.JOptionPane;

public class Exercicio04 {

    public static void main(String[] args) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mês (de 1 à 12)"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));

        switch (mes) {
            case 2:
                if (ano % 4 == 0) {
                    System.out.println("29 dias");
                } else {
                    System.out.println("28 dias");
                }
                break;
            case 1:
                System.out.println("31 dias");
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                JOptionPane.showMessageDialog(null, "31 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                JOptionPane.showMessageDialog(null, "30 dias");

                break;

            default:
                System.out.println("entrada inválida");

        }
    }
}
