/*
Faça uma função que recebe por parâmetro um valor inteiro e positivo e retorna Verdadeiro caso o valor
seja primo, e Falso​, caso contrário. Para isso, você terá que usar o tipo de retorno boolean​.
 */
package Lista4;
//@Monteiro

import java.util.Scanner;

public class Exercicio08 {

    static int entradaDeDados() {
        Scanner console = new Scanner(System.in);
        System.out.print("Numero: ");
        int num = console.nextInt();
        return num;
    }

    static boolean trueOrFalse(int num) {
        boolean trueOrFalse;
        if (num % 2 == 0) {
            trueOrFalse = false;
        } else {
            trueOrFalse = true;
        }
        return trueOrFalse;
    }
    
    public static void main(String[] args) {
        int numero = entradaDeDados();
        boolean vOUf= trueOrFalse(numero);
        
        System.out.println("Esse numero e: "+vOUf);
    }
}
