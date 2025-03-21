import java.util.InputMismatchException;
import java.util.Scanner;

class ConversorMilhasParaQuilometros {
    public static void main(String[] args) {
        // Declaração da variável para armazenar a distância em milhas
        double milhas = 0;

        // Configura o scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a distância em milhas
        System.out.print("Digite a distância em milhas (mi): ");

        try {
            // Tenta ler a distância em milhas
            milhas = scanner.nextDouble();

            // Converte a distância para quilômetros
            double quilometros = milhas * 1.60934;

            // Exibe o resultado
            System.out.println(milhas + " milhas equivalem a " + quilometros + " quilômetros.");
        } catch (InputMismatchException e) {
            // Captura erros de entrada inválida
            System.out.println("Erro: Por favor, insira um número válido.");
        } finally {
            // Fecha o scanner para liberar recursos
            scanner.close();
        }
    }
}