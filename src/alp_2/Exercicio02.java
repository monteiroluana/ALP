/*
27_03_2017
Dados dois números, verificar se a divisão do primeiro número pelo 
segundo é exata (o resto da divisão deve ser igual a 0). Se for, o algoritmo
deve imprimir a mensagem “A divisão de (número1) por (número 2) é exata”.
 */
package alp_2;
//@Monteiro

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        /*Entradas*/
        Scanner console = new Scanner(System.in);
        System.out.print("N1: ");
        int n1 = console.nextInt();
        System.out.print("N2: ");
        int n2 = console.nextInt();
        
        /*Processamento/ Saida*/
        if(n1 %n2 ==0){
            System.out.printf("A divisão do número %d por número %d é exata", n1,n2);
        }else {System.out.println("A divisão não é exata");}
    }
}
