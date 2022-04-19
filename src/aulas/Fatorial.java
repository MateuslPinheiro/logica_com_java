package aulas;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n;
        System.out.print("Qual fatorial você deseja? ");
        n = read.nextInt();
        int f = 1;
        int c = n;

        while (c>=1) {
            f*= c;
            c--;
        }
        System.out.println(f);
    }


}
