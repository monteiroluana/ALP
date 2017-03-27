// 13/03/2017
package alp_1;

import java.util.Scanner;

public class TiposDadosJava {
   public static void main(String[] args){
   
       Scanner leitor = new Scanner(System.in); //importando entrada de dados
       
       
       int idade; //declaração da variável idade
       String nome = "Senac"; //o único tipo que não fica azul e começa com letra maiuscula
       boolean b = true;
       float cotacaoDolar = 3.14f; //f no final do numero pra confimar seu tipo
       
       idade = 70; // ctrl + space completa 
       
       System.out.println("Bem vindo ao " + nome + "!");
       System.out.println("Em 2016 o " + nome + " completou " + idade + " anos");
       System.out.println("Cotação do Dólar: " + cotacaoDolar);
       System.out.println(b);
       idade = leitor.nextInt(); //comando leia
       nome = leitor.next();
       System.out.println("Bem vindo " + nome);
       System.out.println("Sua idade é "+ idade);        
       
   }
 }

