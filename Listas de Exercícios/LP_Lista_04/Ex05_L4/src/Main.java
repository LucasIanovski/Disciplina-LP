import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        long fatorial = 1;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + n + " é: " + fatorial);
    }
}
