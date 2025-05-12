import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Vetor fixo com 10 números
        int[] vetor = {3,6,1,8,4,7,9,2,0,5}; boolean encontrado = false;
        Scanner sc = new Scanner(System.in);
        // Solicita número ao usuário
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        // Percorre o vetor procurando o número digitado
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) { // Se encontrar, mostra a posição
                System.out.println("Valor encontrado na posição " + i);
                encontrado = true; // Marca como encontrado
                break; // Interrompe o loop
            }
        }
        // Se não achou, informa ao usuário
        if (!encontrado) System.out.println("Valor não encontrado.");
    }
}