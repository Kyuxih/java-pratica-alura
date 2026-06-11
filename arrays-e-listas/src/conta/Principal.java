package conta;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaBancaria(1001, 2500));
        contas.add(new ContaBancaria(1002, 5000));
        contas.add(new ContaBancaria(1003, 1800));

        ContaBancaria maior = contas.get(0);
        for (ContaBancaria c : contas) {
            if (c.getSaldo() > maior.getSaldo()) {
                maior = c;
            }
        }

        System.out.println("Conta com maior saldo: " + maior);
    }
}
