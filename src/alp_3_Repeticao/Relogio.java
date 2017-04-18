/*
Laço
hora -> minutos -> segundos
 */
package alp_3_Repeticao;
//@Monteiro

import javax.swing.JOptionPane;

public class Relogio {

    public static void main(String[] args) {

        int h, m, s, d, controle = 1;

        while (controle == 1) {
            String alarme = JOptionPane.showInputDialog("Alarme\n 00:00:00");
            int dia = Integer.parseInt(JOptionPane.showInputDialog("1-Seg  2-Ter  3-Quar  4-Qui\n5-Sex  6-Sáb  7-Dom"));
            /*Definindo a hora de parar o laço*/
            int h1 = Integer.parseInt(alarme.substring(0, 2));
            int m1 = Integer.parseInt(alarme.substring(3, 5));
            int s1 = Integer.parseInt(alarme.substring(6, 8));

            for (d = 1; d <= 7; d++) {

                for (h = 0; h < 24; h++) {

                    for (m = 0; m < 60; m++) {

                        for (s = 0; s < 60; s++) {

                            String semana="";
                            switch (d) {
                                case 1:
                                    semana = "Segunda";
                                    break;
                                case 2:
                                    semana = "Terça";
                                    break;
                                case 3:
                                    semana = "Quarta";
                                    break;
                                case 4:
                                    semana = "Quinta";
                                    break;
                                case 5:
                                    semana = "Sexta";
                                    break;
                                case 6:
                                    semana = "Sábado";
                                    break;
                                case 7:
                                    semana = "Domingo";
                                    break;
                            }

                            System.out.printf(semana+" - %d:%d:%d:\n", h, m, s);

                            if (d == dia && h == h1 && m == m1 && s == s1) {
                                System.out.println("ALARME!!!");
                                break;
                            }
                        }

                        if (d == dia && h == h1 && m == m1) {
                            break;
                        }
                    }
                    if (d == dia && h == h1) {
                        break;
                    }

                }
                if (d == dia) {
                    break;
                }
            }
            controle = Integer.parseInt(JOptionPane.showInputDialog("1-continuar\n 0-parar "));
        }
    }
}
