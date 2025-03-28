import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double N1, N2, media;

        Scanner in = new Scanner(System.in); // Configura o Scanner

        System.out.println("Digite a primeira nota (N1):");
        N1 = in.nextDouble();  // Lê a primeira nota

        System.out.println("Digite a segunda nota (N2):");
        N2 = in.nextDouble();  // Lê a segunda nota

        media = (N1 + N2) / 2;  // Calcula a média das duas notas

        System.out.println("A média das notas é: " + media);  // Exibe o resultado


    }
}
