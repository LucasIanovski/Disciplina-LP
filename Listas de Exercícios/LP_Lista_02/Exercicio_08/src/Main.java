import java.util.InputMismatchException;
import java.util.Scanner;

class ConversorPolegadasParaMilimetros {
    public static void main(String[] args) {
        // Declaração da variável para armazenar a medida em polegadas
        double polegadas = 0;

        // Configura o scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a medida em polegadas
        System.out.print("Digite a medida em polegadas (in): ");

        try {
            // Tenta ler a medida em polegadas
            polegadas = scanner.nextDouble();

            // Converte a medida para milímetros
            double milimetros = polegadas * 25.4;

            // Exibe o resultado
            System.out.println(polegadas + " polegadas equivalem a " + milimetros + " milímetros.");
        } catch (InputMismatchException e) {
            // Captura erros de entrada inválida
            System.out.println("Erro: Por favor, insira um número válido.");
        } finally {
            // Fecha o scanner para liberar recursos
            scanner.close();
        }
    }
}