import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i;
        boolean primo = true;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        if (num <= 1) primo = false;
        else {
            for (i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) System.out.println(num + " é primo.");
        else System.out.println(num + " não é primo.");
    }
}

