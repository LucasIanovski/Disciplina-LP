import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Entrada da base x
        System.out.print("Digite a base (inteiro): ");
        int x = in.nextInt();

        // Entrada do expoente y deve ser maior ou igual 0
        System.out.print("Digite o expoente (inteiro >= 0): ");
        int y = in.nextInt();

        if (y < 0) {
            System.out.println("Erro: expoente deve ser maior ou igual a zero.");
            return;
        }

        int resultado = potenciaRecursiva(x, y);
        System.out.println(x + " elevado a " + y + " é: " + resultado);
    }

    // Função recursiva que calcula potência
    public static int potenciaRecursiva(int base, int expoente) {
        // Caso base: qualquer número elevado a 0 é 1
        if (expoente == 0) {
            return 1;
        }

        // Chamada recursiva
        return base * potenciaRecursiva(base, expoente - 1);
    }
}
