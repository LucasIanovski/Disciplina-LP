import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i, numero;

        System.out.print("Digite um número para ver a tabuada: ");
        numero = in.nextInt();

        for (i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

    }
}
