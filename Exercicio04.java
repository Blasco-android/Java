/*
4.Para uma turma de 45 alunos, construa um algoritmo que determine:
a.A idade média dos alunos com menos de 1,70m de altura;
b.E a altura média dos alunos com mais de 20 anos.
 */

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        int idade=1;
        int contadorI=0; //Variavel de contabilização.
        int contadorA=0; //Variavel de contabilização.
        int somaI=0; //Variavel de agregação.
        int somaA=0; //Variavel de agregação.
        float altura;
        Scanner input = new Scanner(System.in);

        while (idade > 0){
            System.out.println("Digite a Idade do Aluno(Obs.: 0(zero) encerra programa): ");
            idade = input.nextInt();
            if (idade == 0){
                System.out.println("Encerrando Programa...");
                break;
            }
            System.out.println("Digite a Altura do Aluno: ");
            altura = input.nextFloat();
            if (altura < 1.7f){
                somaI = somaI + idade;
                contadorI++;
            }else if (idade > 20){
                somaA = (int) (somaA + altura);
                contadorA++;
            }
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("A idade média dos alunos com menos de 1,70m de altura é: " + (somaI/contadorI));
        System.out.println("A altura média dos alunos com mais de 20 anos é: " + (somaA/contadorA));

        input.close();
    }

}
