package titulo;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(new Titulo("O Senhor dos Anéis"));
        lista.add(new Titulo("Dom Casmurro"));
        lista.add(new Titulo("Clean Code"));
        lista.add(new Titulo("1984"));

        Collections.sort(lista);

        System.out.println("Títulos ordenados:");
        for (Titulo t : lista) {
            System.out.println(t);
        }
    }
}
