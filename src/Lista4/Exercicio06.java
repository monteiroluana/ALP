/*
Modificar a função do Exercício 5 da seguinte forma: além dos parâmetros de entrada reais a, b, c, um
quarto parâmetro d deve ser adicionado.
Esse parâmetro poderá ter dois valores: 1 ou 2.
Ele será responsável para decidir se a saída da função vai ser a maior ou a menor raiz (no caso de raízes
iguais, considere a maior raiz). Considere que 1 serve para obter a maior raiz e 2 para obter a menor raiz.
Novamente, se não houver raízes reais, a função deve retornar o número −1.

 */
package Lista4;
//@Monteiro

import java.util.Scanner;

public class Exercicio06 {

    static double entradaDeDados() {
        Scanner console = new Scanner(System.in);
        System.out.print("Número: ");
        double n = console.nextDouble();
        return n;
    }

    static int maiorOuMenor() {
        Scanner console = new Scanner(System.in);
        System.out.println("1- Maior raiz");
        System.out.println("2- Menor raiz");
        System.out.print("OPÇÃO: ");
        int opcao = console.nextInt();
        return opcao;
    }

    static double baskara(double a, double b, double c, int opcao) {
        double resultado;
        double delta = Math.sqrt((Math.pow(b, 2) - (4 * (a * c))));

        double calcPositivo = (-b + delta) / (2 * a);
        double calcNegativo = (-b - delta) / (2 * a);

        if (opcao == 1) {
            resultado = calcPositivo;
        } else if (opcao == 2) {
            resultado = calcNegativo;
        } else {
            resultado = -1;
        }
        return resultado;

    }

    public static void main(String[] args) {
        double a = entradaDeDados();
        double b = entradaDeDados();
        double c = entradaDeDados();
        int opcao = maiorOuMenor();
        double bask = baskara(a, b, c,opcao);
        System.out.println(bask);
    }
}
