package animal;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.emitirSom();
        cachorro.abanarRabo();

        gato.emitirSom();
        gato.arranharMoveis();
    }
}
