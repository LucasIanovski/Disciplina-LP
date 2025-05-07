import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
    }
}
