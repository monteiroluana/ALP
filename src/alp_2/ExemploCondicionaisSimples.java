/*27_03_2017
1ª aula de condicional
 */
package alp_2;

import java.util.Scanner;

public class ExemploCondicionaisSimples {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n1, n2, n3, A;

        /*Entradas*/
        System.out.print("N1:");
        n1 = console.nextInt();
        System.out.print("N2:");
        n2 = console.nextInt();
        System.out.print("N3:");
        n3 = console.nextInt();

        /*Processamento/ Sáida*/
        if (n1 > n2 && n1 > n3) {
            System.out.printf("O número %d é o MAIOR\n", n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.printf("O número %d é o MAIOR\n", n2);
        } else if (n3 > n1 && n3 > n2) {
            System.out.printf("O número %d é o MAIOR\n", n3);
        } else {
            System.out.printf("Os números são iguais!\n");
        }

    }

}
