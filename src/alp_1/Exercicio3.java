//  13/03/2017
package alp_1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int nota1;
        int nota2;
        int media;
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digite Nota1: ");
        nota1 = leitor.nextInt();
        System.out.print("Digite Nota2: ");
        nota2 = leitor.nextInt();
        
        media = ((nota1*6)+(nota2*4)/2);
        System.out.println("Sua média é " + media);
    }
}
