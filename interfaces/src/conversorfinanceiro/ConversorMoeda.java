package conversorfinanceiro;

public class ConversorMoeda implements ConversaoFinanceira {
    private static final double TAXA_CAMBIO = 5.0;

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double valorReal = valorDolar * TAXA_CAMBIO;
        System.out.println("US$ " + valorDolar + " equivale a R$ " + valorReal);
    }
}
