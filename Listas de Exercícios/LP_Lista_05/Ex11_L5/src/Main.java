import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, j, k, linhasA, colunasA, linhasB, colunasB;
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz A: ");
        linhasA = in.nextInt();
        System.out.print("Digite o número de colunas da matriz A: ");
        colunasA = in.nextInt();

        System.out.print("Digite o número de linhas da matriz B: ");
        linhasB = in.nextInt();
        System.out.print("Digite o número de colunas da matriz B: ");
        colunasB = in.nextInt();

        if (colunasA != linhasB) {
            System.out.println("Multiplicação impossível: colunas de A devem ser iguais às linhas de B.");
            return;
        }

        int[][] A = new int[linhasA][colunasA];
        int[][] B = new int[linhasB][colunasB];
        int[][] C = new int[linhasA][colunasB];

        System.out.println("Digite os valores da matriz A:");
        for (i = 0; i < linhasA; i++) {
            for (j = 0; j < colunasA; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = in.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz B:");
        for (i = 0; i < linhasB; i++) {
            for (j = 0; j < colunasB; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = in.nextInt();
            }
        }

        for (i = 0; i < linhasA; i++) {
            for (j = 0; j < colunasB; j++) {
                C[i][j] = 0;
                for (k = 0; k < colunasA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matriz produto:");
        for (i = 0; i < linhasA; i++) {
            for (j = 0; j < colunasB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
