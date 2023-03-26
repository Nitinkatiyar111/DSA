public class LargestElement {

    public static void LargeElement(int a[], int largest) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {

        int a[] = { 1, 2, 4, 5, 7, 9, 12, 1 };
        int largest = a[0];

        LargeElement(a, largest);
    }

}
