/*
Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L.

 */
package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        double lado, area;
        
        Scanner console = new Scanner (System.in);
        
        //ENTRADAS
        System.out.print("Insira L: ");
        lado = console.nextDouble();
        
        //PROCESSAMENTO
        area = lado * lado;
        
        //SAIDA
        System.out.println("Área: " + area);
        
    }
    
}
