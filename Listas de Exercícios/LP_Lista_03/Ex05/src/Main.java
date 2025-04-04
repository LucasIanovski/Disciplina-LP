import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2, media;

        System.out.print("Digite a primeira nota: ");
        n1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        n2 = input.nextDouble();

        if (n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10) {
            System.out.println("Erro: As notas devem estar entre 0 e 10.");
        } else {
            media = (n1 + n2) / 2;
            System.out.println("Média: " + media);

            if (media >= 8.5) {
                System.out.println("Conceito: A");
            } else if (media >= 7) {
                System.out.println("Conceito: B");
            } else if (media >= 5) {
                System.out.println("Conceito: C");
            } else {
                System.out.println("Conceito: D");
            }
        }
    }
}
