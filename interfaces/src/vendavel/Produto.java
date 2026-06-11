package vendavel;

public class Produto implements Vendavel {
    private double precoUnitario;

    public Produto(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentual) {
        precoUnitario -= precoUnitario * (percentual / 100);
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}
