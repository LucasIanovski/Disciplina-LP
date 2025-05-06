public class Main {
    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i;
        for (i = 0; i < v.length; i++) {
            if (i % 2 == 0) {
                v[i] += 2;
            } else {
                v[i] *= 2;
            }
            System.out.println(v[i]);
        }
    }
}
