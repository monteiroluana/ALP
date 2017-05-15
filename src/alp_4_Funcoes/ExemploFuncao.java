package alp_4_Funcoes;
//@Monteiro

import java.util.Scanner;

public class ExemploFuncao {

    static Scanner console = new Scanner(System.in);

    static int menu() {
        int opcao;
        System.out.println("1- Adição");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        System.out.print("Escolha uma opção: ");
        opcao = console.nextInt();
        return opcao;
    }

    static int adicao(int n1, int n2) {
        System.out.println("ADIÇÃO");
        int resultado = n1 + n2;
        return resultado;
    }

    static int subtracao(int n1, int n2) {
        System.out.println("SUBTRAÇÃO");
        int resultado = n1 - n2;
        return resultado;
    }

    static int multiplicacao(int n1, int n2) {
        System.out.println("MULTIPLICAÇÃO");
        int resultado = n1 * n2;
        return resultado;
    }

    static double divisao(double n1, double n2) {
        System.out.println("DIVISÃO");
        double resultado = n1 / n2;
        return resultado;
    }

    static void qualEOMaior(int n1, int n2) {
        int r;
        System.out.println("QUAL É O MAIOR NÚMERO");

        if (n1 > n2) {
            r = n1;
        } else {
            r = n2;
        }

        System.out.println(r + " é o maior numero");
    }

    static int entredaDados() {
        int numero;
        System.out.println("ENTRADA DE DADOS");
        System.out.print("NUMERO:");
        numero = console.nextInt();
        return numero;
    }

    static void imprimir(double n) {
        System.out.println("IMPRIMIR");
        System.out.println("Resultado: " + n);

    }

    static double operacao(int opcao, int n1, int n2) {
        double r = 0;
        System.out.println("OPERAÇÃO");
        switch (opcao) {
            case 1:
                r = adicao(n1, n2);
                break;
            case 2:
                r = subtracao(n1, n2);
                break;
            case 3:
                r = multiplicacao(n1, n2);
                break;
            case 4:
                r = divisao(n1, n2);
                break;
        }

        return r;
    }

    public static void main(String[] args) {
        int opcao = menu();
        int n1 = entredaDados();
        int n2 = entredaDados();
        double r = operacao(opcao, n1, n2);
        imprimir(r);
        qualEOMaior(n1, n2);
    }
}
