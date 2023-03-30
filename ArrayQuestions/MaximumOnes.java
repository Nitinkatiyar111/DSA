public class MaximumOnes {

    public static int func(int a[]) {

        int n = a.length;
        int max = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (a[i] == 1) {
                count++;
                max = Math.max(max, count);

            } else {
                count = 0;
            }

        }

        return max;
    }

    public static void main(String[] args) {

        int a[] = { 1, 1, 0, 1, 1, 1, 0, 1, 1 };

        int result = func(a);

        System.out.println(result);

    }

}
