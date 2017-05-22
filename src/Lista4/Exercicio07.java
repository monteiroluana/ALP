/*
Faça uma função que recebe por parâmetro o raio (R) de uma esfera e calcula o seu volume, onde o
volume é dado por:
V = (4/3) × π × R³

 */
package Lista4;
//@Monteiro

import java.util.Scanner;

public class Exercicio07 {

    static double entradaDeDados() {
        Scanner console = new Scanner(System.in);
        System.out.print("Raio: ");
        double raio = console.nextDouble();
        return raio;
    }

    static double volume(double r) {
        double volume = (4 / 3) * Math.PI * Math.pow(r, 3);
        return volume;
    }
    public static void main(String[] args) {
        double raio = entradaDeDados();
        double resultado = volume(raio);
        System.out.println(resultado);
    }
}
