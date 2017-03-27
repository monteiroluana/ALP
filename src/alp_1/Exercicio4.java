//  13/03/2017
package alp_1;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        int raio;
        float c;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o Raio: ");
        raio = leitor.nextInt();

        c = 2 * 3.14f * raio;

        System.out.println("O comprimento da Circunferência é: " + c);

    }

}
