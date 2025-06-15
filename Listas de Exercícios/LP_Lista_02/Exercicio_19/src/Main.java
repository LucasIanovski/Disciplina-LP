import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double numero, raiz;  // Declaração das variáveis para armazenar o número e sua raiz quadrada

        Scanner input = new Scanner(System.in);  // Cria um objeto Scanner para ler a entrada do usuário

        System.out.println("Digite um número para calcular a raiz quadrada:");
        numero = input.nextDouble();  // Lê o número digitado pelo usuário

        // Calcula a raiz quadrada usando Math.sqrt
        raiz = Math.sqrt(numero);

        // Exibe o resultado formatado
        System.out.println("A raiz quadrada de " + numero + " é: " + raiz);

        // Nota: Se o número for negativo, Math.sqrt retorna NaN (Not a Number)
    }
}
