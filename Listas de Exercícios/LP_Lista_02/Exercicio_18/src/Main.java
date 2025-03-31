import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, x;

        // Configura o Scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o coeficiente angular:");
        a= in.nextDouble();

        System.out.println("Digite o coeficiente linear:");
        b= in.nextDouble();

        x = -b/a;

        System.out.printf("A solução da equação %.2fx + %.2f = 0 é: x = %.2f\n", a, b, x);

    }
}
