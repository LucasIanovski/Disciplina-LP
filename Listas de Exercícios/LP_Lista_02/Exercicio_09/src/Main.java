import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km, milhas;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a distancia em Km:");
        km = in.nextDouble();

        milhas = km / 1.60934;
        System.out.println(km + " Km equivalem a " + milhas + " milhas");
    }
}
