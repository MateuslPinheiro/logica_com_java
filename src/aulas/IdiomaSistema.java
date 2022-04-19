package aulas;

import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println("O idioma do sistema é:");
        System.out.print(loc.getDisplayLanguage());
        System.out.print(" - ");
        System.out.println(loc.getLanguage());
    }
}
