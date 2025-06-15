import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = in.nextInt();

        int resultado = fatorial(n);
        if (resultado != -1) {
            System.out.println("Fatorial de " + n + " é: " + resultado);
        }
    }

    // Função recursiva que calcula o fatorial
    public static int fatorial(int n) {
        // Se número negativo, não tem fatorial
        if (n < 0) {
            System.out.println("Erro: número negativo não tem fatorial.");
            return -1;
        }

        // Caso base: fatorial de 0 ou 1 é 1
        if (n == 0 || n == 1) {
            return 1;
        }

        // Chamada recursiva: n * fatorial do anterior
        return n * fatorial(n - 1);
    }
}
