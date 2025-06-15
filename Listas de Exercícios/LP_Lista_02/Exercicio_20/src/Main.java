import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x1, x2, a, b, c;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a raiz x1:");
        x1 = in.nextDouble();

        System.out.println("Digite a raiz x2:");
        x2 = in.nextDouble();

        a = 1;
        b = -(x1 + x2);
        c = x1 * x2;

        System.out.println("A equacao do segundo grau formada e:");
        System.out.println("x^2 + (" + b + ")x + (" + c + ") = 0");
    }
}
