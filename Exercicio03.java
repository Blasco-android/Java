/*
3.Construa um algoritmo que calcule e apresente quanto deve ser pago por um produto considerando
a leitura do preço de etiqueta (PE) e o código da condição de pagamento (CP) .Utilize para os
cálculos a tabela de condições de pagamento aseguir:
1 - A vista em dinheiro 10% de desconto.
2 - A vista cartão de credito 5% de desconto.
3 - 2 vezes sem juros.
4 - 3 vezes com acrescimo de 10%.
 */

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        float PE; //Preço da etiqueta.
        int CP; //Codigo da Condição de Pagamento.
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o Preço do Produto: ");
        PE = input.nextFloat();

        System.out.println("Digite o Codigo de Condição de Pagamento: ");
        System.out.println("    [1] - A Vista Cheque/Dinheiro(10% Desconto) ");
        System.out.println("    [2] - A Vista Cartão de Credito(5% Desconto) ");
        System.out.println("    [3] - Em 2 vezes (Preço Normal sem Juros) ");
        System.out.println("    [4] - Em 3 vezes (Acréscimo de 10%) ");
        CP = input.nextInt();

        float valor;
        switch (CP){
            case 1: valor = PE*0.90f;
                System.out.println("Valor normal do Produto: R$" + PE);
                System.out.println("Valor à Pagar: R$" + valor);
                break;
            case 2: valor = PE*0.95f;
                System.out.println("Valor normal do Produto: R$" + PE);
                System.out.println("Valor à Pagar: R$" + valor);
                break;
            case 3: valor = PE/2;
                System.out.println("Valor normal do Produto: R$" + PE);
                System.out.println("Valor à Pagar: 2 X R$" + valor);
                break;
            case 4: valor = (PE*1.10f)/3;
                System.out.println("Valor normal do Produto: R$" + PE);
                System.out.println("Valor à Pagar: 3 X R$" + Math.round(valor));
                break;
            default:
                System.out.println("Opção Invalida!!");
        }

    }

}
