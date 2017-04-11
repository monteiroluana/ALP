/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alp_3_Repeticao;
//@Monteiro

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        int x, soma = 0;
        Scanner console = new Scanner(System.in);

        for (int i =0; i<10; i++){
            System.out.println("Digite o item "+i);
            x = console.nextInt();
            soma = soma+x;
        }
        System.out.println("TOTAL: " + soma);
    }
}
