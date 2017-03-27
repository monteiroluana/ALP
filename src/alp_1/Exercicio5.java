//  13/03/2017
package alp_1;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        float C;
        float F;

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        F = leitor.nextFloat();

        C = ((5 / 9.0f) * (F - 32));
        System.out.println("A temperatura em Celsius será: " + C);
    }

}
