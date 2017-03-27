//  13/03/2017
package alp_1;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        int base;
        int altura;
        int area;
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digite a base: ");
        base = leitor.nextInt();
        
        System.out.print("Digite a altura: ");
        altura = leitor.nextInt();
        
        area = (base*altura)/2;
        System.out.println(area);
    }

}
