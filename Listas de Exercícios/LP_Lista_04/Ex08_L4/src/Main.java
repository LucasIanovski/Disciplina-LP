import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i, numero, divisores = 0;

        System.out.print("Digite um número: ");
        numero = in.nextInt();

        for (i = 1; i <= numero; i++) {
            if (numero % i == 0) divisores++;
        }

        if (divisores == 2) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

    }
}
