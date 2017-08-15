package Lista5;
//@Monteiro

import java.util.Scanner;

public class ALP {

    static Scanner console = new Scanner(System.in);
  
    /*MATRIZ*/
    static int sizeMatriz() {
        System.out.print("Size: ");
        int t = console.nextInt();
        return t;
    }

    static int[][] createMatriz(int line, int colun) {
        System.out.println("Create Matriz");
        int[][] matriz = new int[line][colun];
        return matriz;
    }

    static int[][] populaMatriz(int[][] matriz) {
        System.out.println("Popula Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Matriz[%d][%d]: ", i, j);
                matriz[i][j] = console.nextInt();
            }
        }
        return matriz;
    }

    
    /*VETOR*/
    static int sizeVetor() {
        System.out.print("Size: ");
        int t = console.nextInt();
        return t;
    }

    static int[] createVetor(int line) {
        int[] vetor = new int[line];
        return vetor;
    }
    
    static int[] populaVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Vetor[%d]: ", i);
            vetor[i] = console.nextInt();
        }
        return vetor;
    }
}
