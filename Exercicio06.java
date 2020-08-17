/*
6.Um  funcionário  de  uma  empresa  recebe  um  aumento  salarial anualmente. Sabe-se que:
A.Esse funcionário foi contratado em 2002, com salário inicial deR$ 600,00;
B.Em 2003 recebeu um aumento de 1,5% sobre seu salário inicial;
C.A partir  de 2004(inclusive),  os  aumentos  corresponderam  ao dobro  do percentual do ano anterior;
Faça um programa que determine o salário atual deste funcionário
 */
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        int admissao = 2002;
        int salario_inicial = 600;
        float primeiro_aumento = .015f; //1,5% de aumento.
        int ano_atual;
        float salario_atual=salario_inicial;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o Ano Atual do Funcionário: ");
        ano_atual = input.nextInt();

        for (int i = admissao+1; i < ano_atual; i++){
            primeiro_aumento = primeiro_aumento * 2;
            salario_atual = salario_atual * (primeiro_aumento+1);
            //System.out.printf("Salario em %d: R$%.2f. Teve %.1f porcento de aumento.\n",
                // i+1, salario_atual, primeiro_aumento*100);
        }
        System.out.printf("Salario em %d: R$%.2f. Teve %.1f porcento de aumento.\n",
                ano_atual, salario_atual, primeiro_aumento*100);
    }
}
