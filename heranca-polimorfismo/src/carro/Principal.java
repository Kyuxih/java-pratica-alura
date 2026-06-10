package carro;

public class Principal {
    public static void main(String[] args) {
        ModeloCarro carro = new ModeloCarro();
        carro.definirModelo("Gol");
        carro.definirPrecos(45000, 42000, 39000);
        carro.exibirInfo();
    }
}
