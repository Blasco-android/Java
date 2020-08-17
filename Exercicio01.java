/*1.Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Alcool - ate 20l de 3% desconto, acima de 20l 5% desconto
Gasolina - ate 20l de 4% desconto, acima de 20l 6% desconto
Escreva um algoritmo que leia o número de litros vendidos e o tipode combustível
( codificado da seguinte forma: A-álcool,G-gasolina),
calcule e imprima o valor a ser pago pelo cliente
sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
 */

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        float alcool = 2.9f;
        float gasolina = 3.3f;
        //boolean posto_combustivel = false;
        String option = "";
        int litros;
        float valor;
        Scanner input = new Scanner(System.in);

        while (!option.equals("A") && !option.equals("G")){
            System.out.println("Qual a Opção?" + "\n[G] - Gasolina" + "\n[A] - Alcool:");
            option = input.nextLine().toUpperCase();
            System.out.println("Quantos Litros: ");
            litros = input.nextInt();

            //Verificar se a escolha foi Alcool.
            if (option.equals("A")){
                if (litros <= 20){
                    valor = (litros * alcool) * 0.97f;
                    System.out.println("Total a Pagar: R$" + valor);
                }else if (litros > 20){
                    valor = (litros * alcool) * 0.95f;
                    System.out.println("Total a Pagar: R$" + valor);
                }
                //Se não for Alcool então é gasolina.
            }else{
                if (litros <= 20){
                    valor = (litros * gasolina) * 0.96f;
                    System.out.println("Total a Pagar: R$" + valor);
                }else if (litros > 20){
                    valor = (litros * gasolina) * 0.94f;
                    System.out.println("Total a Pagar: R$" + valor);
                }
            }
        }


    }
}
