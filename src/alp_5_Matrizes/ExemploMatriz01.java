
package alp_5_Matrizes;
//@Monteiro

import java.util.Scanner;

public class ExemploMatriz01 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m[][] = new int[2][4];

        for (int i = 0; i < 2; i++) {
            System.out.println("Informe os elementos da linha " + (i + 1) + ": ");
            for (int j = 0; j < 4; j++) {
                System.out.print("coluna " + (j + i) + ": ");
                m[i][j] = console.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("linha " + (i + 1) + ": ");
            for (int j = 0; j < 4; j++) {
                System.out.println("coluna"+(j+i)+": "+m[i][j]);
            }
        }

    }
}
