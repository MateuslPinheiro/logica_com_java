package aulas;

import java.util.Scanner;

public class EscolhaPernas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Quantas pernas seu bicho tem? ");
        int pernas = ler.nextInt();
        String tipo;
        switch (pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6: case 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";

        }
        System.out.print("Isso é um(a) " + tipo + "!");

    }
}
