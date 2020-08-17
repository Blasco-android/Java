import java.util.Scanner;

/*
10.Construa um algoritmo para calcular o valor a ser pago pelo período de estacionamento do automóvel (PAG).
O usuário entra com os seguintes dados:
hora (HE) e minuto (ME)de entrada,
hora (HS) e minuto (MS) de saída.
Sabe-se que este estacionamento cobra hora cheia, ou seja, se passar um minuto ele cobra a hora inteira.
O valor cobrado pelo estacionamento é:
R$ 4,00 para 1 hora de estacionamento
R$ 6,00 para 2 horas de estacionamento
R$ 1,00 por hora adicional (acima de 2 horas)
 */
public class Exercicio10 {

    public static void main(String[] args) {
        int HE, ME; //Horas e Minutos de Entrada.
        int HS, MS; //Horas e Minutos de Saida.
        int TH, TM, THadd; //Total de horas e minutos.
        int VH1=4, VH2=6, VAdd=1; //Valores da 1°, 2° e hora adicional.
        int total_valor, valor_add;
        Scanner input = new Scanner(System.in);

        System.out.print("Horario de Entrada: ");
        HE = input.nextInt();
        System.out.print("Minutos de Entrada: ");
        ME = input.nextInt();
        System.out.print("Horario de Saída: ");
        HS = input.nextInt();
        System.out.print("Minutos de Saída: ");
        MS = input.nextInt();
        TH = HS - HE;
        TM = MS - ME;

        if (TH == 1 && TM == 0){
            total_valor = VH1;
            System.out.println("Usou: " + TH + "H : " + TM + "M");
            System.out.println("Valor: R$" + total_valor);
        }else if (TH == 1 && TM > 0 || TH == 2 && TM == 0){
            total_valor = VH2;
            System.out.println("Usou: " + TH + "H : " + TM + "M");
            System.out.println("Valor: R$" + total_valor);
        }else if (TH >= 2){
            if (TM == 0){
                THadd = TH - 2;
                valor_add = THadd * VAdd;
                total_valor = VH2 + valor_add;
                System.out.println("Usou: " + TH + "H : " + TM + "M");
                System.out.println("Valor: R$" + total_valor);
            }else {
                TH = TH + 1;
                THadd = TH - 2;
                valor_add = THadd * VAdd;
                total_valor = VH2 + valor_add;
                System.out.println("Usou: " + (TH-1) + "H : " + TM + "M");
                System.out.println("Valor: R$" + total_valor);
            }
        }
    }
}
