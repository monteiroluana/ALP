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
        System.out.print("A: ");
        double n1 = console.nextDouble();
        System.out.print("B: ");
        double n2 = console.nextDouble();
        System.out.print("C: ");
        double n3 = console.nextDouble();
        double A, B, C;

        /*Todos os lados iguais*/
        if (n1 == n2 && n2 == n3) {
            System.out.println("Triangulo Equilátero");
        /*Se pelo menos dois numero forem iguais*/
        } if (n1 == n2 || n2 == n3 || n3 == n1) {
            System.out.println("Triangulo Isosceles");
        
        /*Processamento (Ordenando os numeros em ordem descrescente)*/
        } if (n1 > n2 && n1 > n3) {
            A = n1;
            if (n2 > n3) {
                B = n2;
                C = n3;
            } else {
                B = n3;
                C = n2;
            }
            boolean nTriangulo = (A >= B + C);
            boolean tRetangulo = (A * A == B * B + C * C);
            boolean tObtusangulo = (A * A > B * B + C * C);
            boolean tAcutangulo = (A * A < B * B + C * C);

            if (nTriangulo) {
                System.out.println("Não forma um triangulo");
            } if (tRetangulo) {
                System.out.println("Triangulo Retangulo");
            } if (tObtusangulo) {
                System.out.println("Triangulo Obtusangulo");
            } if (tAcutangulo) {
                System.out.println("Triangulo Actangulo");
            }

        } else if (n2 > n1 && n2 > n3) {
            A = n2;
            if (n1 > n3) {
                B = n1;
                C = n3;
            } else {
                B = n3;
                C = n1;
            }
            boolean nTriangulo = (A >= B + C);
            boolean tRetangulo = (A * A == B * B + C * C);
            boolean tObtusangulo = (A * A > B * B + C * C);
            boolean tAcutangulo = (A * A < B * B + C * C);

            if (nTriangulo) {
                System.out.println("Não forma um triangulo");
            } if (tRetangulo) {
                System.out.println("Triangulo Retangulo");
            } if (tObtusangulo) {
                System.out.println("Triangulo Obtusangulo");
            } if (tAcutangulo) {
                System.out.println("Triangulo Actangulo");
            }

        } else if (n3 > n1 && n3 > n2) {
            A = n3;
            if (n2 > n1) {
                B = n2;
                C = n1;
            } else {
                B = n1;
                C = n2;

            }
            boolean nTriangulo = (A >= B + C);
            boolean tRetangulo = (A * A == B * B + C * C);
            boolean tObtusangulo = (A * A > B * B + C * C);
            boolean tAcutangulo = (A * A < B * B + C * C);

            if (nTriangulo) {
                System.out.println("Não forma um triangulo");
            } if (tRetangulo) {
                System.out.println("Triangulo Retangulo");
            } if (tObtusangulo) {
                System.out.println("Triangulo Obtusangulo");
            } if (tAcutangulo) {
                System.out.println("Triangulo Actangulo");
            }

        }
    }
}
