import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {

    public static void func(int i, int a[], int n) {
        if (i >= n)
            return;
        int temp = a[i];
        a[i] = a[n - 1];
        a[n - 1] = temp;
        func(i + 1, a, n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        func(0, a, n);
        System.out.println(Arrays.toString(a));
    }
}
