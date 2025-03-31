import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double N1, N2, media;  // Declaração das variáveis

        Scanner in = new Scanner(System.in); // Configura o Scanner

        System.out.println("Digite a primeira nota: ");
        N1 = in.nextDouble();  // Lê a primeira nota

        System.out.println("Digite a segunda nota: ");
        N2 = in.nextDouble();  // Lê a segunda nota

        // Verifica se as notas estão entre 0 e 10
        if (N1 < 0 || N1 > 10 || N2 < 0 || N2 > 10) {
            System.out.println("As notas devem estar entre 0 e 10.");
        } else {
            // Calcula a média ponderada
            media = (N1 * 1 + N2 * 2) / (1 + 2);

            // Exibe o resultado
            System.out.printf("A média ponderada é: %.2f\n", media);
        }

    }
}
