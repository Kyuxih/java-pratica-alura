package calculavel;

public class ProdutoFisico implements Calculavel {
    private double precoBase;

    public ProdutoFisico(double precoBase) {
        this.precoBase = precoBase;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase * 1.05;
    }

    public void exibirInfo() {
        System.out.println("Produto físico | Preço final: R$ " + calcularPrecoFinal());
    }
}
