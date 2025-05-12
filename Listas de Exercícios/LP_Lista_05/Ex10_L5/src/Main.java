public class Main {
    public static void main(String[] args) {
        // Declara as duas matrizes A e B e matriz resultado C
        int[][] A = {{1,2},{3,4},{5,6}}, B = {{1,2},{3,4}}, C = new int[3][2];
        // Multiplicação de matrizes (produto)
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 2; j++)
                C[i][j] = A[i][0] * B[0][j] + A[i][1] * B[1][j];
        // Exibe o resultado da multiplicação
        for (int[] linha : C) {
            for (int valor : linha) System.out.print(valor + " ");
            System.out.println();
        }
    }
}