/*
Calcular e mostrar a média aritmética dos números pares compreendidos entre 13 e 73. ​
Utilize o laço que lhe for mais conveniente. 
 */
package Lista3;
//@Monteiro

public class Exercicio08 {

    public static void main(String[] args) {

        int soma = 0, pares = 0;
        for (int i = 13; i <= 73; i++) {

            if (i % 2 == 0) {
                soma = soma + i;

                /*Vai contar quantas vezes essa ação aconteceu e depois vai usar esse valor pra fazer a conta da média*/
                pares++;
            }
        }

        System.out.println("Média Aritimética: " + (soma / pares));
    }
}
