import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, num;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            num = sc.nextInt();

            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
