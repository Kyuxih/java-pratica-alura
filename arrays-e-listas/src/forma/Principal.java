package forma;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(5));
        formas.add(new Quadrado(4));

        for (Forma f : formas) {
            System.out.println("Área: " + f.calcularArea());
        }
    }
}
