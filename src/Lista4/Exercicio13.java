/*
Faça uma função que recebe, por parâmetro, um valor inteiro e positivo e retorna o número de divisores
desse valor.
 */
package Lista4;
//@Monteiro

import java.util.Scanner;

public class Exercicio13 {

    static int entradaNumero() {
        Scanner console = new Scanner(System.in);
        int num;
        do {
            System.out.print("Numero: ");
            num = console.nextInt();
        } while (num < 0);
        return num;
    }

    static int divisores(int num) {

        int divisores = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores++;
            }
        }

        return divisores;
    }
    
    static void imprimir(int numero, int divisores){
        System.out.println("O numero "+numero+", possui "+divisores+" divisores");
        }
    
    public static void main(String[] args) {
        int numero=entradaNumero();
        int divisores = divisores(numero);
        imprimir(numero, divisores);
    }

}
