import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     //Scanner é a classe usada para entrada de dados.
        double n1, n2, media; //declaração das variaveis.

        System.out.println("Digite a primeira nota: ");
        n1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        n2 = input.nextDouble();

        if (n1 < 10 || n1 > 100 || n2 < 10 || n2 > 100) {
            System.out.println("Erro: As notas devem estar entre 10 e 100");
        } else {
            media = (n1 + n2) / 2;
            System.out.println("Média: " + media);

            if (media < 50) {
                System.out.println("Reprovado");
            } else {
                System.out.println("Aprovado");
            }
        }
    }
}