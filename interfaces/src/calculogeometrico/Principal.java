package calculogeometrico;

public class Principal {
    public static void main(String[] args) {
        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular(5, 8);
        sala.calcularArea();
        sala.calcularPerimetro();
    }
}
