import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i, j, respostaUsuario, resultadoCorreto;

        for (i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i);
            for (j = 1; j <= 10; j++) {
                System.out.print(i + " x " + j + " = ");
                respostaUsuario = in.nextInt();

                resultadoCorreto = i * j;
                if (respostaUsuario == resultadoCorreto) {

                }
            }
            System.out.println();
        }

    }
}
