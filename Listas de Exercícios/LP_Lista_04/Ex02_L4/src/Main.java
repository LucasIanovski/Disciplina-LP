import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i, numero, maior, menor;

        System.out.print("Digite o 1º número: ");
        numero = in.nextInt();
        maior = numero;
        menor = numero;

        for (i = 2; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = in.nextInt();
            if (numero > maior) maior = numero;
            if (numero < menor) menor = numero;
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

    }
}
