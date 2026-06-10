package musica;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.titulo = "Minha música";
        musica.artista = "Meu artista";
        musica.anoLancamento = 2024;

        musica.exibirFichaTecnica();
        musica.avaliar(5);
        musica.avaliar(4);
        musica.avaliar(3.5);

        System.out.println("Média das avaliações: " + musica.calcularMedia());
    }
}
