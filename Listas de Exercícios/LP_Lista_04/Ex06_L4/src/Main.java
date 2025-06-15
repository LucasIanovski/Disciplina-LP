import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i, inicio, fim;

        System.out.print("Digite o primeiro número: ");
        inicio = in.nextInt();
        System.out.print("Digite o segundo número: ");
        fim = in.nextInt();


        if (inicio > fim) {
            int aux = inicio;
            inicio = fim;
            fim = aux;
        }


        for (i = inicio + 1; i < fim; i++) {
            // Exibe somente números naturais (0 ou positivos)
            if (i >= 0) {
                System.out.println(i);
            }
        }

    }
}
