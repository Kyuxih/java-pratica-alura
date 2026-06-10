package contabancaria;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(12345);
        conta.setSaldo(1000.0);
        conta.titular = "João";

        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Saldo: R$ " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);
    }
}
