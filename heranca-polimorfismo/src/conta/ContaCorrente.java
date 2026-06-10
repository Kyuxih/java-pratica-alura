package conta;

public class ContaCorrente extends ContaBancaria {
    private static final double TARIFA_MENSAL = 12.0;

    public void cobrarTarifaMensal() {
        saldo -= TARIFA_MENSAL;
        System.out.println("Tarifa mensal de R$ " + TARIFA_MENSAL + " cobrada.");
    }
}
