package conta;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(1000);
        conta.consultarSaldo();
        conta.sacar(200);
        conta.consultarSaldo();
        conta.cobrarTarifaMensal();
        conta.consultarSaldo();
    }
}
