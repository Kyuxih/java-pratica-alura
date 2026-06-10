package carro;

public class ModeloCarro extends Carro {

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preços nos últimos 3 anos:");
        for (int i = 0; i < precos.length; i++) {
            System.out.println("Ano " + (i + 1) + ": R$ " + precos[i]);
        }
        exibirMenorPreco();
        exibirMaiorPreco();
    }
}
