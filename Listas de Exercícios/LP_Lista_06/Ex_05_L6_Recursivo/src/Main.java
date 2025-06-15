import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Exemplo de array ordenado
        int[] vetor = {2, 4, 6, 8, 10, 12, 14, 16};

        System.out.print("Digite o número para buscar: ");
        int alvo = in.nextInt();

        int pos = buscaBinariaRec(vetor, alvo, 0, vetor.length - 1);

        if (pos == -1) {
            System.out.println("Elemento não encontrado.");
        } else {
            System.out.println("Elemento encontrado na posição: " + pos);
        }
    }

    // Busca binária recursiva
    public static int buscaBinariaRec(int[] arr, int alvo, int inicio, int fim) {
        if (inicio > fim) {
            return -1; // Não encontrou
        }

        int meio = (inicio + fim) / 2;

        if (arr[meio] == alvo) {
            return meio; // Encontrou o elemento
        } else if (arr[meio] < alvo) {
            // Busca na metade direita
            return buscaBinariaRec(arr, alvo, meio + 1, fim);
        } else {
            // Busca na metade esquerda
            return buscaBinariaRec(arr, alvo, inicio, meio - 1);
        }
    }
}
