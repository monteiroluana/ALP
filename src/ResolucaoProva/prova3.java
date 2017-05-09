/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResolucaoProva;
//@Monteiro 

import java.util.Scanner;

public class prova3 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int matricula, maiorMatricula = 0, frequencia, contAprovado = 0;
              double media, maiorMedia = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Numero de matricula: ");
            matricula = console.nextInt();

            System.out.print("Média: ");
            media = console.nextDouble();

            System.out.print("Frequencia: ");
            frequencia = console.nextInt();

            if (media >= 7 && frequencia >= 16) {
                System.out.println("Matricula: " + matricula + " APROVADO!");
                contAprovado++;
            } else {
                System.out.println("Matricula: " + matricula + " REPROVADO!");
            }

            if (media > maiorMedia) {
                maiorMedia = media;
                maiorMatricula = matricula;
            }
        }

        System.out.printf("%d obteve a maior média: %.2f: \n", maiorMatricula, maiorMedia);
    }
}
