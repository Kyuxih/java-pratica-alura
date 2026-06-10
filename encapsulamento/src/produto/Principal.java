package produto;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Celular");
        produto.setPreco(2000.0);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço original: R$ " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("Preço com 10% de desconto: R$ " + produto.getPreco());
    }
}
