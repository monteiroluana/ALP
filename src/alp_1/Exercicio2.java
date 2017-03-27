//  13/03/2017
package alp_1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int n1;
        int dobro;
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digite um número inteiro: ");
        n1 = leitor.nextInt();
        
        dobro = n1 * 2;
        
        System.out.println("O dobro de " + n1 + "é igual a " + dobro);
        
    }
    
}
