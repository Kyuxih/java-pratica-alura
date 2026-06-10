package idadepessoa;

public class Principal {
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Maria");
        pessoa.setIdade(17);
        pessoa.verificarIdade();

        pessoa.setIdade(20);
        pessoa.verificarIdade();
    }
}
