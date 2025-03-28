import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double M_s, Km_h;

        Scanner in = new Scanner(System.in); // Configura o Scanner

        System.out.println("Digite a velocidade em M_s:");
        M_s = in.nextDouble();  // Lê a velocidade em M_s

        Km_h = (M_s * 3.6);  // Converte km/h para m/s

        System.out.println("Velocidade em M/s: " + Km_h);  // Exibe a velocidade em M/s
        System.out.println("Velocidade em Km/h: " + M_s);  // Exibe a conversão para Km/h
    }
}