import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Cria matriz 3x3
        int[][] m = {{2,4,1},{3,1,5},{7,2,6}};
        // Calcula determinante usando regra de Sarrus (expansão de Laplace)
        int det = m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1]) - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0]) + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
        // Exibe o determinante
        System.out.println("Determinante: " + det);
=======
        int[][] m = new int[3][3];
        int i, j, determinante;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite os valores da matriz 3x3:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("m[" + i + "][" + j + "] = ");
                m[i][j] = in.nextInt();
            }
        }

        determinante = m[0][0] * m[1][1] * m[2][2]
                + m[0][1] * m[1][2] * m[2][0]
                + m[0][2] * m[1][0] * m[2][1]
                - m[0][2] * m[1][1] * m[2][0]
                - m[0][0] * m[1][2] * m[2][1]
                - m[0][1] * m[1][0] * m[2][2];

        System.out.println("Determinante: " + determinante);
>>>>>>> e5e5bcc2632ca8c76d03b31d1ba15dc84a43596c
    }
}
