import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i, numero, fatorial = 1;

        System.out.print("Digite um número para calcular o fatorial: ");
        numero = in.nextInt();

        for (i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + numero + " é " + fatorial);

    }
}
