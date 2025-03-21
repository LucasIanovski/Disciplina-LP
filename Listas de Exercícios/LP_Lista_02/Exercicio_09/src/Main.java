import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorQuilometrosParaMilhas {
    public static void main(String[] args) {
        // Declaração da variável para armazenar a distância em quilômetros
        double quilometros = 0;

        // Configura o scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a distância em quilômetros
        System.out.print("Digite a distância em quilômetros (km): ");

        try {
            // Tenta ler a distância em quilômetros
            quilometros = scanner.nextDouble();

            // Converte a distância para milhas
            double milhas = quilometros / 1.60934;

            // Exibe o resultado
            System.out.println(quilometros + " km equivalem a " + milhas + " milhas.");
        } catch (InputMismatchException e) {
            // Captura erros de entrada inválida
            System.out.println("Erro: Por favor, insira um número válido.");
        } finally {
            // Fecha o scanner para liberar recursos
            scanner.close();
        }
    }
}