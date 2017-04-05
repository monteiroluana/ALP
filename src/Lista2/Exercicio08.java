/*
Criar um programa para calcular o valor da multa a ser paga de anuidade de uma
associação. A anuidade deve ser paga no mês de janeiro. Por mês, é cobrado 5% de
juros (com juros sobre juros). Por exemplo, uma associação de R$100 paga em janeiro,
custa R$ 100; em fevereiro, custa R$105; em março, custa R$110,25; e, em dezembro,
R$171,03. 
 */
package Lista2;
//@Monteiro

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Insira o valor da Associação: ");
        double associacao = Double.parseDouble(console.nextLine());
        
        System.out.println("");
        System.out.println("O que deseja ver primeiro?");
        System.out.println("(0)Veja o valor da anuidade");
        System.out.println("(1 à 12) Valor referente a cada mês");
        int acao = Integer.parseInt(console.nextLine());

        double janeiro = associacao;
        double fevereiro = janeiro * 1.05;
        double marco = fevereiro * 1.05;
        double abril = marco * 1.05;
        double maio = abril * 1.05;
        double junho = maio * 1.05;
        double julho = junho * 1.05;
        double agosto = julho * 1.05;
        double setembro = agosto * 1.05;
        double outubro = setembro * 1.05;
        double novembro = outubro * 1.05;
        double dezembro = novembro * 1.05;
        double total = janeiro + fevereiro + marco + abril + maio + junho + julho + agosto + setembro + outubro + novembro + dezembro;

        switch (acao) {
            case 1:
                System.out.printf("Janeiro R$ %.2f\n", janeiro);
                break;
            case 2:
                System.out.printf("Fevereiro R$ %.2f\n", fevereiro);
                break;
            case 3:
                System.out.printf("Março R$ %.2f\n", marco);
                break;
            case 4:
                System.out.printf("Abril R$ %.2f\n", abril);
                break;
            case 5:
                System.out.printf("Maio R$ %.2f\n", maio);
                break;
            case 6:
                System.out.printf("Junho R$ %.2f\n", junho);
                break;
            case 7:
                System.out.printf("Julho R$ %.2f\n", julho);
                break;
            case 8:
                System.out.printf("Agosto R$ %.2f\n", agosto);
                break;
            case 9:
                System.out.printf("Setembro R$ %.2f\n", setembro);
                break;
            case 10:
                System.out.printf("Outubro R$ %.2f\n", outubro);
                break;
            case 11:
                System.out.printf("Novembro R$ %.2f\n", novembro);
                break;
            case 12:
                System.out.printf("Dezembro R$ %.2f\n", dezembro);
                break;
            case 0:
                System.out.printf("Anuidade R$ %.2f\n", total);
                break;
            default:
                System.out.println("Entrada Inválida");
        }

    }
}
