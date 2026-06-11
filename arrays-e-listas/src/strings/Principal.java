package strings;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> linguagens = new ArrayList<>();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("JavaScript");

        for (String linguagem : linguagens) {
            System.out.println(linguagem);
        }
    }
}
