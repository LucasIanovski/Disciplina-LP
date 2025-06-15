public class Main {
    public static void main(String[] args) {
        // Criação de um vetor com 10 posições já preenchidas
        int[] vetor = {1,2,3,4,5,6,7,8,9,10};
        // Loop que percorre o vetor de trás pra frente
        for (int i = vetor.length - 1; i >= 0; i--) {
            // Imprime o valor atual do vetor
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}