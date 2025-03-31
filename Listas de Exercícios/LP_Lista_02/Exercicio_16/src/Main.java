import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double raio, altura, volume;

        // Configura o Scanner
        Scanner in = new Scanner(System.in);

        // Solicita o raio do cone
        System.out.println("Digite o raio da base do cone:");
        raio = in.nextDouble();

        // Solicita a altura do cone
        System.out.println("Digite a altura do cone:");
        altura = in.nextDouble();

        // Calcula o volume do cone
        volume = (1.0 / 3) * Math.PI * Math.pow(raio, 2) * altura;

        // Exibe o resultado
        System.out.printf("O volume do cone é: %.2f\n", volume);

    }
}
