/*
8.Faça  um  algoritmo  que  leia  duas notas  obtidas  por  um  aluno na  disciplina  de Cálculo,
o  número  de  aulas  ministradas  e  o número  de  aulas  assistidas  por  este  aluno nesta  disciplina.
Calcule  e  mostre  a  média  final  deste  aluno  e  diga  se  ele  foi aprovado ou  reprovado.
Considere  que  para  um  aluno  ser  aprovado  ele  deve  obter média  final igual ou maior
a 6 e ter no mínimo 75% de freqüência.
 */

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        float nota1, nota2;
        float media;
        int aulas_ministradas = 10;
        int aulas_assistidas;
        int frequencia = (int) (aulas_ministradas * 1.7f); //Porcentual minimo para aprovação
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a 1° nota: ");
        nota1 = input.nextFloat();
        System.out.print("Digite a 2° nota: ");
        nota2 = input.nextFloat();
        System.out.print("Total de Aulas Assistidas: ");
        aulas_assistidas = input.nextInt();
        media = (nota1+nota2)/2;

        if (media >= 6 && aulas_assistidas >= frequencia){
            System.out.println("--- Aluno Aprovado ;) ---");
        }else {
            System.out.println("--- Aluno Reprovado :( ---");
        }
    }
}
