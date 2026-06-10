package musica;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacoes;
    int numAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avaliar(double nota) {
        somaAvaliacoes += nota;
        numAvaliacoes++;
    }

    double calcularMedia() {
        return somaAvaliacoes / numAvaliacoes;
    }
}
