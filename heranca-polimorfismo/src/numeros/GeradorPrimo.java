package numeros;

public class GeradorPrimo extends NumerosPrimos {

    public int gerarProximoPrimo(int ultimoConhecido) {
        int proximo = ultimoConhecido + 1;
        while (!verificarPrimalidade(proximo)) {
            proximo++;
        }
        return proximo;
    }
}
