/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResolucaoProva;
//@Monteiro

import java.util.Scanner;

public class prova1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nomeAluno;
        int curso, ads = 0, sti = 0, rdcp = 0, maior = 0;
        double pAds, pSti, pRdcp;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Nome do Aluno: ");
            nomeAluno = console.next();

            System.out.println("1-ADS");
            System.out.println("2-STI");
            System.out.println("3-RDCP");
            System.out.print("Curso: ");
            curso = console.nextInt();

            switch (curso) {
                case 1:
                    ads++;
                    break;
                case 2:
                    sti++;
                    break;
                case 3:
                    rdcp++;
                    break;
            }

        }
        pAds = (ads / 7d) * 100;
        pSti = (sti / 7d) * 100;
        pRdcp = (rdcp / 7d) * 100;

        if (ads > sti && ads > rdcp) {
            maior = ads;
        } else if (sti > ads && sti > rdcp) {
            maior = sti;
        } else {
            maior = rdcp;
        }

        System.out.println("Maior: " + maior);
        System.out.println("ADS: " + pAds);
        System.out.println("STI: " + pSti);
        System.out.println("RDCP: " + pRdcp);
    }
}
