import java.util.Arrays;

public class ZeroEndArray {

    public static void zerosToEnd(int a[]) {
        int n = a.length;
        int[] temp = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                temp[k] = a[i];
                k++;
            }
        }
        while (k < n) {
            temp[k] = 0;
            k++;
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {

        int a[] = { 1, 2, 0, 1, 0, 4, 0 };

        zerosToEnd(a);

    }

}
