import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        int opcao = leitura.nextInt();

        if (opcao == 1) {
            System.out.println("Digite o lado do quadrado:");
            double lado = leitura.nextDouble();
            double area = lado * lado;
            System.out.println("Área do quadrado: " + area);
        } else if (opcao == 2) {
            System.out.println("Digite o raio do círculo:");
            double raio = leitura.nextDouble();
            double area = 3.14 * raio * raio;
            System.out.println("Área do círculo: " + area);
        } else {
            System.out.println("Opção inválida");
        }

        leitura.close();
    }
}
