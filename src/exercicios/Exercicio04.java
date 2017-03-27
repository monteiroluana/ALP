/*
Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos 
desses números.
(Por exemplo: se o usuário digitar 2 e ­9, a saída deverá ser 3 e ­8, 
porque 3 é consecutivo de 2. –8 é consecutivo de –9)
 */
package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        int a, b;

        Scanner console = new Scanner(System.in);
        
        //ENTRADAS
        System.out.println("Insira dois numeros");
        System.out.print("numero 1: ");
        a = console.nextInt();
        System.out.print("numero 2: ");
        b = console.nextInt();
        
        System.out.println("Números e seus consecutivos");
        
        //PROCESSAMENTO e SAIDA
        System.out.print(a + "  ");
        System.out.println(a + 1);
        System.out.print(b + "  ");
        System.out.println(b + 1);

    }

}
