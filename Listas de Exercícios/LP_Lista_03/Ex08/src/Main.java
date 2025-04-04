import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número " + num + " é PAR.");
        } else {
            System.out.println("O número " + num + " é ÍMPAR.");
        }
    }
}
