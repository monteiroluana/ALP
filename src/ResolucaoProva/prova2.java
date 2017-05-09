/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResolucaoProva;
//@Monteiro 

import java.util.Scanner;

public class prova2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double critA, critB;

        System.out.print("Quantidade de DVD's: ");
        int qtdDvd = console.nextInt();

        critA = (0.25 * qtdDvd) + 7.5;
        critB = (0.50 * qtdDvd) + 2.5;

        if (critA < critB) {
            System.out.println("Critério A R$" + critA);
        } else {
            System.out.println("Critério B R$" + critB);
        }

    }
}
