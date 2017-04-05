/*
Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência
(base elevada ao expoente). Dica: use a função matemática Math.pow().
Exemplo: 5 elevado ao cubo ficaria Math.pow(5, 3) . Você pode trocar esses números por variáveis.
 */
package Lista1;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        double base, expoente, resultado;

        Scanner console = new Scanner(System.in);
        
        //ENTRADAS
        System.out.println("Insira dois numeros para ser feito um calculo de potência");
        System.out.print("Base: ");
        base = console.nextDouble();
        System.out.print("Expoente: ");
        expoente = console.nextDouble();
        
        //PROCESSAMENTO
        resultado = Math.pow(base, expoente);
        
        //SAIDA
        System.out.printf("Potência: " + resultado);

    }

}
