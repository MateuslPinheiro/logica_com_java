package aulas;

import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float n1 = ler.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = ler.nextFloat();
        float n = (n1+n2)/2;
        System.out.println("Sua média foi " + n);
        if (n>7) {
            System.out.println("Parabéns, meu chapa!");
        } else {
            System.out.println("You need to improve, brother!");
        }
    }
}
