/*
Fazer uma função que tem como parâmetros de entrada três números reais a, b, c e fornece como saída a
maior raiz​ da equação do 2º grau:
ax² + bx + c
Nesta questão, você deverá utilizar a fórmula de Báskara​. Se não houver raízes reais, a função deve
retornar o número −1.

 */
package Lista4;
//@Monteiro

import java.util.Scanner;

public class Exercicio05 {

    static double entradaDeDados() {
        Scanner console = new Scanner(System.in);
        System.out.print("Número: ");
        double n = console.nextDouble();
        return n;
    }

    static double baskara(double a, double b, double c) {
        double resultado;
        double delta = Math.sqrt((Math.pow(b, 2) - (4 * (a * c))));

        double calcPositivo = (-b + delta) / (2 * a);
        double calcNegativo = (-b - delta) / (2 * a);

        if (calcPositivo > calcPositivo && calcPositivo >=0 ) {
            resultado = calcPositivo;
        } else if(calcNegativo>calcPositivo && calcNegativo >=0) {
            resultado = calcNegativo;
        }else{
            resultado = -1;
        }
        return resultado;

    }

    public static void main(String[] args) {
        double a = entradaDeDados();
        double b = entradaDeDados();
        double c = entradaDeDados();
        double bask = baskara(a, b, c);
        System.out.println(bask);
    }
}
