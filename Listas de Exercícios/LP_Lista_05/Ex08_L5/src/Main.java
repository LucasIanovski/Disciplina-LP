public class Main {
    public static void main(String[] args) {
        // Cria matriz 5x5
        int[][] matriz = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        // Imprime a diagonal principal
        for (int i = 0; i < matriz.length; i++) System.out.print(matriz[i][i] + " ");
    }
}