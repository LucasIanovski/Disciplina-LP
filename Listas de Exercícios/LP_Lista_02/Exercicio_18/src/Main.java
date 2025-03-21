import java.util.InputMismatchException;
import java.util.Scanner;

class ResolveEquacaoPrimeiroGrau {
    public static void main(String[] args) {
        // Declaração das variáveis para armazenar os coeficientes A e B
        double a = 0, b = 0;

        // Configura o scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira os coeficientes
        System.out.println("Digite os coeficientes A e B da equação do primeiro grau (ax + b = 0):");

        try {
            // Lê o coeficiente A
            System.out.print("Coeficiente A: ");
            a = scanner.nextDouble();

            // Lê o coeficiente B
            System.out.print("Coeficiente B: ");
            b = scanner.nextDouble();

            // Verifica se A é zero (equação inválida)
            if (a == 0) {
                if (b == 0) {
                    System.out.println("A equação tem infinitas soluções (qualquer valor de x satisfaz).");
                } else {
                    System.out.println("A equação não tem solução (impossível).");
                }
            } else {
                // Calcula a solução da equação
                double x = -b / a;

                // Exibe o resultado
                System.out.println("A solução da equação é: x = " + x);
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