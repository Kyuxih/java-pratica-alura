package vendavel;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto(50);
        System.out.println("Total (3 unidades): R$ " + produto.calcularPrecoTotal(3));
        produto.aplicarDesconto(10);
        System.out.println("Preço unitário com 10% de desconto: R$ " + produto.getPrecoUnitario());

        Servico servico = new Servico(80);
        System.out.println("Total (5 horas): R$ " + servico.calcularPrecoTotal(5));
        servico.aplicarDesconto(5);
        System.out.println("Preço hora com 5% de desconto: R$ " + servico.getPrecoHora());
    }
}
