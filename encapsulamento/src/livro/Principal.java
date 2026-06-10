package livro;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("Dom Casmurro");
        livro.setAutor("Machado de Assis");

        livro.exibirDetalhes();
    }
}
