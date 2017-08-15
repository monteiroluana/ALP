/*
Faça uma função que recebe a idade de uma pessoa em anos, meses e dias e retorna essa idade
expressa em dias.
 */
package Lista4;
//@Monteiro

import java.util.Scanner;

public class Exercicio09 {

    static int entradaIdade() {
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        return num;
    }

    static int idade(int anos, int meses, int dias) {
        int resultado = (anos * 365) + (meses * 30) + dias;
        return resultado;
    }

    public static void main(String[] args) {
        System.out.print("Anos: ");
        int anos = entradaIdade();
        
        System.out.print("Meses: ");
        int meses = entradaIdade();
        
        System.out.print("Dias: ");
        int dias = entradaIdade();
        
        int resultado = idade(anos, meses, dias);
        System.out.println(resultado+ "dias de idade");

    }
}
