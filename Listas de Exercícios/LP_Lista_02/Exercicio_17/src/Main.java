import java.util.InputMismatchException;
import java.util.Scanner;

class CalculaVelocidadeFinal {
    public static void main(String[] args) {
        // Declaração das variáveis para armazenar velocidade inicial, aceleração e tempo
        double velocidadeInicial = 0, aceleracao = 0, tempo = 0;

        // Configura o scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira os valores
        System.out.println("Digite a velocidade inicial, a aceleração e o tempo de percurso:");

        try {
            // Lê a velocidade inicial
            System.out.print("Velocidade Inicial (m/s): ");
            velocidadeInicial = scanner.nextDouble();

            // Lê a aceleração
            System.out.print("Aceleração (m/s²): ");
            aceleracao = scanner.nextDouble();

            // Lê o tempo
            System.out.print("Tempo (s): ");
            tempo = scanner.nextDouble();

            // Verifica se o tempo é válido (deve ser positivo)
            if (tempo < 0) {
                System.out.println("Erro: O tempo não pode ser negativo.");
            } else {
                // Calcula a velocidade final
                double velocidadeFinal = velocidadeInicial + (aceleracao * tempo);

                // Exibe o resultado
                System.out.println("A velocidade final é: " + velocidadeFinal + " m/s");
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