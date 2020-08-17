import java.util.Scanner;

/*
9.Elabore  um  algoritmo  que,  dada  a  idade  de  um  nadador, classifique-o  em  uma  das seguintes categorias:
Infantil : 5 a 10 anos;
Juvenil : 11 a 17 anos;
Sênior: 18 anos ou mais.
 */
public class Exercicio09 {

    public static void main(String[] args) {
        int idade;
        String nome;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o Nome do Nadador: ");
        nome = input.nextLine();
        System.out.print("Digite a Idade do Nadador: ");
        idade = input.nextInt();

        if (idade >= 5 && idade <= 10){
            System.out.println("Nadador: " + nome + "\nClassificação: Infantil");
        }else if (idade >= 11 && idade < 18){
            System.out.println("Nadador: " + nome + "\nClassificação: Juvenil");
        }else if (idade >= 18){
            System.out.println("Nadador: " + nome + "\nClassificação: Senior");
        }
    }
}
