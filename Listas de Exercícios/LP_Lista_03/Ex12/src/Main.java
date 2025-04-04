import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, resultado;
        int opcao;

        // Entrada dos números para fazer a operação
        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();

        // Exibição do menu
        System.out.println("------------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Soma");
        System.out.println("    2. Subtração");
        System.out.println("    3. Multiplicação");
        System.out.println("    4. Divisão");
        System.out.println("------------------------------");
        System.out.print("Escolha uma opção: ");
        opcao = input.nextInt();

        // switch para calcular a operação escolhida
        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + num1 + " x " + num2 + " = " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + num1 + " ÷ " + num2 + " = " + resultado);
                } else {
                    System.out.println("Erro: Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Erro: Opção inválida! Escolha um número entre 1 e 4.");
        }
    }
}
