import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] v = new int[10];
        int i, maior, menor, posMaior, posMenor;
        Scanner in = new Scanner(System.in);
        for (i = 0; i < v.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            v[i] = in.nextInt();
        }

        maior = menor = v[0];
        posMaior = posMenor = 0;

        for (i = 1; i < v.length; i++) {
            if (v[i] > maior) {
                maior = v[i];
                posMaior = i;
            } else if (v[i] < menor) {
                menor = v[i];
                posMenor = i;
            }
        }

        System.out.println("Maior valor: " + maior + " na posição " + posMaior);
        System.out.println("Menor valor: " + menor + " na posição " + posMenor);
    }
}
