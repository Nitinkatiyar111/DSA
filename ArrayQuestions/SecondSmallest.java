public class SecondSmallest {

    public static void func(int a[], int n) {
        int smallest = a[0];
        int ssmallest = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {

            if (a[i] < smallest) {
                ssmallest = smallest;
                smallest = a[i];

            }

            else if (a[i] != smallest && a[i] < ssmallest) {
                ssmallest = a[i];
            }
        }
        System.out.println(ssmallest);
    }

    public static void main(String[] args) {

        int a[] = { 2, 1, 3, 4, 9, 6, 5 };
        int n = a.length;

        func(a, n);
    }

}
