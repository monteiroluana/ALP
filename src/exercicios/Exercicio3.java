/*
 Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois
números. Oquadrado de um número A é representado por A2= A * A.

 */
package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        double a, b, resultado;
        
        Scanner console = new Scanner (System.in);
        
        //ENTRADAS
        System.out.print("1º número: ");
        a = console.nextDouble();
        System.out.print("2º número: ");
        b = console.nextDouble();
        
        //PROCESSAMENTO
        resultado = Math.pow(a, 2) + Math.pow(b, 2) ;
        
        //SAIDA
        System.out.println("Resultado: " + resultado);
        
    }
    
}
