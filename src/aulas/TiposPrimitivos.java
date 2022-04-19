package aulas;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o nome do aluno(a): ");
        String nome = ler.nextLine();
        System.out.print("Digite a nota dele(a): ");
        float nota = ler.nextFloat();
        System.out.printf("A nota de %s é %.2f \n" , nome, nota );
    }
}
