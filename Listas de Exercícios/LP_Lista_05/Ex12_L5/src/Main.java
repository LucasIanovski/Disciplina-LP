public class Main {
    public static void main(String[] args) {
        // Cria matriz 3x3
        int[][] m = {{2,4,1},{3,1,5},{7,2,6}};
        // Calcula determinante usando regra de Sarrus (expansão de Laplace)
        int det = m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1]) - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0]) + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
        // Exibe o determinante
        System.out.println("Determinante: " + det);
    }
}
