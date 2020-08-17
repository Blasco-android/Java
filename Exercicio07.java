/*
7.A empresa XKW concedeu um bônus de 20% do valor do salário a todos os funcionários com tempo de trabalho
 na empresa igual ou superior a 5 anos e de 10% aos demais. Faça um algoritmo que receba o salário e o
 tempo de serviço deum funcionário, calcule e mostre o valor do bônus recebido por ele.
 */

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        int tempo_trabalho;
        float salario;
        float bonus;
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos anos de Empresa tem o Funcionario: ");
        tempo_trabalho = input.nextInt();
        System.out.print("Qual o Salario do Funcionario: ");
        salario = input.nextFloat();

        if(tempo_trabalho >= 5){
            bonus = salario*1.2f;
        }else {
            bonus = salario*1.1f;
        }
        System.out.println("Funcionario receberá: R$" + bonus);
    }
}
