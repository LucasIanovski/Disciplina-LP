import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2, media, recuperacao, media2;

        System.out.println("Digite a primeira nota: ");
        n1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        n2 = input.nextDouble();

        if (n1 < 10 || n1 > 100 || n2 < 10 || n2 > 100) {
            System.out.println("Erro: As notas devem estar entre 10 e 100");
        } else {
            media = (n1 + n2) / 2;
            System.out.println("Média: " + media);

            if (media >= 50) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Nota insuficiente. Digite a nota da recuperação: ");
                recuperacao = input.nextDouble();

                media2 = (media + recuperacao) / 2;
                System.out.println("Nova média: " + media2);

                if (media2 >= 50) {
                    System.out.println("Aprovado!");
                } else {
                    System.out.println("Reprovado!");
                }
            }
        }
    }
}