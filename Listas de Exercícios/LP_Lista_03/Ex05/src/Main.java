import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, media;  // Declaração das variáveis

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        n1 = input.nextDouble();  // Lê a primeira nota

        System.out.println("Digite a segunda nota:");
        n2 = input.nextDouble();  // Lê a segunda nota

        media = (n1 + n2) / 2;  // Calcula a média

        // Verifica o conceito com base na média
        if (media >= 8.5) {
            System.out.println("Conceito A");
        } else if (media >= 7) {
            System.out.println("Conceito B");
        } else if (media >= 5) {
            System.out.println("Conceito C");
        } else {
            System.out.println("Conceito D");
        }
    }
}
