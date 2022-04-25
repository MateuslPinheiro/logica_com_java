package aulas;

public class TesteFuncao {
    static String contador(int i, int f) {
        String s = "";
        for(int c = i; c<=f; c++){
            s += c + " ";
        }
        return s;
    }

    static void soma(int a, int b){
        int s = a+b;
        System.out.println(" A soma é " + s);
    }
    static int somaf(int a, int b){
        int s = a+b;
        return s;
    }
    public static void main(String[] args) {
        //soma(5,2);
        int sm = somaf(5,3);
        System.out.println("A soma vale " + sm);

    }
}
