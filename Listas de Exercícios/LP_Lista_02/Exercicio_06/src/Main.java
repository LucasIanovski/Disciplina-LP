import java.util.InputMismatchException;
import java.util.Scanner;

class ConversorVelocidadeMsParaKms {
    public static void main(String[] args) {
        // Declaração da variável para armazenar a velocidade em m/s
        double velocidadeMPorS = 0;

        // Configura o scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a velocidade em m/s
        System.out.print("Digite a velocidade em m/s: ");

        try {
            // Tenta ler a velocidade
            velocidadeMPorS = scanner.nextDouble();

            // Converte a velocidade para km/s
            double velocidadeKmPorS = velocidadeMPorS / 1000;

            // Exibe o resultado
            System.out.println(velocidadeMPorS + " m/s equivalem a " + velocidadeKmPorS + " km/s.");
        } catch (InputMismatchException e) {
            // Captura erros de entrada inválida
            System.out.println("Erro: Por favor, insira um número válido.");
        } finally {
            // Fecha o scanner para liberar recursos
            scanner.close();
        }
    }
}
