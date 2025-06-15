import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double celsius, fahrenheit;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius:");
        celsius = in.nextDouble();

        fahrenheit = (celsius * 1.8) + 32;
        System.out.println(celsius + " graus Celsius equivalem a " + fahrenheit + " graus Fahrenheit");
    }
}
