import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i, j, resposta, resultado;
        String opcao;

        do {
            boolean acertou = true;

            for (i = 1; i <= 10 && acertou; i++) {
                for (j = 1; j <= 10 && acertou; j++) {
                    System.out.print(i + " x " + j + " = ");
                    resposta = in.nextInt();
                    resultado = i * j;

                    if (resposta != resultado) {
                        System.out.println("Você errou! Fim de jogo.");
                        acertou = false;
                    }
                }
            }

            if (acertou) {
                System.out.println("Parabéns! Você completou toda a tabuada!");
            }

            System.out.print("Deseja jogar novamente? (s/n): ");
            opcao = in.next();

        } while (opcao.equalsIgnoreCase("s"));

    }
}
