package aulas;

import java.util.Scanner;

public class repeticao01 {
    public static void main(String[] args) {
        int n, s=0;
        String resp;
        Scanner read = new Scanner(System.in);
        do {
            System.out.print("Digite um número: ");
            n = read.nextInt();
            s += n;
            System.out.print("Quer continuar? [S/N] ");
            resp = read.next();
        }
        while (resp.equals("S"));
        System.out.println("A soma de todos os valores é: " + s);
    }
}
