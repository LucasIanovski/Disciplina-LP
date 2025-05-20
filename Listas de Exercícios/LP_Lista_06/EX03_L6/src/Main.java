import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Entrada do nome
        System.out.print("Informe seu nome: ");
        String nome = in.next();

        // Exibe o menu
        gerarMenu(nome);

        // Entrada dos números
        System.out.print("Digite a base (x): ");
        int x = in.nextInt();

        System.out.print("Digite o expoente (y, deve ser >= 0): ");
        int y = in.nextInt();

        // Calcula a potência
        int resultado = potencia(x, y);

        // Exibe o resultado, se válido
        if (resultado != -1) {
            System.out.println("Resultado: " + x + " elevado a " + y + " é: " + resultado);
        }
    }

    // Função recursiva para calcular potência
    public static int potencia(int x, int y) {
        if (y < 0) { // se y for menor que zero  print
            System.out.println("Erro: o expoente deve ser maior ou igual a zero.");
            return -1;
        }

        if (y == 0) {
            return 1; // caso base
        }

        return x * potencia(x, y - 1); // chamada recursiva
    }

    // menu
    public static void gerarMenu(String nome) {
        System.out.println("\nBem-vindo, " + nome + "!");
        System.out.println("----- MENU -----");
        System.out.println("1. Calcular potência");
        System.out.println("2. (outras opções futuras)");
        System.out.println("-----------------\n");
    }
}
