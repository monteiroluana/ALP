/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista4;
//@Monteiro

import java.util.Scanner;

public class Exercicio11 {
    static double inputMedia(){
        Scanner console = new Scanner(System.in);
        System.out.print("Media: ");
        double media = console.nextDouble();
        return media;    
    }
    
    static String conceito(double media){
    String conceito="";
        if(media>=0.0&&media<=4.9){conceito="D";}
        else if(media>=5.0&&media<=6.9){conceito="C";}
        else if (media>=7.0&&media<=8.9){conceito="B";}
        else if (media>=9.0&&media<=10.0){conceito="A";}
        return conceito;
    }
    
    static void mostrarConceito(String conceito){
            System.out.println("Conceito: "+conceito);
    }
    
    public static void main(String[] args) {
        double nota = inputMedia();
        String conceito = conceito(nota);
        mostrarConceito(conceito);
    }
}
