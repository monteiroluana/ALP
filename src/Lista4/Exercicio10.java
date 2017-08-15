/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista4;
//@Monteiro

import java.util.Scanner;

public class Exercicio10 {

    static int idade() {
        Scanner console = new Scanner(System.in);
        System.out.print("Idade: ");
        int idade = console.nextInt();
        return idade;
    }

    static String categoria(int idade) {
        String categoria = "";
        if (idade >= 5 && idade <= 7) {
            categoria = "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            categoria = "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil B";
        } else if (idade >= 18) {
            categoria = "Adulto";
        }

        return categoria;
    }

    static void mostrar(String categoria) {
        System.out.println("Categoria: "+categoria);
    }
    
    public static void main(String[] args) {
        int idade = idade();
        String categ = categoria(idade);
        mostrar(categ);
    }
}
