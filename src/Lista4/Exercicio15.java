/*
Escreva uma função que recebe, por parâmetro, dois valores X e Z e calcula e retorna X^Z
(sem utilizar funções ou operadores de potência prontos​).
Assim sendo, você não pode utilizar a função Math.pow, nem outras existentes no Java.
 */
package Lista4;
//@Monteiro

import java.util.Scanner;

public class Exercicio15 {

    static int entradaNumero() {
        Scanner console = new Scanner(System.in);

        System.out.print("Numero: ");
        int num = console.nextInt();
        return num;
    }

    static int calculoMath(int x, int y) {
        int resultado = 1;
        for (int i = 0; i < y; i++) {
            resultado = resultado * x;
        }
        return resultado;
    }
    
    static void imprimirResult(int x, int y,int result){
        System.out.println(x+"^"+y+" = "+result);
    }
    
    public static void main(String[] args) {
        int x = entradaNumero();
        int y= entradaNumero();
        int resultado = calculoMath(x, y);
        imprimirResult(x, y, resultado);
    }
}
