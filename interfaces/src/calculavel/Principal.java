package calculavel;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro("Clean Code", 50);
        ProdutoFisico produto = new ProdutoFisico(200);

        livro.exibirInfo();
        produto.exibirInfo();
    }
}
