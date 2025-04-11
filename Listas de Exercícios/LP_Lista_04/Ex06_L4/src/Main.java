import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, temp;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        for (int i = a + 1; i < b; i++) {
            System.out.println(i);
        }
    }
}
