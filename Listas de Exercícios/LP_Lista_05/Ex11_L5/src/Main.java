import java.util.Scanner;
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
            System.out.println();
        }
    }
}