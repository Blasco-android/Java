/*
5.Implemente um código para aprovar empréstimo bancário. O código deve pedir 3 informações:
valor do empréstimo, número de parcelas e salário do solicitante.
Aprovar empréstimo caso o valor das parcelas representem no máximo 30% do salário do solicitante.
 */

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        float emprestimo;
        int parcelas;
        float valor_parcelas;
        float salario;
        float porcentual; //Porcentual de 30% para calaculo do emprestimo em cima do salario.
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do emprestimo: R$");
        emprestimo = input.nextFloat();
        System.out.print("Digite o números de parcelas: ");
        parcelas = input.nextInt();
        System.out.print("Digite o Salário: R$");
        salario = input.nextFloat();
        valor_parcelas = emprestimo/parcelas;
        porcentual = salario*0.3f;

        if (valor_parcelas <= porcentual ){
            System.out.println("========================================");
            System.out.println("           Emprestimo Aprovado ;)       ");
            System.out.println("- Valor do Emprestimo R$" + emprestimo);
            System.out.println("- Pagamento em " + parcelas + "X de R$" + (emprestimo/parcelas));
        }else{
            System.out.println("Esprestimo Negado :(");
        }

    }

}
