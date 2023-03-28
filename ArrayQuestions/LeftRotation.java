import java.util.Arrays;

public class LeftRotation {

    public static void func(int[] a, int n, int d) {

        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = a[i];
        }

        for (int i = d; i < n; i++) {
            a[i - d] = a[i];
        }
        for (int i = n - d; i < n; i++) {
            a[i] = temp[i - (n - d)];
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {

        int a[] = { 2, 3, 4, 1, 5, 6 };
        int n = a.length;
        int d = 2;

        func(a, n, d);
    }

}
