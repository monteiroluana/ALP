/*
 Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D 
for maior do que A,e a soma de C com D for maior que a soma de A e B e se C e D, 
ambos, forem positivos e se avariável A for par escrever a mensagem 
"Valores aceitos", senão escrever "Valores nao aceitos". 

 */
package Lista1;
//@Monteiro

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        /*Entradas*/
        Scanner console = new Scanner(System.in);
        System.out.print("Insira A: ");
        int A = console.nextInt();
        System.out.print("Insira B: ");
        int B = console.nextInt();
        System.out.print("Insira C: ");
        int C = console.nextInt();
        System.out.print("Insira D: ");
        int D = console.nextInt();

        /*Processamento/ Saída*/
        int CD = C + D;
        int AB = A + B;

        if (B > C && D > A && CD > AB && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores não aceitos");
        }
    }

}
