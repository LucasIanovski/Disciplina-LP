import java.util.InputMismatchException;
import java.util.Scanner;

class CalculaAreaTrianguloRetangulo {
    public static void main(String[] args) {
        // Declaração das variáveis para armazenar a base e a altura
        double base = 0, altura = 0;

        // Configura o scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a base e a altura
        System.out.println("Digite a base e a altura do triângulo retângulo:");

        try {
            // Lê a base
            System.out.print("Base: ");
            base = scanner.nextDouble();

            // Lê a altura
            System.out.print("Altura: ");
            altura = scanner.nextDouble();

            // Verifica se a base e a altura são válidas (devem ser positivas)
            if (base < 0 || altura < 0) {
                System.out.println("Erro: A base e a altura não podem ser negativas.");
            } else {
                // Calcula a área do triângulo retângulo
                double area = (base * altura) / 2;

                // Exibe o resultado
                System.out.println("A área do triângulo retângulo é: " + area);
            }
        } catch (InputMismatchException e) {
            // Captura erros de entrada inválida
            System.out.println("Erro: Por favor, insira números válidos.");
        } finally {
            // Fecha o scanner para liberar recursos
            scanner.close();
        }
    }
}