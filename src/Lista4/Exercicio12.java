/*
Faça uma função que recebe, por parâmetro, a altura (alt) e o sexo de uma pessoa, e retorna o seu peso
ideal.
Para homens, você calcular o peso ideal usando a fórmula: P = 72,7 * altura - 58.
Para mulheres, utilize a fórmula: P = 62,1 * altura – 44,7.
 */
package Lista4;
//@Monteiro

import java.util.Scanner;

public class Exercicio12 {

    static double entradaAltura() {
        Scanner console = new Scanner(System.in);
        System.out.print("Altura: ");
        double altura = console.nextDouble();
        return altura;
    }

    static String entradaSexo() {
        Scanner console = new Scanner(System.in);
        String sexo;
        System.out.print("Sexo F/M: ");
        sexo = console.next();
        sexo = sexo.toUpperCase();

        return sexo;
    }

    static double pesoIdeal(double alt, String sexo) {
        double P;
        if (sexo.equals("F")) {
            P = (62.1 * alt) - 44.7;
        } else {
            P = (72.7 * alt) - 58;
        }

        return P;
    }

    static void imprimir(double imc) {
        System.out.println("Peso ideal: " + imc);
    }

    public static void main(String[] args) {

        double altura = entradaAltura();
        String sexo = entradaSexo();
        double imc = pesoIdeal(altura, sexo);
        imprimir(imc);
    }
}
