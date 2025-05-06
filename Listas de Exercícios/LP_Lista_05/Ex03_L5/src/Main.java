import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] v = {3, 5, 7, 2, 8, 9, 1, 4, 6, 0};
        int i, n;
        boolean encontrado = false;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n = in.nextInt();

        for (i = 0; i < v.length; i++) {
            if (v[i] == n) {
                System.out.println("Valor encontrado na posição " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Valor não encontrado");
        }
    }
}
