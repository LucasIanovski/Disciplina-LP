import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double vInicial, aceleracao, tempo, vFinal;

        // Configura o Scanner
        Scanner in = new Scanner(System.in);

        // Solicita a velocidade inicial
        System.out.println("Digite a velocidade inicial (em m/s):");
        vInicial = in.nextDouble();

        // Solicita a aceleração
        System.out.println("Digite a aceleração (em m/s²):");
        aceleracao = in.nextDouble();

        // Solicita o tempo de percurso
        System.out.println("Digite o tempo de percurso (em segundos):");
        tempo = in.nextDouble();

        // Calcula a velocidade final
        vFinal = vInicial + aceleracao * tempo;

        // Exibe o resultado
        System.out.printf("A velocidade final do corpo é: %.2f m/s\n", vFinal);

    }
}
