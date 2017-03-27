/*
 Escreva um programa que leia o número de cadastro de um funcionário, seu número
de horas trabalhadas, o valor que recebe por hora e calcula o salário desse 
funcionário. A seguir, mostre na tela o número e o salário do funcionário.
 */
package exercicios;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        int numCadas, horas;
        float valorHora, salario;
        String nomeFuncionario;

        Scanner console = new Scanner(System.in);

        //ENTRADAS
        System.out.print("Insira o múmero de cadastro: ");
        numCadas = console.nextInt();
        System.out.print("Nome do Funcionário: ");
        nomeFuncionario = console.next();
        System.out.print("Horas Trabalhadas: ");
        horas = console.nextInt();
        System.out.print("Valor da hora de trabalho: ");
        valorHora = console.nextFloat();

        //PROCESSAMENTO
        salario = valorHora * horas;
        
        //SAIDA
        System.out.printf("O funcionário %s , recebe o salário de: R$ %.2f\n", nomeFuncionario, salario);
    }

}
