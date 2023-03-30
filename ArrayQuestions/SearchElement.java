public class SearchElement {

    public static int func(int a[], int k) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == k)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        int a[] = { 2, 3, 0, 1, 4, 5 };
        int k = 4;

        int result = func(a, k);

        System.out.println(result);
    }

}
