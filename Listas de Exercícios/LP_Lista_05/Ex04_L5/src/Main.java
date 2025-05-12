import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10]; int maior, menor, posMaior = 0, posMenor = 0;
        Scanner sc = new Scanner(System.in);
        // Preenche o vetor com números digitados pelo usuário
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            vetor[i] = sc.nextInt();
        }
        // Assume que o primeiro número é o maior e o menor
        maior = menor = vetor[0];
        // Verifica maior e menor valor e suas posições
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) { maior = vetor[i]; posMaior = i; }
            if (vetor[i] < menor) { menor = vetor[i]; posMenor = i; }
        }
        // Exibe os resultados
        System.out.println("Maior valor: " + maior + " na posição " + posMaior);
        System.out.println("Menor valor: " + menor + " na posição " + posMenor);
    }
}