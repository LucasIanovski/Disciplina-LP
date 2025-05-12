public class Main {
    public static void main(String[] args) {
        // Cria o vetor original e outro para armazenar a cópia invertida
        int[] v1 = {0,1,2,3,4,5,6,7,8,9}, v2 = new int[v1.length];
        // Copia os valores do v1 para v2 de forma invertida
        for (int i = 0; i < v1.length; i++) v2[i] = v1[v1.length - 1 - i];
        // Imprime o vetor original
        System.out.print("V1: ");
        for (int numero : v1) System.out.print(numero + " ");
        // Imprime o vetor invertido
        System.out.print("\nV2: ");
        for (int numero : v2) System.out.print(numero + " ");
    }
}
