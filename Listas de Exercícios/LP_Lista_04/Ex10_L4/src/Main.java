import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i, n, a = 0, b = 1, c;

        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

    }
}
