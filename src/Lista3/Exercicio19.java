/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
Quando a senha for informada corretamente deve ser impressa a mensagem 
"Acesso Permitido" e o algoritmo encerrado. Considere que a senha
correta é o valor 2002. ​Utilize o laço que lhe for mais conveniente.
 */
package Lista3;
//@Monteiro

import javax.swing.JOptionPane;

public class Exercicio19 {

    public static void main(String[] args) {

        boolean Validar = false;

        while (!Validar) {
            String senha = JOptionPane.showInputDialog("Senha");
            if (senha.equals("2002")) {
                JOptionPane.showMessageDialog(null, "Acesso Permitido");
                Validar = true;
            } else {
                JOptionPane.showMessageDialog(null, "Senha Inválida");
            }
        }

    }
}
