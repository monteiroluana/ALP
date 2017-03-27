//  13/03/2017
package alp_1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digite A: ");
        a = leitor.nextInt();
        
        System.out.print("Digite B: ");
        b = leitor.nextInt();
        
        c = a;
        a = b;
        b = c;
        
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
  
}
