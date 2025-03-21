import java.util.InputMismatchException;
import java.util.Scanner;

class CalculaVolumeCone {
    public static void main(String[] args) {
        // Declaração das variáveis para armazenar o raio e a altura
        double raio = 0, altura = 0;

        // Configura o scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o raio e a altura
        System.out.println("Digite o raio e a altura do cone:");

        try {
            // Lê o raio
            System.out.print("Raio: ");
            raio = scanner.nextDouble();

            // Lê a altura
            System.out.print("Altura: ");
            altura = scanner.nextDouble();

            // Verifica se o raio e a altura são válidos (devem ser positivos)
            if (raio < 0 || altura < 0) {
                System.out.println("Erro: O raio e a altura não podem ser negativos.");
            } else {
                // Calcula o volume do cone
                double volume = (1.0 / 3.0) * Math.PI * Math.pow(raio, 2) * altura;

                // Exibe o resultado
                System.out.println("O volume do cone é: " + volume);
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