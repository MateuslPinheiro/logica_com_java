package aulas;

import java.util.Scanner;

public class SistemaDeVotacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Ano de nascimento: ");
        int a, i;
        a = ler.nextInt();
        i = 2021 - a + 1;
        System.out.println("Sua idade é " + i);
        if (i<16) {
            System.out.println("Você não vota");
        } else if ((i>=16 && i<18) || i>70) {
            System.out.println("Seu voto é opcional");
        } else if (i>=18 && i<=70) {
            System.out.println("Tem que votar, meu chapa!");
        }
    }
}
