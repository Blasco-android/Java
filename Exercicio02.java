/*
2. Escreva um algoritmos que calcule a média final,
dadas as notasde 3 provas e produzir uma saída com a média.
 */

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        int nota[] = new int[3];
        int soma = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nota.length; i++){
            System.out.println("Digite a " + (i+1) + "° nota: ");
            nota[i] = input.nextInt();
            soma += nota[i];
        }
        System.out.println("A Media de notas é: " + (soma/ nota.length));

    }

}
