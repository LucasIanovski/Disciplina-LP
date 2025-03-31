import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double raio, area;

        Scanner in = new Scanner(System.in); // Configura o Scanner

        System.out.println("Digite o raio:");
        raio = in.nextDouble();  // Lê a primeira medida

        area = Math.PI*Math.pow(raio,2);

        // Exibe o resultado
        System.out.printf("A área do círculo é: %.2f\n", area);

    }
}
