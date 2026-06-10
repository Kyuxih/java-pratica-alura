package aluno;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "Kaique";
        aluno.idade = 20;

        aluno.exibirInformacoes();
    }
}
