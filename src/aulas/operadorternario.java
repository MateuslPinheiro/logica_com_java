package aulas;

import java.util.Scanner;

public class operadorternario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String r;
        int n1;
     //   int n1 = (int) (1 + Math.random() * (99-1));
        int n2 = (int) (1 + Math.random() * (99-1));
        System.out.print("Coloque um número de 1 a 99: ");
        n1 = ler.nextInt();
        System.out.println("Número 2 é: " + n2);
        r = (n1>n2)?"Então receeeeba!":"afffff";
        System.out.println(r);
    }
}
