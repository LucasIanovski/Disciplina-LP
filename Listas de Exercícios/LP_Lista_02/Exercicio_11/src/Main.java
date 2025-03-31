import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double celsius, resultado;  // nome da variável

        Scanner in = new Scanner(System.in); // Configura o Scanner

        System.out.println("Digite a temperatura em Celsius:");
        celsius = in.nextDouble();  // Lê a primeira medida

        resultado = (celsius * 9/5) + 32;  // Conversão para Fahrenheit

        System.out.println("A temperatura em Fahrenheit é: " + resultado + "°F");  // Exibe o resultado
    }
}