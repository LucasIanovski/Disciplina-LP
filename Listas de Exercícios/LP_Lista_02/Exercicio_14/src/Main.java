import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double base, altura, area;

        // Configura o Scanner
        Scanner in = new Scanner(System.in);

        // Solicita a base do triângulo
        System.out.println("Digite a base do triângulo:");
        base = in.nextDouble();

        // Solicita a altura do triângulo
        System.out.println("Digite a altura do triângulo:");
        altura = in.nextDouble();

        // Calcula a área do triângulo
        area = (base * altura) / 2;

        // Exibe o resultado
        System.out.printf("A área do triângulo retângulo é: %.2f\n", area); //%.2f é usado para formatar números de ponto flutuante com 2 casas decimais.

    }
}
