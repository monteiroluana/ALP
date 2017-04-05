/*
Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (π = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
f) o perímetro do retângulo que tem lados A e B
 */
package Lista1;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        double a, b, c;
        double triangulo, circulo, trapezio, quadrado, retangulo, periRetangulo;

        Scanner console = new Scanner(System.in);

        //ENTRADAS
        System.out.print("Insira A: ");
        a = console.nextDouble();
        System.out.print("Insira B: ");
        b = console.nextDouble();
        System.out.print("Insira C: ");
        c = console.nextDouble();
        
        System.out.println("CALCULOS FEITOS COM BASE NOS NÚMEROS FORNECIDOS");
        
        //PROCESSOS e SAIDAS
        
        //a área do triângulo retângulo que tem A por base e C por altura.
        triangulo = (a*c)/2;
        System.out.println("área do triângulo Retângulo: " + triangulo);
        
        // a área do círculo de raio C. (π = 3.14159)
        circulo = c*3.1415;
        System.out.println("área do circulo: " + circulo);
        
        // a área do trapézio que tem A e B por bases e C por altura.
        trapezio = ((a+b)*c)/2;
        System.out.println("área do trapézio: " + trapezio);
        
        // a área do quadrado que tem lado B.
        quadrado = b*b;
        System.out.println("área do quadrado: " + quadrado);
        
        // a área do retângulo que tem lados A e B.
        retangulo = a*b;
        System.out.println("área do retângulo: " + retangulo);
        
        // o perímetro do retângulo que tem lados A e B
        periRetangulo = (a*a + b*b);
        System.out.println("perimetro do retângulo: " + periRetangulo);
        
    }

}
