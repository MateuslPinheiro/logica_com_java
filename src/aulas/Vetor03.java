package aulas;

import java.util.Arrays;

public class Vetor03 {
    public static void main(String[] args) {
        int num[] = {3,5,1,8,4};
        Arrays.sort(num);
        int s = Arrays.binarySearch(num, 8);
        System.out.println("Encontrei o valor na posição: " + s);
        System.out.print("Os números do vetor são: " );
        for (int valor: num) {
            System.out.print(valor + ", ");
        }
    }
}
