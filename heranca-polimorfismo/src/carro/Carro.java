package carro;

public class Carro {
    protected String modelo;
    protected double[] precos;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precos = new double[]{precoAno1, precoAno2, precoAno3};
    }

    public void exibirMenorPreco() {
        double menor = precos[0];
        for (double preco : precos) {
            if (preco < menor) {
                menor = preco;
            }
        }
        System.out.println("Menor preço: R$ " + menor);
    }

    public void exibirMaiorPreco() {
        double maior = precos[0];
        for (double preco : precos) {
            if (preco > maior) {
                maior = preco;
            }
        }
        System.out.println("Maior preço: R$ " + maior);
    }
}
