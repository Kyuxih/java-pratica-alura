package carro;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "Onix";
        carro.ano = 2020;
        carro.cor = "Preto";

        carro.exibirFichaTecnica();
        System.out.println("Idade do carro: " + carro.calcularIdade() + " anos");
    }
}
