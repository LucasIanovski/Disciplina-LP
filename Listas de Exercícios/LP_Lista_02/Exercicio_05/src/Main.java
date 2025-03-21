import java.util.InputMismatchException;
import java.util.Scanner;

class ConversorVelocidade {
    public static void main(String[] args) {
        // Declaração da variável para armazenar a velocidade em km/s
        double velocidadeKmPorS = 0;

        // Configura o scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a velocidade em km/s
        System.out.print("Digite a velocidade em km/s: ");

        try {
            // Tenta ler a velocidade
            velocidadeKmPorS = scanner.nextDouble();

            // Converte a velocidade para m/s
            double velocidadeMPorS = velocidadeKmPorS * 1000;

            // Exibe o resultado
            System.out.println(velocidadeKmPorS + " km/s equivalem a " + velocidadeMPorS + " m/s.");
        } catch (InputMismatchException e) {
            // Captura erros de entrada inválida
            System.out.println("Erro: Por favor, insira um número válido.");
        } finally {
            // Fecha o scanner para liberar recursos
            scanner.close();
        }
    }
}
