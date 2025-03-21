import java.util.InputMismatchException;
import java.util.Scanner;

class DescobreEquacaoSegundoGrau {
    public static void main(String[] args) {
        // Declaração das variáveis para armazenar as raízes
        double x1 = 0, x2 = 0;

        // Configura o scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira as raízes
        System.out.println("Digite as raízes da equação do segundo grau (x1 e x2):");

        try {
            // Lê a primeira raiz (x1)
            System.out.print("x1: ");
            x1 = scanner.nextDouble();

            // Lê a segunda raiz (x2)
            System.out.print("x2: ");
            x2 = scanner.nextDouble();

            // Calcula os coeficientes da equação
            double a = 1; // Coeficiente de x² é sempre 1 na forma fatorada
            double b = -(x1 + x2); // Coeficiente de x
            double c = x1 * x2; // Termo independente

            // Exibe a equação do segundo grau
            System.out.println("A equação do segundo grau é:");
            System.out.println(a + "x² + " + b + "x + " + c + " = 0");
        } catch (InputMismatchException e) {
            // Captura erros de entrada inválida
            System.out.println("Erro: Por favor, insira números válidos.");
        } finally {
            // Fecha o scanner para liberar recursos
            scanner.close();
        }
    }
}