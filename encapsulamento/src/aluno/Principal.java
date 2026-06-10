package aluno;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Kaique");
        aluno.setNotas(new double[]{8.5, 7.0, 9.2});

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Média: " + aluno.calcularMedia());
    }
}
