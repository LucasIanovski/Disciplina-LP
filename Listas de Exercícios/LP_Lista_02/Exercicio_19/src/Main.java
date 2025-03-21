import java.util.InputMismatchException;
import java.util.Scanner;

class ResolveEquacaoSegundoGrau {
    public static void main(String[] args) {
        // Declaração das variáveis para armazenar os coeficientes A, B e C
        double a = 0, b = 0, c = 0;

        // Configura o scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira os coeficientes
        System.out.println("Digite os coeficientes A, B e C da equação do segundo grau (ax² + bx + c = 0):");

        try {
            // Lê o coeficiente A
            System.out.print("Coeficiente A: ");
            a = scanner.nextDouble();

            // Lê o coeficiente B
            System.out.print("Coeficiente B: ");
            b = scanner.nextDouble();

            // Lê o coeficiente C
            System.out.print("Coeficiente C: ");
            c = scanner.nextDouble();

            // Verifica se A é zero (equação não é do segundo grau)
            if (a == 0) {
                System.out.println("Erro: O coeficiente A não pode ser zero (não é uma equação do segundo grau).");
            } else {
                // Calcula o discriminante (delta)
                double delta = Math.pow(b, 2) - (4 * a * c);

                // Verifica a natureza das raízes
                if (delta > 0) {
                    // Duas raízes reais e distintas
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("A equação tem duas raízes reais e distintas:");
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                } else if (delta == 0) {
                    // Uma raiz real (raiz dupla)
                    double x = -b / (2 * a);
                    System.out.println("A equação tem uma raiz real (raiz dupla):");
                    System.out.println("x = " + x);
                } else {
                    // Raízes complexas
                    System.out.println("A equação não tem raízes reais (as raízes são complexas).");
                }
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