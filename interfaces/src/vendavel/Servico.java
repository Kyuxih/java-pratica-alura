package vendavel;

public class Servico implements Vendavel {
    private double precoHora;

    public Servico(double precoHora) {
        this.precoHora = precoHora;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentual) {
        precoHora -= precoHora * (percentual / 100);
    }

    public double getPrecoHora() {
        return precoHora;
    }
}
