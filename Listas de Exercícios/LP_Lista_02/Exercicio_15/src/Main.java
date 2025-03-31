import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double raio, altura, volume;

        // Configura o Scanner
        Scanner in = new Scanner(System.in);

        // Solicita o raio do cilindro
        System.out.println("Digite o raio do cilindro:");
        raio = in.nextDouble();

        // Solicita a altura do cilindro
        System.out.println("Digite a altura do cilindro:");
        altura = in.nextDouble();

        // Calcula o volume do cilindro
        volume = Math.PI * Math.pow(raio, 2) * altura;

        // Exibe o resultado
        System.out.printf("O volume do cilindro é: %.2f\n", volume); //%.2f é usado para formatar números de ponto flutuante com 2 casas decimais.

    }
}
