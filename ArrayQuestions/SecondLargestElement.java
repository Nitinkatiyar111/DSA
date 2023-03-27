public class SecondLargestElement {

    public static int func(int a[], int n) {
        int largest = a[0];
        int secondLargest = -1;

        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] < largest && a[i] > secondLargest) {
                secondLargest = a[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {

        int a[] = { 2, 1, 6, 7, 8, 9, 3 };
        int n = a.length;

        int result = func(a, n);
        System.out.println(result);
    }
}