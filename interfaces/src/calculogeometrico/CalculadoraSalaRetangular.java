package calculogeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private double altura;
    private double largura;

    public CalculadoraSalaRetangular(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public void calcularArea() {
        double area = altura * largura;
        System.out.println("Área da sala: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2 * (altura + largura);
        System.out.println("Perímetro da sala: " + perimetro);
    }
}
