public class Main {
    public static void main(String[] args) {
        int[] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, v2 = new int[10];
        int i;
        for (i = 0; i < v1.length; i++) {
            v2[i] = v1[v1.length - 1 - i];
        }

        for (i = 0; i < v1.length; i++) {
            System.out.println("v1[" + i + "] = " + v1[i] + ", v2[" + i + "] = " + v2[i]);
        }
    }
}
