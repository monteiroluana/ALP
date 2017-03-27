//  20/03/2017
package alp_2;

import java.util.Scanner;

public class CalculoDaMediaPonderada {

    public static void main(String[] args) {
        float n1, n2, media;
        float P1, P2;
        String nomeAluno;
        P1 = 0.4f; //Estou declarando/afirmando que esse nº é float e não double
        P2 = 0.6f;

        Scanner console = new Scanner(System.in);

        System.out.println("Calculo Média Ponderada");

        System.out.print("Nome do Aluno: ");
        nomeAluno = console.next();

        System.out.print("Nota 1: ");
        n1 = console.nextFloat();

        System.out.print("Nota2: ");
        n2 = console.nextFloat();

        //função matemática do java
        double r = Math.sqrt(n2);
        System.out.println(r);

        media = (n1 * P1) + (n2 * P2);
        System.out.printf("Nome do aluno %s \n Média %.2f \n", nomeAluno, media);

    }

}
