import java.util.Scanner;
<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicita dimensões das matrizes
        System.out.print("Linhas de A: "); int m = sc.nextInt();
        System.out.print("Colunas de A: "); int n = sc.nextInt();
        System.out.print("Linhas de B: "); int p = sc.nextInt();
        System.out.print("Colunas de B: "); int q = sc.nextInt();
        // Verifica se a multiplicação é possível
        if (n != p) { System.out.println("Multiplicação inválida"); return; }
        // Declara as matrizes com os tamanhos informados
        int[][] A = new int[m][n], B = new int[p][q], C = new int[m][q];
        // Preenche a matriz A
        System.out.println("Digite A:");
        for (int i = 0; i < m; i++) for (int j = 0; j < n; j++) A[i][j] = sc.nextInt();
        // Preenche a matriz B
        System.out.println("Digite B:");
        for (int i = 0; i < p; i++) for (int j = 0; j < q; j++) B[i][j] = sc.nextInt();
        // Calcula o produto das matrizes
        for (int i = 0; i < m; i++) for (int j = 0; j < q; j++) for (int k = 0; k < n; k++) C[i][j] += A[i][k] * B[k][j];
        // Exibe a matriz produto
        for (int[] linha : C) {
            for (int val : linha) System.out.print(val + " ");
=======

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
>>>>>>> e5e5bcc2632ca8c76d03b31d1ba15dc84a43596c
            System.out.println();
        }
    }
}
