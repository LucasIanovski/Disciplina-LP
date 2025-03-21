import java.util.InputMismatchException;
import java.util.Scanner;

class ConversorMilimetrosParaPolegadas {
    public static void main(String[] args) {
        // Declaração da variável para armazenar a medida em milímetros
        double milimetros = 0;

        // Configura o scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a medida em milímetros
        System.out.print("Digite a medida em milímetros (mm): ");

        try {
            // Tenta ler a medida em milímetros
            milimetros = scanner.nextDouble();

            // Converte a medida para polegadas
            double polegadas = milimetros / 25.4;

            // Exibe o resultado
            System.out.println(milimetros + " mm equivalem a " + polegadas + " polegadas.");
        } catch (InputMismatchException e) {
            // Captura erros de entrada inválida
            System.out.println("Erro: Por favor, insira um número válido.");
        } finally {
            // Fecha o scanner para liberar recursos
            scanner.close();
        }
    }
}