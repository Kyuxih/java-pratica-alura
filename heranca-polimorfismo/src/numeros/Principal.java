package numeros;

public class Principal {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);
        verificador.verificarSeEhPrimo(20);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximo = gerador.gerarProximoPrimo(17);
        System.out.println("Próximo primo após 17: " + proximo);

        verificador.listarPrimos(30);
    }
}
