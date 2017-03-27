/*
Fazer um algoritmo que leia os dois lados A e B de um triângulo retângulo e 
calcula a hipotenusa do triângulo. Para esse caso, considere que 
hipotenusa = √A²+B² . Dica: nesse programa, você deve usar a função 
matemática Math.sqrt() . Por exemplo, a raiz de 121 ficaria Math.sqrt(121)
 */
package exercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        double a, b, hipotenusa;
        
        Scanner console = new Scanner (System.in);
        
        //ENTRADAS
        System.out.print("Insira lado A: ");
        a = console.nextDouble();
         System.out.print("Insira lado B: ");
        b = console.nextDouble();
        
        //PROCESSAMENTO
        hipotenusa = Math.sqrt(a*a + b*b);
        System.out.printf("Hipotenusa: %.2f", hipotenusa);
        
        
    }
    
}
