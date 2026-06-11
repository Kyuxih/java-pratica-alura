package animais;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        Animal animal = (Animal) cachorro;
        animal.emitirSom();

        if (animal instanceof Cachorro) {
            Cachorro c = (Cachorro) animal;
            c.abanarRabo();
        }
    }
}
