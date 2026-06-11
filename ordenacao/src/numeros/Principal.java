package numeros;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(8);
        numeros.add(3);
        numeros.add(10);
        numeros.add(1);
        numeros.add(6);

        Collections.sort(numeros);

        System.out.println(numeros);
    }
}
