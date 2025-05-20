import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = in.nextInt();

        int resultado = fatorial(n);
        if (resultado != -1) {
            System.out.println("Fatorial de " + n + " é: " + resultado);
        }
    }

    public static int fatorial(int n) {
        if (n < 0) {
            System.out.println("Erro: número negativo não tem fatorial.");
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * fatorial(n - 1);
    }
}

// correcao feita pelo professor
//public static int somarAntecessores(int n) {
//  if(n==1)
//      return 1;
//  return n + somaAntecessores (n: n-1);
// }
// }