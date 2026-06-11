package pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(new Pessoa("Kelvin", 25));
        listaDePessoas.add(new Pessoa("João", 30));
        listaDePessoas.add(new Pessoa("Maria", 22));

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0));
        System.out.println("\nLista completa:");
        System.out.println(listaDePessoas);
    }
}
