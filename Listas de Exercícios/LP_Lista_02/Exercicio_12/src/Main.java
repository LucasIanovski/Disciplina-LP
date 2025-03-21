import java.util.InputMismatchException;
import java.util.Scanner;

class CalculaMediaPonderada {
    public static void main(String[] args) {
        // Declaração das variáveis para armazenar as notas
        double n1 = 0, n2 = 0;

        // Configura o scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira as notas
        System.out.println("Digite as notas (N1 e N2) entre 0 e 10:");

        try {
            // Lê a primeira nota (N1)
            System.out.print("N1 (peso 1): ");
            n1 = scanner.nextDouble();

            // Lê a segunda nota (N2)
            System.out.print("N2 (peso 2): ");
            n2 = scanner.nextDouble();

            // Verifica se as notas estão no intervalo válido (0 a 10)
            if (n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10) {
                System.out.println("Erro: As notas devem estar entre 0 e 10.");
            } else {
                // Calcula a média ponderada
                double media = (n1 * 1 + n2 * 2) / (1 + 2);

                // Exibe o resultado
                System.out.println("A média ponderada é: " + media);
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