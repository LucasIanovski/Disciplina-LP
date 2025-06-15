import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // Cria scanner para entrada

        System.out.println("Digite um número inteiro positivo:");
        int n = in.nextInt();  // Lê número

        if (n <= 0) {  // Verifica se número é válido
            System.out.println("Erro: número deve ser maior que zero.");
        } else {
            int resultado = somaRecursiva(n);  // Chama função recursiva para somar
            System.out.println("A soma de 1 até " + n + " é: " + resultado);
        }
    }

    // Função recursiva para somar de 1 até n
    public static int somaRecursiva(int n) {
        if (n == 1) {  // Caso base: se n é 1 retorna 1
            return 1;
        } else {
            return n + somaRecursiva(n - 1);  // Chamada recursiva somando n com soma dos anteriores
        }
    }
}
