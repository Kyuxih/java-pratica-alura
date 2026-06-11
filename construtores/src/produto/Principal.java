package produto;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Arroz", 25.0, 10));
        lista.add(new Produto("Feijão", 12.0, 20));
        lista.add(new Produto("Macarrão", 8.0, 15));

        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Produto no índice 1: " + lista.get(1));
        System.out.println("\nLista completa:");
        System.out.println(lista);

        System.out.println("\n--- Produto Perecível ---");
        ProdutoPerecivel perecivel = new ProdutoPerecivel("Leite", 6.0, 5, "15/07/2026");
        System.out.println(perecivel);
    }
}
