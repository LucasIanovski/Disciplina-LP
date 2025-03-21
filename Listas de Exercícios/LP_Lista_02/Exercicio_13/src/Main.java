import java.util.InputMismatchException;
import java.util.Scanner;

class CalculaAreaCirculo {
    public static void main(String[] args) {
        // Declaração da variável para armazenar o raio
        double raio = 0;

        // Configura o scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o raio
        System.out.print("Digite o raio do círculo: ");

        try {
            // Tenta ler o raio
            raio = scanner.nextDouble();

            // Verifica se o raio é válido (deve ser positivo)
            if (raio < 0) {
                System.out.println("Erro: O raio não pode ser negativo.");
            } else {
                // Calcula a área do círculo
                double area = Math.PI * Math.pow(raio, 2);

                // Exibe o resultado
                System.out.println("A área do círculo é: " + area);
            }
        } catch (InputMismatchException e) {
            // Captura erros de entrada inválida
            System.out.println("Erro: Por favor, insira um número válido.");
        } finally {
            // Fecha o scanner para liberar recursos
            scanner.close();
        }
    }
}
