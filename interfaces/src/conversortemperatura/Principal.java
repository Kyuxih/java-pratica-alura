package conversortemperatura;

public class Principal {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        conversor.celsiusParaFahrenheit(30);
        conversor.fahrenheitParaCelsius(86);
    }
}
