import java.util.InputMismatchException;
import java.util.Scanner;

class ConversorCelsiusParaFahrenheit {
    public static void main(String[] args) {
        // Declaração da variável para armazenar a temperatura em Celsius
        double celsius = 0;

        // Configura o scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius (°C): ");

        try {
            // Tenta ler a temperatura em Celsius
            celsius = scanner.nextDouble();

            // Converte a temperatura para Fahrenheit
            double fahrenheit = (celsius * 1.8) + 32;

            // Exibe o resultado
            System.out.println(celsius + " °C equivalem a " + fahrenheit + " °F.");
        } catch (InputMismatchException e) {
            // Captura erros de entrada inválida
            System.out.println("Erro: Por favor, insira um número válido.");
        } finally {
            // Fecha o scanner para liberar recursos
            scanner.close();
        }
    }
}