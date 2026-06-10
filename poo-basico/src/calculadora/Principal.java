package calculadora;

public class Principal {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);

        System.out.println("O dobro do número é: " + resultado);
    }
}
