import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("Menu:");
        System.out.println("5 - Saldo");
        System.out.println("6 - Saque");
        System.out.println("7 - Depósito");
        System.out.println("8 - Transferência");
        System.out.println("9 - Sair");
        System.out.print("Escolha uma opção (5 a 9): ");
        opcao = input.nextInt();

        switch (opcao) {
            case 5:
                System.out.println("Você escolheu: Saldo");
                break;
            case 6:
                System.out.println("Você escolheu: Saque");
                break;
            case 7:
                System.out.println("Você escolheu: Depósito");
                break;
            case 8:
                System.out.println("Você escolheu: Transferência");
                break;
            case 9:
                System.out.println("Você escolheu: Sair");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}