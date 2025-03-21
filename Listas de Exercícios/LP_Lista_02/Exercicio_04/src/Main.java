import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaração das variáveis para armazenar as notas
        double note1, note2, average;

        // Solicita ao usuário que insira as duas notas
        System.out.println("Write the first note: ");
        System.out.println("Write the second note: ");

        // Configura o scanner para ler os dados que o usuário insere no teclado
        Scanner in = new Scanner(System.in);

        // Lê a primeira nota
        note1 = in.nextDouble();

        // Lê a segunda nota
        note2 = in.nextDouble();

        // Calcula a média das duas notas
        average = (note1 + note2) / 2;

        // Exibe o resultado
        System.out.println("The average of " + note1 + " and " + note2 + " is: " + average);

        // Fecha o scanner para liberar recursos
        in.close();
    }
}