import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] m = new int[5][5];
        int i, j, soma, maiorLinha = Integer.MIN_VALUE, maiorColuna = Integer.MIN_VALUE;
        Scanner in = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print("m[" + i + "][" + j + "] = ");
                m[i][j] = in.nextInt();
            }
        }

        for (i = 0; i < 5; i++) {
            soma = 0;
            for (j = 0; j < 5; j++) {
                soma += m[i][j];
            }
            if (soma > maiorLinha) maiorLinha = soma;
        }

        for (j = 0; j < 5; j++) {
            soma = 0;
            for (i = 0; i < 5; i++) {
                soma += m[i][j];
            }
            if (soma > maiorColuna) maiorColuna = soma;
        }

        System.out.println("Maior soma das linhas: " + maiorLinha);
        System.out.println("Maior soma das colunas: " + maiorColuna);
    }
}
