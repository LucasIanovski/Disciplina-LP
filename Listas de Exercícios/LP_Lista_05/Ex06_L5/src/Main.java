 public class Main {
    public static void main(String[] args) {
        // Cria vetor para ser invertido usando apenas uma variável auxiliar
        int[] vetor = {1,2,3,4,5,6,7}; int aux;
        // Inversão usando troca entre extremos
        for (int i = 0; i < vetor.length / 2; i++) {
            aux = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = aux;
        }
        // Imprime vetor já invertido
        for (int numero : vetor) System.out.print(numero + " ");
    }
}


