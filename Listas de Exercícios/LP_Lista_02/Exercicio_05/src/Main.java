import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Km_h, M_s;

        Scanner in = new Scanner(System.in); // Configura o Scanner

        System.out.println("Digite a velocidade em km/h:");
        Km_h = in.nextDouble();  // Lê a velocidade em km/h

        M_s = (Km_h / 3.6);  // Converte km/h para m/s

        System.out.println("Velocidade em km/h: " + Km_h);  // Exibe a velocidade em km/h
        System.out.println("Velocidade em m/s: " + M_s);  // Exibe a conversão para m/s
    }
}


