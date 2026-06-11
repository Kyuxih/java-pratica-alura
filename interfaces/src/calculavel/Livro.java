package calculavel;

public class Livro implements Calculavel {
    private String titulo;
    private double precoBase;

    public Livro(String titulo, double precoBase) {
        this.titulo = titulo;
        this.precoBase = precoBase;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase * 0.9;
    }

    public void exibirInfo() {
        System.out.println("Livro: " + titulo + " | Preço final: R$ " + calcularPrecoFinal());
    }
}
