/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;
//@Monteiro

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        /*Entradas*/
        Scanner console = new Scanner(System.in);
        System.out.print("N1: ");
        int n1 = console.nextInt();
        System.out.print("N2: ");
        int n2 = console.nextInt();
        System.out.print("N3: ");
        int n3 = console.nextInt();

        /*Processamento*/
        int A, B, C;
        if (n1 > n2 && n1 > n3) {
            A = n1;
            System.out.println(A);
        } else if (n2 > n1 && n2 > n3) {
            A = n2;
            System.out.println(A);
        } else if (n3 > n1 && n3 > n2) {
            A = n3;
            System.out.println(A);
        }

        if (n1 < n2 && n1 > n3) {
            B = n1;
            System.out.println(B);
        } else if (n2 < n1 && n2 > n3) {
            B = n2;
            System.out.println(B);
        } else if (n3 < n1 && n3 > n2) {
            B = n3;
            System.out.println(B);
        }

        if (n1 < n2 && n1 < n3) {
            C = n1;
            System.out.println(C);
        } else if (n2 < n1 && n2 < n3) {
            C = n2;
            System.out.println(C);
        } else if (n3 < n1 && n3 < 2) {
            C = n3;
            System.out.println(C);
        }
    }
}
